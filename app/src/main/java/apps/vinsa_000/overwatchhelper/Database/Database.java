package apps.vinsa_000.overwatchhelper.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by vinsa on 11/6/2016.
 */
public class Database {

    private static final String TAG = "Database";

    private String heroTableInsert = "INSERT OR REPLACE INTO " + DatabaseContract.HeroTable.TABLE_NAME + "( "
            + DatabaseContract.HeroTable.ID_COL1 + ", " //1
            + DatabaseContract.HeroTable.NICKNAME_COL2 + ", " //2
            + DatabaseContract.HeroTable.NAME_COL3 + ", " //3
            + DatabaseContract.HeroTable.HEIGHT_COL4 + ", " //4
            + DatabaseContract.HeroTable.AGE_COL5 + ", " //5
            + DatabaseContract.HeroTable.DIFFICULTY_COL6 + ", " //6
            + DatabaseContract.HeroTable.HEALTH_COL7 + ", " //7
            + DatabaseContract.HeroTable.ARMOR_COL8 + ", " //8
            + DatabaseContract.HeroTable.SHIELD_COL9 + ", " //9
            + DatabaseContract.HeroTable.TOTAL_COL10 + " )" //10
            + " VALUES (?,?,?,?,?,?,?,?,?,?)";

    private String primaryBasicInsert = "INSERT OR REPLACE INTO " + DatabaseContract.PrimaryBasicTable.TABLE_NAME + "( "
            + DatabaseContract.PrimaryBasicTable.ID_COL1 + ", " //1
            + DatabaseContract.PrimaryBasicTable.NAME_COL2 + ", " //2
            + DatabaseContract.PrimaryBasicTable.DESC_COL3 +  " )" //3
            + " VALUES (?,?,?)";

    private String primaryItemInsert = "INSERT OR REPLACE INTO " + DatabaseContract.PrimaryItemTable.TABLE_NAME + "( "
            + DatabaseContract.PrimaryItemTable.ID_COL1 + ", " //1
            + DatabaseContract.PrimaryItemTable.TITLE_COL2 + ", " //2
            + DatabaseContract.PrimaryItemTable.VALUE_COL3 +  " )" //3
            + " VALUES (?,?,?)";

