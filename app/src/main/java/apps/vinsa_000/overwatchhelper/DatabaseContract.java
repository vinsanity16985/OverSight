package apps.vinsa_000.overwatchhelper;

import android.provider.BaseColumns;

/**
 * Created by vinsa on 11/5/2016.
 */
//Provides the structure(schema) of the database
public final class DatabaseContract {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Overwatch_DB";

    private static final String CREATE_TABLE = "CREATE TABLE ";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS ";
    private static final String TEXT = " TEXT";
    private static final String COMMA = ", ";
    private static final String INTEGER = " INTEGER";
    private static final String PRIMARY_KEY = " PRIMARY KEY";
    private static final String FOREIGN_KEY = " FOREIGN KEY";

    //Array of all table CREATE statements
    public static final String[] CREATE_TABLE_ARRAY = {
            HeroTable.CREATE_HERO_TABLE,
            PrimaryTable.CREATE_PRIMARY_TABLE,
            SecondaryTable.CREATE_SECONDARY_TABLE,
            PassiveTable.CREATE_PASSIVE_TABLE,
            Skill1Table.CREATE_SKILL1_TABLE,
            Skill2Table.CREATE_SKILL2_TABLE,
            UltTable.CREATE_ULT_TABLE,
            OptionalTable.CREATE_OPTIONAL_TABLE
    };

    private DatabaseContract(){}

    public static abstract class HeroTable implements BaseColumns{
        //Don't instantiate
        private HeroTable(){}

        public static final String TABLE_NAME = "hero";

        //Field names
        public static final String ID_COL1 = "id";
        public static final String NAME_COL2 = "name";
        public static final String ICON_COL3 = "icon";
        public static final String AGE_COL4 = "age";
        public static final String HEIGHT_COL5 = "height";
        public static final String DIFFICULTY_COL6 = "difficulty";
        public static final String HEALTH_COL7 = "health";
        public static final String ARMOR_COL8 = "armor";
        public static final String SHIELD_COL9 = "shield";
        public static final String TOTAL_COL10 = "total";
        public static final String PORTRAIT_COL11 = "portrait";

        //CREATE Hero Table
        public static final String CREATE_HERO_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                ICON_COL3 + TEXT + COMMA +
                AGE_COL4 + TEXT + COMMA +
                HEIGHT_COL5 + TEXT + COMMA +
                DIFFICULTY_COL6 + TEXT + COMMA +
                HEALTH_COL7 + TEXT + COMMA +
                ARMOR_COL8 + TEXT + COMMA +
                SHIELD_COL9 + TEXT + COMMA +
                TOTAL_COL10 + TEXT + COMMA +
                PORTRAIT_COL11 + TEXT + ");";

        //DELETE Hero Table
        public static final String DELETE_HERO_TABLE = DROP_TABLE + TABLE_NAME;
    }

    public static abstract class AbilityTable implements BaseColumns{
        private AbilityTable(){}

        public static final String TABLE_NAME = "ability";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String PRIMARY_COL2 = "primary";
        public static final String SECONDARY_COL3 = "secondary";
        public static final String PASSIVE_COL4 = "passive";
        public static final String SKILL1_COL5 = "skill1";
        public static final String SKILL2_COL6 = "skill2";
        public static final String ULT_COL7 = "ult";
        public static final String OPTIONAL_COL8 = "optional";

        public static final String CREATE_ABILITY_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                PRIMARY_COL2 + TEXT + COMMA +
                SECONDARY_COL3 + TEXT + COMMA +
                PASSIVE_COL4 + TEXT + COMMA +
                SKILL1_COL5 + TEXT + COMMA +
                SKILL2_COL6 + TEXT + COMMA +
                ULT_COL7 + TEXT + COMMA +
                OPTIONAL_COL8 + TEXT + ");";
        public static final String DELETE_ABILITY_TABLE = DROP_TABLE + TABLE_NAME;
    }

    public static abstract class PrimaryTable implements BaseColumns{
        private PrimaryTable(){}

        public static final String TABLE_NAME = "primary";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title1";
        public static final String TITLE_COL3 = "title2";
        public static final String TITLE_COL4 = "title3";
        public static final String TITLE_COL5 = "title4";
        public static final String TITLE_COL6 = "title5";
        public static final String TITLE_COL7 = "title6";
        public static final String TITLE_COL8 = "title7";
        public static final String TITLE_COL9 = "title8";
        public static final String TITLE_COL10 = "title9";
        public static final String TITLE_COL11 = "title10";

