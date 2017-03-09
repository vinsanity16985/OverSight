package apps.vinsa_000.overwatchhelper.Activities;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

import apps.vinsa_000.overwatchhelper.Database.Database;
import apps.vinsa_000.overwatchhelper.Database.DatabaseContract;
import apps.vinsa_000.overwatchhelper.Database.DatabaseHelper;
import apps.vinsa_000.overwatchhelper.Utils.NetworkUtils;
import apps.vinsa_000.overwatchhelper.Utils.XMLParser;

//TODO: Download XML from external site
public class SplashActivity extends AppCompatActivity {

    private static final String TAG = "SplashActivity";

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;

        NetworkUtils network = new NetworkUtils(this);

        boolean readyToParse = network.getSuccessfulDownload();

        if(readyToParse){
            try{
                Thread parsingThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            XMLParser parser = new XMLParser(context);
                            File xml = new File(getCacheDir().getPath() + File.separator + "cFile.xml");
                            Database db = new Database(context, parser.parse(xml));
                        }
                        catch(Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                parsingThread.run();

                parsingThread.join();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }




        /*----------TEST READING VALUES----------*/
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        //Not getting correct columns
        Cursor cursor = db.rawQuery("SELECT * FROM " + DatabaseContract.PrimaryItemTable.TABLE_NAME, null);
        Cursor cursor1 = db.rawQuery("SELECT * FROM " + DatabaseContract.SecondaryItemTable.TABLE_NAME, null);
        Cursor cursor2 = db.rawQuery("SELECT * FROM " + DatabaseContract.PassiveItemTable.TABLE_NAME, null);
        Cursor cursor3 = db.rawQuery("SELECT * FROM " + DatabaseContract.Skill1ItemTable.TABLE_NAME, null);
        Cursor cursor4 = db.rawQuery("SELECT * FROM " + DatabaseContract.Skill2ItemTable.TABLE_NAME, null);
        Cursor cursor5 = db.rawQuery("SELECT * FROM " + DatabaseContract.UltItemTable.TABLE_NAME, null);
        Cursor cursor6 = db.rawQuery("SELECT * FROM " + DatabaseContract.OptionalItemTable.TABLE_NAME, null);

//        for(int i = 0; i < cursor.getCount(); i++){
//            Log.d(TAG, cursor.getString(cursor.getColumnIndex(DatabaseContract.PrimaryItemTable.TITLE_COL2)));
//            cursor.moveToNext();
//        }

        Log.d(TAG, cursor.getCount() + "");
        Log.d(TAG, cursor1.getCount() + "");
        Log.d(TAG, cursor2.getCount() + "");
        Log.d(TAG, cursor3.getCount() + "");
        Log.d(TAG, cursor4.getCount() + "");
        Log.d(TAG, cursor5.getCount() + "");
        Log.d(TAG, cursor6.getCount() + "");

        /*--------------------*/

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    private boolean databaseExists(){
        File dbFile = getDatabasePath(DatabaseContract.DATABASE_NAME);
        return dbFile.exists();
    }

}