    private String secondaryBasicInsert = "INSERT OR REPLACE INTO " + DatabaseContract.SecondaryBasicTable.TABLE_NAME + "( "
            + DatabaseContract.SecondaryBasicTable.ID_COL1 + ", " //1
            + DatabaseContract.SecondaryBasicTable.NAME_COL2 + ", " //2
            + DatabaseContract.SecondaryBasicTable.DESC_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String secondaryItemInsert = "INSERT OR REPLACE INTO " + DatabaseContract.SecondaryItemTable.TABLE_NAME + "( "
            + DatabaseContract.SecondaryItemTable.ID_COL1 + ", " //1
            + DatabaseContract.SecondaryItemTable.TITLE_COL2 + ", " //2
            + DatabaseContract.SecondaryItemTable.VALUE_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String passiveBasicInsert = "INSERT OR REPLACE INTO " + DatabaseContract.PassiveBasicTable.TABLE_NAME + "( "
            + DatabaseContract.PassiveBasicTable.ID_COL1 + ", " //1
            + DatabaseContract.PassiveBasicTable.NAME_COL2 + ", " //2
            + DatabaseContract.PassiveBasicTable.DESC_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String passiveItemInsert = "INSERT OR REPLACE INTO " + DatabaseContract.PassiveItemTable.TABLE_NAME + "( "
            + DatabaseContract.PassiveItemTable.ID_COL1 + ", " //1
            + DatabaseContract.PassiveItemTable.TITLE_COL2 + ", " //2
            + DatabaseContract.PassiveItemTable.VALUE_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String skill1BasicInsert = "INSERT OR REPLACE INTO " + DatabaseContract.Skill1BasicTable.TABLE_NAME + "( "
            + DatabaseContract.Skill1BasicTable.ID_COL1 + ", " //1
            + DatabaseContract.Skill1BasicTable.NAME_COL2 + ", " //2
            + DatabaseContract.Skill1BasicTable.DESC_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String skill1ItemInsert = "INSERT OR REPLACE INTO " + DatabaseContract.Skill1ItemTable.TABLE_NAME + "( "
            + DatabaseContract.Skill1ItemTable.ID_COL1 + ", " //1
            + DatabaseContract.Skill1ItemTable.TITLE_COL2 + ", " //2
            + DatabaseContract.Skill1ItemTable.VALUE_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String skill2BasicInsert = "INSERT OR REPLACE INTO " + DatabaseContract.Skill2BasicTable.TABLE_NAME + "( "
            + DatabaseContract.Skill2BasicTable.ID_COL1 + ", " //1
            + DatabaseContract.Skill2BasicTable.NAME_COL2 + ", " //2
            + DatabaseContract.Skill2BasicTable.DESC_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String skill2ItemInsert = "INSERT OR REPLACE INTO " + DatabaseContract.Skill2ItemTable.TABLE_NAME + "( "
            + DatabaseContract.Skill2ItemTable.ID_COL1 + ", " //1
            + DatabaseContract.Skill2ItemTable.TITLE_COL2 + ", " //2
            + DatabaseContract.Skill2ItemTable.VALUE_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String ultBasicInsert = "INSERT OR REPLACE INTO " + DatabaseContract.UltBasicTable.TABLE_NAME + "( "
            + DatabaseContract.UltBasicTable.ID_COL1 + ", " //1
            + DatabaseContract.UltBasicTable.NAME_COL2 + ", " //2
            + DatabaseContract.UltBasicTable.DESC_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String ultItemInsert = "INSERT OR REPLACE INTO " + DatabaseContract.UltItemTable.TABLE_NAME + "( "
            + DatabaseContract.UltItemTable.ID_COL1 + ", " //1
            + DatabaseContract.UltItemTable.TITLE_COL2 + ", " //2
            + DatabaseContract.UltItemTable.VALUE_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String optionalBasicInsert = "INSERT OR REPLACE INTO " + DatabaseContract.OptionalBasicTable.TABLE_NAME + "( "
            + DatabaseContract.OptionalBasicTable.ID_COL1 + ", " //1
            + DatabaseContract.OptionalBasicTable.NAME_COL2 + ", " //2
            + DatabaseContract.OptionalBasicTable.DESC_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private String optionalItemInsert = "INSERT OR REPLACE INTO " + DatabaseContract.OptionalItemTable.TABLE_NAME + "( "
            + DatabaseContract.OptionalItemTable.ID_COL1 + ", " //1
            + DatabaseContract.OptionalItemTable.TITLE_COL2 + ", " //2
            + DatabaseContract.OptionalItemTable.VALUE_COL3 + " )" //3
            + " VALUES (?,?,?)";

    private SQLiteStatement heroStatement;
    private SQLiteStatement primaryBasicStatement;
    private SQLiteStatement primaryItemStatement;
    private SQLiteStatement secondaryBasicStatement;
    private SQLiteStatement secondaryItemStatement;
    private SQLiteStatement passiveBasicStatement;
    private SQLiteStatement passiveItemStatement;
    private SQLiteStatement skill1BasicStatement;
    private SQLiteStatement skill1ItemStatement;
    private SQLiteStatement skill2BasicStatement;
    private SQLiteStatement skill2ItemStatement;
    private SQLiteStatement ultBasicStatement;
    private SQLiteStatement ultItemStatement;
    private SQLiteStatement optionalBasicStatement;
    private SQLiteStatement optionalItemStatement;

    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;

