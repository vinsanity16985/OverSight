package apps.vinsa_000.overwatchhelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by vinsa on 11/6/2016.
 */

public class Database {

    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public Database(Context context){
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();

        //Genji
        insertBasicInfo(context, Integer.toString(Constants.GENJI),
                "Genji Shimada",
                Integer.toString(context.getResources().getIdentifier("genji_icon", "drawable", context.getPackageName())),
                "35",
                "5'8",
                "3",
                "200",
                "0",
                "0",
                "200");


        //

    }

    //Will insert a Hero's basic info in the Hero Table
    private void insertBasicInfo(Context c, String id, String name, String icon, String age, String height, String difficulty, String health, String armor, String shield, String total){
        ContentValues values = new ContentValues();
        values.put(DatabaseContract.HeroTable.ID_COL1, id);
        values.put(DatabaseContract.HeroTable.NAME_COL2, name);
        values.put(DatabaseContract.HeroTable.ICON_COL3, icon);
        values.put(DatabaseContract.HeroTable.AGE_COL4, age);
        values.put(DatabaseContract.HeroTable.HEIGHT_COL5, height);
        values.put(DatabaseContract.HeroTable.DIFFICULTY_COL6, difficulty);
        values.put(DatabaseContract.HeroTable.HEALTH_COL7, health);
        values.put(DatabaseContract.HeroTable.ARMOR_COL8, armor);
        values.put(DatabaseContract.HeroTable.SHIELD_COL9, shield);
        values.put(DatabaseContract.HeroTable.TOTAL_COL10, total);
        long newRowId = db.insert(
                DatabaseContract.HeroTable.TABLE_NAME,
                null,
                values
        );
    }
}
