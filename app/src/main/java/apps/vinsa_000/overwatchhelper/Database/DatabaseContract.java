package apps.vinsa_000.overwatchhelper.Database;

import android.provider.BaseColumns;

/**
 * Created by vinsa on 11/5/2016.
 * Provides the schema for the SQLiteDatabase
 * Database Name: "Overwatch DB"
 *  Total Tables: 15
 *       Version: 1
 * Table Name:          # Columns:
 *  Hero                    13
 *  PrimaryBasic             3
 *  PrimaryItem              3
 *  SecondaryBasic           3
 *  SecondaryItem            3
 *  PassiveBasic             3
 *  PassiveItem              3
 *  Skill1Basic              3
 *  Skill1Item               3
 *  Skill2Basic              3
 *  Skill2Item               3
 *  UltBasic                 3
 *  UltItem                  3
 *  OptionalBasic            3
 *  OptionalItem             3
 */
public final class DatabaseContract {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Overwatch_DB";

    private static final String CREATE_TABLE = "CREATE TABLE ";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS ";
    private static final String TEXT = " TEXT";
    private static final String COMMA = ", ";
    private static final String PRIMARY_KEY = " PRIMARY KEY";
    private static final String FOREIGN_KEY = " FOREIGN KEY";

    private DatabaseContract(){}

    /*----------HERO TABLE----------*/
    public static abstract class HeroTable implements BaseColumns{
        //Don't instantiate
        private HeroTable(){}

        public static final String TABLE_NAME = "hero";

        //Field names
        public static final String ID_COL1 = "id";
        public static final String NICKNAME_COL2 = "nickname";
        public static final String NAME_COL3 = "name";
        public static final String HEIGHT_COL4 = "height";
        public static final String AGE_COL5 = "age";
        public static final String DIFFICULTY_COL6 = "difficulty";
        public static final String HEALTH_COL7 = "health";
        public static final String ARMOR_COL8 = "armor";
        public static final String SHIELD_COL9 = "shield";
        public static final String TOTAL_COL10 = "total";
        public static final String TYPE_COL11 = "type";
        public static final String ICON_COL12 = "icon";
        public static final String PORTRAIT_COL13 = "portrait";

        //CREATE Hero Table
        public static final String CREATE_HERO_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NICKNAME_COL2 + TEXT + COMMA +
                NAME_COL3 + TEXT + COMMA +
                HEIGHT_COL4 + TEXT + COMMA +
                AGE_COL5 + TEXT + COMMA +
                DIFFICULTY_COL6 + TEXT + COMMA +
                HEALTH_COL7 + TEXT + COMMA +
                ARMOR_COL8 + TEXT + COMMA +
                SHIELD_COL9 + TEXT + COMMA +
                TOTAL_COL10 + TEXT + COMMA +
                TYPE_COL11 + TEXT + COMMA +
                ICON_COL12 + TEXT + COMMA +
                PORTRAIT_COL13 + TEXT + ");";

        //DELETE Hero Table
        public static final String DELETE_HERO_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------PRIMARY BASIC TABLE----------*/
    public static abstract class PrimaryBasicTable implements BaseColumns{
        private PrimaryBasicTable(){}

        public static final String TABLE_NAME = "primeBasic";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String DESC_COL3 = "description";

        public static final String CREATE_PRIMARY_BASIC_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                DESC_COL3 + TEXT + ");";
        public static final String DELETE_PRIMARY_BASIC_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------PRIMARY ITEM TABLE----------*/
    public static abstract class PrimaryItemTable implements BaseColumns{
        private PrimaryItemTable(){}

        public static final String TABLE_NAME = "primeItems";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title";
        public static final String VALUE_COL3 = "value";

        public static final String CREATE_PRIMARY_ITEM_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                VALUE_COL3 +  TEXT + ");";
        public static final String DELETE_PRIMARY_ITEM_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------SECONDARY BASIC TABLE----------*/
    public static abstract class SecondaryBasicTable implements BaseColumns{
        private SecondaryBasicTable(){}

        public static final String TABLE_NAME = "secondaryBasic";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String DESC_COL3 = "description";

        public static final String CREATE_SECONDARY_BASIC_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                DESC_COL3 + TEXT + ");";
        public static final String DELETE_SECONDARY_BASIC_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------SECONDARY ITEM TABLE----------*/
    public static abstract class SecondaryItemTable implements BaseColumns{
        private SecondaryItemTable(){}

        public static final String TABLE_NAME = "secondaryItems";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title";
        public static final String VALUE_COL3 = "value";

