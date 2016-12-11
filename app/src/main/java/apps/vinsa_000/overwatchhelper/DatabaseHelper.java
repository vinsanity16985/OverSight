package apps.vinsa_000.overwatchhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vinsa on 11/4/2016.
 * A helper class for the creation and upgrading of the Database
 */

public class DatabaseHelper extends SQLiteOpenHelper implements Database.DatabasePath{
    public String DATABASE_PATH = "";

    public DatabaseHelper(Context context){
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
        DATABASE_PATH = context.getDatabasePath(DatabaseContract.DATABASE_NAME).getPath();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create Tables
        db.execSQL(DatabaseContract.HeroTable.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop Tables
        db.execSQL(DatabaseContract.HeroTable.DELETE_TABLE);
        onCreate(db);
    }


    @Override
    public String getDatabasePath() {
        return DATABASE_PATH;
    }
}
