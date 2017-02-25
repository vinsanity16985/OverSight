package apps.vinsa_000.overwatchhelper.Database;

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
        //Drop Tables
        db.execSQL(DatabaseContract.HeroTable.DELETE_HERO_TABLE);

        db.execSQL(DatabaseContract.PrimaryBasicTable.DELETE_PRIMARY_BASIC_TABLE);
        db.execSQL(DatabaseContract.PrimaryItemTable.DELETE_PRIMARY_ITEM_TABLE);

        db.execSQL(DatabaseContract.SecondaryBasicTable.DELETE_SECONDARY_BASIC_TABLE);
        db.execSQL(DatabaseContract.SecondaryItemTable.DELETE_SECONDARY_ITEM_TABLE);

        db.execSQL(DatabaseContract.PassiveBasicTable.DELETE_PASSIVE_BASIC_TABLE);
        db.execSQL(DatabaseContract.PassiveItemTable.DELETE_PASSIVE_ITEM_TABLE);

        db.execSQL(DatabaseContract.Skill1BasicTable.DELETE_SKILL1_BASIC_TABLE);
        db.execSQL(DatabaseContract.Skill1ItemTable.DELETE_SKILL1_ITEM_TABLE);

        db.execSQL(DatabaseContract.Skill2BasicTable.DELETE_SKILL2_BASIC_TABLE);
        db.execSQL(DatabaseContract.Skill2ItemTable.DELETE_SKILL2_ITEM_TABLE);

        db.execSQL(DatabaseContract.UltBasicTable.DELETE_ULT_BASIC_TABLE);
        db.execSQL(DatabaseContract.UltItemTable.DELETE_ULT_ITEM_TABLE);

        db.execSQL(DatabaseContract.OptionalBasicTable.DELETE_OPTIONAL_BASIC_TABLE);
        db.execSQL(DatabaseContract.OptionalItemTable.DELETE_OPTIONAL_ITEM_TABLE);


        //Create Tables
        db.execSQL(DatabaseContract.HeroTable.CREATE_HERO_TABLE);

        db.execSQL(DatabaseContract.PrimaryBasicTable.CREATE_PRIMARY_BASIC_TABLE);
        db.execSQL(DatabaseContract.PrimaryItemTable.CREATE_PRIMARY_ITEM_TABLE);

        db.execSQL(DatabaseContract.SecondaryBasicTable.CREATE_SECONDARY_BASIC_TABLE);
        db.execSQL(DatabaseContract.SecondaryItemTable.CREATE_SECONDARY_ITEM_TABLE);

        db.execSQL(DatabaseContract.PassiveBasicTable.CREATE_PASSIVE_BASIC_TABLE);
        db.execSQL(DatabaseContract.PassiveItemTable.CREATE_PASSIVE_ITEM_TABLE);

        db.execSQL(DatabaseContract.Skill1BasicTable.CREATE_SKILL1_BASIC_TABLE);
        db.execSQL(DatabaseContract.Skill1ItemTable.CREATE_SKILL1_ITEM_TABLE);

        db.execSQL(DatabaseContract.Skill2BasicTable.CREATE_SKILL2_BASIC_TABLE);
        db.execSQL(DatabaseContract.Skill2ItemTable.CREATE_SKILL2_ITEM_TABLE);

        db.execSQL(DatabaseContract.UltBasicTable.CREATE_ULT_BASIC_TABLE);
        db.execSQL(DatabaseContract.UltItemTable.CREATE_ULT_ITEM_TABLE);

        db.execSQL(DatabaseContract.OptionalBasicTable.CREATE_OPTIONAL_BASIC_TABLE);
        db.execSQL(DatabaseContract.OptionalItemTable.CREATE_OPTIONAL_ITEM_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop Tables
        db.execSQL(DatabaseContract.HeroTable.DELETE_HERO_TABLE);

        db.execSQL(DatabaseContract.PrimaryBasicTable.DELETE_PRIMARY_BASIC_TABLE);
        db.execSQL(DatabaseContract.PrimaryItemTable.DELETE_PRIMARY_ITEM_TABLE);

        db.execSQL(DatabaseContract.SecondaryBasicTable.DELETE_SECONDARY_BASIC_TABLE);
        db.execSQL(DatabaseContract.SecondaryItemTable.DELETE_SECONDARY_ITEM_TABLE);

        db.execSQL(DatabaseContract.PassiveBasicTable.DELETE_PASSIVE_BASIC_TABLE);
        db.execSQL(DatabaseContract.PassiveItemTable.DELETE_PASSIVE_ITEM_TABLE);

        db.execSQL(DatabaseContract.Skill1BasicTable.DELETE_SKILL1_BASIC_TABLE);
        db.execSQL(DatabaseContract.Skill1ItemTable.DELETE_SKILL1_ITEM_TABLE);

        db.execSQL(DatabaseContract.Skill2BasicTable.DELETE_SKILL2_BASIC_TABLE);
        db.execSQL(DatabaseContract.Skill2ItemTable.DELETE_SKILL2_ITEM_TABLE);

        db.execSQL(DatabaseContract.UltBasicTable.DELETE_ULT_BASIC_TABLE);
        db.execSQL(DatabaseContract.UltItemTable.DELETE_ULT_ITEM_TABLE);

        db.execSQL(DatabaseContract.OptionalBasicTable.DELETE_OPTIONAL_BASIC_TABLE);
        db.execSQL(DatabaseContract.OptionalItemTable.DELETE_OPTIONAL_ITEM_TABLE);

        onCreate(db);
    }
}