        public static final String CREATE_PRIMARY_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                TITLE_COL3 + TEXT + COMMA +
                TITLE_COL4 + TEXT + COMMA +
                TITLE_COL5 + TEXT + COMMA +
                TITLE_COL6 + TEXT + COMMA +
                TITLE_COL7 + TEXT + COMMA +
                TITLE_COL8 + TEXT + COMMA +
                TITLE_COL9 + TEXT + COMMA +
                TITLE_COL10 + TEXT + COMMA +
                TITLE_COL11 + TEXT + ");";
        public static final String DELETE_PRIMARY_TABLE = DROP_TABLE + TABLE_NAME;
    }
    public static abstract class SecondaryTable implements BaseColumns{
        private SecondaryTable(){}

        public static final String TABLE_NAME = "secondary";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title1";
        public static final String TITLE_COL3 = "title2";
        public static final String TITLE_COL4 = "title3";
        public static final String TITLE_COL5 = "title4";
        public static final String TITLE_COL6 = "title5";
        public static final String TITLE_COL7 = "title6";
        public static final String TITLE_COL8 = "title7";
        public static final String TITLE_COL9 = "title8";
        public static final String TITLE_COL10 = "title9";
        public static final String TITLE_COL11 = "title10";

        public static final String CREATE_SECONDARY_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                TITLE_COL3 + TEXT + COMMA +
                TITLE_COL4 + TEXT + COMMA +
                TITLE_COL5 + TEXT + COMMA +
                TITLE_COL6 + TEXT + COMMA +
                TITLE_COL7 + TEXT + COMMA +
                TITLE_COL8 + TEXT + COMMA +
                TITLE_COL9 + TEXT + COMMA +
                TITLE_COL10 + TEXT + COMMA +
                TITLE_COL11 + TEXT + ");";
        public static final String DELETE_SECONDARY_TABLE = DROP_TABLE + TABLE_NAME;
    }
    public static abstract class PassiveTable implements BaseColumns{
        private PassiveTable(){}

        public static final String TABLE_NAME = "passive";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title1";
        public static final String TITLE_COL3 = "title2";
        public static final String TITLE_COL4 = "title3";
        public static final String TITLE_COL5 = "title4";
        public static final String TITLE_COL6 = "title5";
        public static final String TITLE_COL7 = "title6";
        public static final String TITLE_COL8 = "title7";
        public static final String TITLE_COL9 = "title8";
        public static final String TITLE_COL10 = "title9";
        public static final String TITLE_COL11 = "title10";

        public static final String CREATE_PASSIVE_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                TITLE_COL3 + TEXT + COMMA +
                TITLE_COL4 + TEXT + COMMA +
                TITLE_COL5 + TEXT + COMMA +
                TITLE_COL6 + TEXT + COMMA +
                TITLE_COL7 + TEXT + COMMA +
                TITLE_COL8 + TEXT + COMMA +
                TITLE_COL9 + TEXT + COMMA +
                TITLE_COL10 + TEXT + COMMA +
                TITLE_COL11 + TEXT + ");";
        public static final String DELETE_PASSIVE_TABLE = DROP_TABLE + TABLE_NAME;
    }
    public static abstract class Skill1Table implements BaseColumns{
        private Skill1Table(){}

        public static final String TABLE_NAME = "skill1";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title1";
        public static final String TITLE_COL3 = "title2";
        public static final String TITLE_COL4 = "title3";
        public static final String TITLE_COL5 = "title4";
        public static final String TITLE_COL6 = "title5";
        public static final String TITLE_COL7 = "title6";
        public static final String TITLE_COL8 = "title7";
        public static final String TITLE_COL9 = "title8";
        public static final String TITLE_COL10 = "title9";
        public static final String TITLE_COL11 = "title10";

