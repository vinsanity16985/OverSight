package apps.vinsa_000.overwatchhelper;

import android.database.sqlite.SQLiteDatabase;

/**
 * Created by vinsa on 11/6/2016.
 */

public class Database {

    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;
    private String DB_PATH;

    public interface DatabasePath{
        public String getDatabasePath();
    }
    // TODO: Get the database path from DBHelper
    private Database(){}

    public void openDatabase(){
        db = SQLiteDatabase.openDatabase("",null,SQLiteDatabase.OPEN_READONLY);
    }
}