        public static final String CREATE_SECONDARY_ITEM_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                VALUE_COL3 + TEXT + ");";
        public static final String DELETE_SECONDARY_ITEM_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------PASSIVE BASIC TABLE----------*/
    public static abstract class PassiveBasicTable implements BaseColumns{
        private PassiveBasicTable(){}

        public static final String TABLE_NAME = "passiveBasic";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String DESC_COL3 = "description";

        public static final String CREATE_PASSIVE_BASIC_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                DESC_COL3 + TEXT + ");";
        public static final String DELETE_PASSIVE_BASIC_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------PASSIVE ITEM TABLE----------*/
    public static abstract class PassiveItemTable implements BaseColumns{
        private PassiveItemTable(){}

        public static final String TABLE_NAME = "passiveItems";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title";
        public static final String VALUE_COL3 = "value";

        public static final String CREATE_PASSIVE_ITEM_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                VALUE_COL3 + TEXT + ");";
        public static final String DELETE_PASSIVE_ITEM_TABLE = DROP_TABLE + TABLE_NAME;
    }


    /*----------SKILL1 BASIC TABLE----------*/
    public static abstract class Skill1BasicTable implements BaseColumns{
        private Skill1BasicTable(){}

        public static final String TABLE_NAME = "skill1Basic";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String DESC_COL3 = "description";

        public static final String CREATE_SKILL1_BASIC_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                DESC_COL3 + TEXT + ");";
        public static final String DELETE_SKILL1_BASIC_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------SKILL1 ITEM TABLE----------*/
    public static abstract class Skill1ItemTable implements BaseColumns{
        private Skill1ItemTable(){}

        public static final String TABLE_NAME = "skill1Items";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title";
        public static final String VALUE_COL3 = "value";

        public static final String CREATE_SKILL1_ITEM_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                VALUE_COL3 + TEXT + ");";
        public static final String DELETE_SKILL1_ITEM_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------SKILL2 BASIC TABLE----------*/
    public static abstract class Skill2BasicTable implements BaseColumns{
        private Skill2BasicTable(){}

        public static final String TABLE_NAME = "skill2Basic";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String DESC_COL3 = "description";

        public static final String CREATE_SKILL2_BASIC_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                DESC_COL3 + TEXT + ");";
        public static final String DELETE_SKILL2_BASIC_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------SKILL2 ITEM TABLE----------*/
    public static abstract class Skill2ItemTable implements BaseColumns{
        private Skill2ItemTable(){}

        public static final String TABLE_NAME = "skill2Items";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title";
        public static final String VALUE_COL3 = "value";

        public static final String CREATE_SKILL2_ITEM_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                VALUE_COL3 + TEXT + ");";
        public static final String DELETE_SKILL2_ITEM_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------ULT BASIC TABLE----------*/
    public static abstract class UltBasicTable implements BaseColumns{
        private UltBasicTable(){}

        public static final String TABLE_NAME = "ultBasic";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String DESC_COL3 = "description";

        public static final String CREATE_ULT_BASIC_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                DESC_COL3 + TEXT + ");";
        public static final String DELETE_ULT_BASIC_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------ULT ITEM TABLE----------*/
    public static abstract class UltItemTable implements BaseColumns{
        private UltItemTable(){}

        public static final String TABLE_NAME = "ultItems";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title";
        public static final String VALUE_COL3 = "value";

        public static final String CREATE_ULT_ITEM_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                VALUE_COL3 + TEXT + ");";
        public static final String DELETE_ULT_ITEM_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------OPTIONAL BASIC TABLE----------*/
    public static abstract class OptionalBasicTable implements BaseColumns{
        private OptionalBasicTable(){}

        public static final String TABLE_NAME = "optionalBasic";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String DESC_COL3 = "description";

        public static final String CREATE_OPTIONAL_BASIC_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                DESC_COL3 + TEXT + ");";
        public static final String DELETE_OPTIONAL_BASIC_TABLE = DROP_TABLE + TABLE_NAME;
    }

    /*----------OPTIONAL ITEM TABLE----------*/
    public static abstract class OptionalItemTable implements BaseColumns{
        private OptionalItemTable(){}

        public static final String TABLE_NAME = "optionalItems";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title";
        public static final String VALUE_COL3 = "value";

        public static final String CREATE_OPTIONAL_ITEM_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                VALUE_COL3 + TEXT + ");";
        public static final String DELETE_OPTIONAL_ITEM_TABLE = DROP_TABLE + TABLE_NAME;
    }
}