        public static final String CREATE_SKILL1_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                TITLE_COL3 + TEXT + COMMA +
                TITLE_COL4 + TEXT + COMMA +
                TITLE_COL5 + TEXT + COMMA +
                TITLE_COL6 + TEXT + COMMA +
                TITLE_COL7 + TEXT + COMMA +
                TITLE_COL8 + TEXT + COMMA +
                TITLE_COL9 + TEXT + COMMA +
                TITLE_COL10 + TEXT + COMMA +
                TITLE_COL11 + TEXT + ");";
        public static final String DELETE_SKILL1_TABLE = DROP_TABLE + TABLE_NAME;
    }
    public static abstract class Skill2Table implements BaseColumns{
        private Skill2Table(){}

        public static final String TABLE_NAME = "skill2";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title1";
        public static final String TITLE_COL3 = "title2";
        public static final String TITLE_COL4 = "title3";
        public static final String TITLE_COL5 = "title4";
        public static final String TITLE_COL6 = "title5";
        public static final String TITLE_COL7 = "title6";
        public static final String TITLE_COL8 = "title7";
        public static final String TITLE_COL9 = "title8";
        public static final String TITLE_COL10 = "title9";
        public static final String TITLE_COL11 = "title10";

        public static final String CREATE_SKILL2_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                TITLE_COL3 + TEXT + COMMA +
                TITLE_COL4 + TEXT + COMMA +
                TITLE_COL5 + TEXT + COMMA +
                TITLE_COL6 + TEXT + COMMA +
                TITLE_COL7 + TEXT + COMMA +
                TITLE_COL8 + TEXT + COMMA +
                TITLE_COL9 + TEXT + COMMA +
                TITLE_COL10 + TEXT + COMMA +
                TITLE_COL11 + TEXT + ");";
        public static final String DELETE_SKILL2_TABLE = DROP_TABLE + TABLE_NAME;
    }
    public static abstract class UltTable implements BaseColumns{
        private UltTable(){}

        public static final String TABLE_NAME = "ult";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title1";
        public static final String TITLE_COL3 = "title2";
        public static final String TITLE_COL4 = "title3";
        public static final String TITLE_COL5 = "title4";
        public static final String TITLE_COL6 = "title5";
        public static final String TITLE_COL7 = "title6";
        public static final String TITLE_COL8 = "title7";
        public static final String TITLE_COL9 = "title8";
        public static final String TITLE_COL10 = "title9";
        public static final String TITLE_COL11 = "title10";

        public static final String CREATE_ULT_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                TITLE_COL3 + TEXT + COMMA +
                TITLE_COL4 + TEXT + COMMA +
                TITLE_COL5 + TEXT + COMMA +
                TITLE_COL6 + TEXT + COMMA +
                TITLE_COL7 + TEXT + COMMA +
                TITLE_COL8 + TEXT + COMMA +
                TITLE_COL9 + TEXT + COMMA +
                TITLE_COL10 + TEXT + COMMA +
                TITLE_COL11 + TEXT + ");";
        public static final String DELETE_ULT_TABLE = DROP_TABLE + TABLE_NAME;
    }
    public static abstract class OptionalTable implements BaseColumns{
        private OptionalTable(){}

        public static final String TABLE_NAME = "optional";

        //Fields
        public static final String ID_COL1 = "id";
        public static final String TITLE_COL2 = "title1";
        public static final String TITLE_COL3 = "title2";
        public static final String TITLE_COL4 = "title3";
        public static final String TITLE_COL5 = "title4";
        public static final String TITLE_COL6 = "title5";
        public static final String TITLE_COL7 = "title6";
        public static final String TITLE_COL8 = "title7";
        public static final String TITLE_COL9 = "title8";
        public static final String TITLE_COL10 = "title9";
        public static final String TITLE_COL11 = "title10";

        public static final String CREATE_OPTIONAL_TABLE = CREATE_TABLE + TABLE_NAME + " (" +
                ID_COL1 + TEXT + PRIMARY_KEY + COMMA +
                TITLE_COL2 + TEXT + COMMA +
                TITLE_COL3 + TEXT + COMMA +
                TITLE_COL4 + TEXT + COMMA +
                TITLE_COL5 + TEXT + COMMA +
                TITLE_COL6 + TEXT + COMMA +
                TITLE_COL7 + TEXT + COMMA +
                TITLE_COL8 + TEXT + COMMA +
                TITLE_COL9 + TEXT + COMMA +
                TITLE_COL10 + TEXT + COMMA +
                TITLE_COL11 + TEXT + ");";
        public static final String DELETE_OPTIONAL_TABLE = DROP_TABLE + TABLE_NAME;
    }
}
