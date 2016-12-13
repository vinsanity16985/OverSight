package apps.vinsa_000.overwatchhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by vinsa on 11/4/2016.
 * A helper class for the creation and upgrading of the Database
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public String DATABASE_PATH = "";

    public DatabaseHelper(Context context){
        super(context, DatabaseContract.DATABASE_NAME, null, DatabaseContract.DATABASE_VERSION);
        DATABASE_PATH = context.getDatabasePath(DatabaseContract.DATABASE_NAME).getPath();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Create Tables
        db.execSQL(DatabaseContract.HeroTable.CREATE_HERO_TABLE);
        db.execSQL(DatabaseContract.PrimaryTable.CREATE_PRIMARY_TABLE);
        db.execSQL(DatabaseContract.SecondaryTable.CREATE_SECONDARY_TABLE);
        db.execSQL(DatabaseContract.PassiveTable.CREATE_PASSIVE_TABLE);
        db.execSQL(DatabaseContract.Skill1Table.CREATE_SKILL1_TABLE);
        db.execSQL(DatabaseContract.Skill2Table.CREATE_SKILL2_TABLE);
        db.execSQL(DatabaseContract.UltTable.CREATE_ULT_TABLE);
        db.execSQL(DatabaseContract.OptionalTable.CREATE_OPTIONAL_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop Tables
        db.execSQL(DatabaseContract.HeroTable.DELETE_HERO_TABLE);
        db.execSQL(DatabaseContract.PrimaryTable.DELETE_PRIMARY_TABLE);
        db.execSQL(DatabaseContract.SecondaryTable.DELETE_SECONDARY_TABLE);
        db.execSQL(DatabaseContract.PassiveTable.DELETE_PASSIVE_TABLE);
        db.execSQL(DatabaseContract.Skill1Table.DELETE_SKILL1_TABLE);
        db.execSQL(DatabaseContract.Skill2Table.DELETE_SKILL2_TABLE);
        db.execSQL(DatabaseContract.UltTable.DELETE_ULT_TABLE);
        db.execSQL(DatabaseContract.OptionalTable.DELETE_OPTIONAL_TABLE);
        onCreate(db);
    }
}
