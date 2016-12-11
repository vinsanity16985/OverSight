package apps.vinsa_000.overwatchhelper;

import android.provider.BaseColumns;

/**
 * Created by vinsa on 11/5/2016.
 */

public final class DatabaseContract {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Overwatch_DB";
    private static final String TEXT = " TEXT";
    private static final String COMMA = ", ";
    private static final String INTEGER = " INTEGER";
    private static final String PRIMARY_KEY = " PRIMARY KEY";

    private static final String PRIMARY_TABLE = "primary";
    private static final String SECONDARY_TABLE = "secondary";
    private static final String PASSIVE_TABLE = "passive";
    private static final String SKILL1_TABLE = "skill1";
    private static final String SKILL2_TABLE = "skill2";
    private static final String ULT_TABLE = "ultimate";
    private static final String OPTIONAL_TABLE = "optional";

    //Array of all table CREATE statements
    public static final String[] CREATE_TABLE_ARRAY = {
        HeroTable.CREATE_TABLE
    };

    private DatabaseContract(){}

    public static abstract class HeroTable implements BaseColumns{
        //Don't instantiate
        private HeroTable(){}

        public static final String TABLE_NAME = "hero";

        //Field names
        public static final String ID_COL1 = "hero id";
        public static final String NAME_COL2 = "hero name";
        public static final String ICON_COL3 = "hero icon";
        public static final String AGE_COL4 = "hero age";
        public static final String HEIGHT_COL5 = "hero height";
        public static final String DIFFICULTY_COL6 = "hero difficulty";
        public static final String HEALTH_COL7 = "hero health";
        public static final String ARMOR_COL8 = "hero armor";
        public static final String SHIELD_COL9 = "hero shield";
        public static final String TOTAL_COL10 = "hero total";

        //SQL CREATE statement
        public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                ID_COL1 + INTEGER + PRIMARY_KEY + COMMA +
                NAME_COL2 + TEXT + COMMA +
                ICON_COL3 + INTEGER + COMMA +
                AGE_COL4 + INTEGER + COMMA +
                HEIGHT_COL5 + TEXT + COMMA +
                DIFFICULTY_COL6 + INTEGER + COMMA +
                HEALTH_COL7 + INTEGER + COMMA +
                ARMOR_COL8 + INTEGER + COMMA +
                SHIELD_COL9 + INTEGER + COMMA +
                TOTAL_COL10 + INTEGER + ");";

        //SQL DELETE statement
        public static final String DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    }
}