    public Database(Context context, ArrayList<Hero> heroList){
        dbHelper = new DatabaseHelper(context);
        db = dbHelper.getWritableDatabase();

        try{
            //Necessary
            db.beginTransaction();

            //Compile all statements
            heroStatement = db.compileStatement(heroTableInsert);

            primaryBasicStatement = db.compileStatement(primaryBasicInsert);
            primaryItemStatement = db.compileStatement(primaryItemInsert);

            secondaryBasicStatement = db.compileStatement(secondaryBasicInsert);
            secondaryItemStatement = db.compileStatement(secondaryItemInsert);

            passiveBasicStatement = db.compileStatement(passiveBasicInsert);
            passiveItemStatement = db.compileStatement(passiveItemInsert);

            skill1BasicStatement = db.compileStatement(skill1BasicInsert);
            skill1ItemStatement = db.compileStatement(skill1ItemInsert);

            skill2BasicStatement = db.compileStatement(skill2BasicInsert);
            skill2ItemStatement = db.compileStatement(skill2ItemInsert);

            ultBasicStatement = db.compileStatement(ultBasicInsert);
            ultItemStatement = db.compileStatement(ultItemInsert);

            optionalBasicStatement = db.compileStatement(optionalBasicInsert);
            optionalItemStatement = db.compileStatement(optionalItemInsert);


            for(Hero h: heroList){
                //Clear out old bindings
                heroStatement.clearBindings();
                primaryBasicStatement.clearBindings();
                secondaryBasicStatement.clearBindings();
                passiveBasicStatement.clearBindings();
                skill1BasicStatement.clearBindings();
                skill2BasicStatement.clearBindings();
                ultBasicStatement.clearBindings();
                optionalBasicStatement.clearBindings();

                //Commonly Used
                String id = h.getBasicItem(0).getValue();

                //Bind basic items, bindString(int index, String value)
                heroStatement.bindString(1, id);
                heroStatement.bindString(2, h.getBasicItem(1).getValue());
                heroStatement.bindString(3,h.getBasicItem(2).getValue());
                heroStatement.bindString(4,h.getBasicItem(3).getValue());
                heroStatement.bindString(5,h.getBasicItem(4).getValue());
                heroStatement.bindString(6,h.getBasicItem(5).getValue());
                heroStatement.bindString(7,h.getBasicItem(6).getValue());
                heroStatement.bindString(8,h.getBasicItem(7).getValue());
                heroStatement.bindString(9,h.getBasicItem(8).getValue());
                heroStatement.bindString(10,h.getBasicItem(9).getValue());

                //Bind Primary Basic
                if(h.hasPrimary()){
                    primaryBasicStatement.bindString(1, id);
                    primaryBasicStatement.bindString(2, h.getPrimaryName());
                    primaryBasicStatement.bindString(3, h.getPrimaryDescription());
                    for(int i = 0; i < h.getPrimarySize() ; i++){
                        //Clear previous bindings
                        primaryItemStatement.clearBindings();

                        //Bind item to statement
                        Item item = h.getPrimaryItem(i);
                        primaryItemStatement.bindString(1, id);
                        primaryItemStatement.bindString(2, item.getTitle());
                        primaryItemStatement.bindString(3, item.getValue());

                        //Execute
                        primaryItemStatement.executeInsert();
                    }
                }

                //Bind Secondary Basic
                if(h.hasSecondary()){
                    secondaryBasicStatement.bindString(1, id);
                    secondaryBasicStatement.bindString(2, h.getSecondaryName());
                    secondaryBasicStatement.bindString(3, h.getSecondaryDescription());
                    for(int i = 0; i < h.getSecondarySize(); i++){
                        //Clear previous bindings
                        secondaryItemStatement.clearBindings();

                        //Bind item to statement
                        Item item = h.getSecondaryItem(i);
                        secondaryItemStatement.bindString(1, id);
                        secondaryItemStatement.bindString(2, item.getTitle());
                        secondaryItemStatement.bindString(3, item.getValue());

                        //Execute
                        secondaryItemStatement.executeInsert();
                    }
                }

                //Bind Passive Basic
                if(h.hasPassive()){
                    passiveBasicStatement.bindString(1, id);
                    passiveBasicStatement.bindString(2, h.getPassiveName());
                    passiveBasicStatement.bindString(3, h.getPassiveDescription());
                    for(int i = 0; i < h.getPassiveSize(); i++){
                        //Clear previous bindings
                        passiveItemStatement.clearBindings();

                        //Bind item to statement
                        Item item = h.getPassiveItem(i);
                        passiveItemStatement.bindString(1, id);
                        passiveItemStatement.bindString(2, item.getTitle());
                        passiveItemStatement.bindString(3, item.getValue());

                        //Execute
                        passiveItemStatement.executeInsert();
                    }
                }

                //Bind Skill1 Basic
                if(h.hasSkill1()){
                    skill1BasicStatement.bindString(1, id);
                    skill1BasicStatement.bindString(2, h.getSkill1Name());
                    skill1BasicStatement.bindString(3, h.getSkill1Description());
                    for(int i = 0; i < h.getSkill1Size(); i++){
                        //Clear previous bindings
                        skill1ItemStatement.clearBindings();

                        //Bind item to statement
                        Item item = h.getSkill1Item(i);
                        skill1ItemStatement.bindString(1, id);
                        skill1ItemStatement.bindString(2, item.getTitle());
                        skill1ItemStatement.bindString(3, item.getValue());

                        //Execute
                        skill1ItemStatement.executeInsert();
                    }
                }

                //Bind Skill2 Basic
                if(h.hasSkill2()){
                    skill2BasicStatement.bindString(1, id);
                    skill2BasicStatement.bindString(2, h.getSkill2Name());
                    skill2BasicStatement.bindString(3, h.getSkill2Description());
                    for(int i = 0; i < h.getSkill2Size(); i++){
                        //Clear previous bindings
                        skill2ItemStatement.clearBindings();

                        //Bind item to statement
                        Item item = h.getSkill2Item(i);
                        skill2ItemStatement.bindString(1, id);
                        skill2ItemStatement.bindString(2, item.getTitle());
                        skill2ItemStatement.bindString(3, item.getValue());

                        //Execute
                        skill2ItemStatement.executeInsert();
                    }
                }

                //Bind Ult Basic
                if(h.hasUlt()){
                    ultBasicStatement.bindString(1, id);
                    ultBasicStatement.bindString(2, h.getUltName());
                    ultBasicStatement.bindString(3, h.getUltDescription());
                    for(int i = 0; i < h.getUltSize(); i++){
                        //Clear previous bindings
                        ultItemStatement.clearBindings();

                        //Bind item to statement
                        Item item = h.getUltItem(i);
                        ultItemStatement.bindString(1, id);
                        ultItemStatement.bindString(2, item.getTitle());
                        ultItemStatement.bindString(3, item.getValue());

                        //Execute
                        ultItemStatement.executeInsert();
                    }
                }

                //Bind Optional Basic
                if(h.hasOptional()){
                    optionalBasicStatement.bindString(1, id);
                    optionalBasicStatement.bindString(2, h.getOptionalName());
                    optionalBasicStatement.bindString(3, h.getOptionalDescription());
                    for(int i = 0; i < h.getOptionalSize(); i++){
                        //Clear previous bindings
                        optionalItemStatement.clearBindings();

                        //Bind item to statement
                        Item item = h.getOptionalItem(i);
                        optionalItemStatement.bindString(1, id);
                        optionalItemStatement.bindString(2, item.getTitle());
                        optionalItemStatement.bindString(3, item.getValue());

                        //Execute
                        optionalItemStatement.executeInsert();
                    }
                }

                //Execute Insert Statements
                heroStatement.executeInsert();
                primaryBasicStatement.executeInsert();
                secondaryBasicStatement.executeInsert();
                passiveBasicStatement.executeInsert();
                skill1BasicStatement.executeInsert();
                skill2BasicStatement.executeInsert();
                ultBasicStatement.executeInsert();
                optionalBasicStatement.executeInsert();
            }

            //Close all statements
            heroStatement.close();

            primaryBasicStatement.close();
            primaryItemStatement.close();

            secondaryBasicStatement.close();
            secondaryItemStatement.close();

            passiveBasicStatement.close();
            passiveItemStatement.close();

            skill1BasicStatement.close();
            skill1ItemStatement.close();

            skill2BasicStatement.close();
            skill2ItemStatement.close();

            ultBasicStatement.close();
            ultItemStatement.close();

            optionalBasicStatement.close();
            optionalItemStatement.close();

            //Mark the transaction as successful
            db.setTransactionSuccessful();

        }catch (Exception e){
            Log.d(TAG, e.toString());
        }finally {
            db.endTransaction();
        }


    }
}
