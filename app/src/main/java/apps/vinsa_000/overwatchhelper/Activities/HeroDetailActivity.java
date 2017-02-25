package apps.vinsa_000.overwatchhelper.Activities;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import apps.vinsa_000.overwatchhelper.Utils.Constants;
import apps.vinsa_000.overwatchhelper.Database.DatabaseContract;
import apps.vinsa_000.overwatchhelper.Database.DatabaseHelper;
import apps.vinsa_000.overwatchhelper.Fragments.HeroAbilityFragment;
import apps.vinsa_000.overwatchhelper.Database.Hero;
import apps.vinsa_000.overwatchhelper.R;

public class HeroDetailActivity extends AppCompatActivity{

    private static final String TAG = "HeroDetailActivity";

    private Intent intent;
    ListView listView;
    Hero hero;
    int heroNum;

    ImageView heroPortrait;
    TextView heroName;
    TextView heroAge;
    TextView heroHeight;
    TextView heroDifficulty;
    TextView heroHealth;
    TextView heroArmor;
    TextView heroShield;
    TextView heroTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);

        //Grab intent and heroNum
        intent = getIntent();
        heroNum = intent.getIntExtra("Hero Number", Constants.NO_NUM);
        Log.i(TAG, heroNum + "");

        //Initialize necessary views
        listView = (ListView)findViewById(R.id.hero_ability_list);
        heroPortrait = (ImageView)findViewById(R.id.hero_portrait);
        heroName = (TextView)findViewById(R.id.hero_name);
        heroAge = (TextView)findViewById(R.id.hero_age);
        heroHeight = (TextView)findViewById(R.id.hero_height);
        heroDifficulty = (TextView)findViewById(R.id.hero_difficulty);
        heroHealth = (TextView)findViewById(R.id.hero_health);
        heroArmor = (TextView)findViewById(R.id.hero_armor);
        heroShield = (TextView)findViewById(R.id.hero_shield);
        heroTotal = (TextView)findViewById(R.id.hero_total);

        //Specify which hero to get data for, using heroNum
        hero = new Hero();


        //Set up hero's basic info
        setBasicInfo();


        //Set up hero's abilities list
        setUpAbilityListView();
    }

    //Gets a certain hero's basic info and displays it
    private void setBasicInfo(){
        //ArrayList<String> heroBasicInfo = hero.getBasicInfo();
        //Create DatabaseHelper and open readable database
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        //Columns that are being used
        String[] projection = {
                DatabaseContract.HeroTable.NAME_COL3,
                DatabaseContract.HeroTable.ICON_COL12,
                DatabaseContract.HeroTable.AGE_COL5,
                DatabaseContract.HeroTable.HEIGHT_COL4,
                DatabaseContract.HeroTable.DIFFICULTY_COL6,
                DatabaseContract.HeroTable.HEALTH_COL7,
                DatabaseContract.HeroTable.ARMOR_COL8,
                DatabaseContract.HeroTable.SHIELD_COL9,
                DatabaseContract.HeroTable.TOTAL_COL10
        };

        //Query HeroTable using Hero ID
        String selection  = DatabaseContract.HeroTable.ID_COL1 + " = ?";

        //Put in the heroNum
        String[] args = {Integer.toString(heroNum)};

        //Query the database
        Cursor c = db.query(
                DatabaseContract.HeroTable.TABLE_NAME,
                projection,
                selection,
                args,
                null,
                null,
                null
        );

        c.moveToFirst();
        String name = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.NAME_COL3));
        String icon = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.ICON_COL12));
        String age = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.AGE_COL5));
        String height = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.HEIGHT_COL4));
        String difficulty = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.DIFFICULTY_COL6));
        String health = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.HEALTH_COL7));
        String armor = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.ARMOR_COL8));
        String shield = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.SHIELD_COL9));
        String total = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.TOTAL_COL10));
//      String portrait = c.getString(c.getColumnIndex(DatabaseContract.HeroTable.PORTRAIT_COL13));

        heroName.setText("Name: " + name);
        heroAge.setText("Age: " + age);
        heroHeight.setText("Height: " + height);
        heroDifficulty.setText("Difficulty: " + difficulty);
        heroHealth.setText("Health: " + health);
        heroArmor.setText("Armor: " + armor);
        heroShield.setText("Shield: " + shield);
        heroTotal.setText("Total: " + total);
        //heroPortrait.setImageResource(Integer.parseInt(icon));
    }
    private void setUpAbilityListView() {
        //Populate list of hero info
        ArrayList<Hero> heroInfo = new ArrayList<Hero>();
        for(int i = 0; i < 5; i++){
            Hero temp = hero;
            heroInfo.add(temp);
        }
        //Place in adapter
        AbilityListAdapter adapter = new AbilityListAdapter(this, heroInfo);
        //Tie adapter to listview
        listView.setAdapter(adapter);
    }

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!
    //
    //Look into filters for this
    //
    //!!!!!!!!!!!!!!!!!!!!!!!!!!!

    public class AbilityListAdapter extends ArrayAdapter<Hero>{
        Context context;
        public AbilityListAdapter(Context context, ArrayList<Hero> heroes){
            super(context, 0, heroes);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            //Get Database
            Hero currentHero = getItem(position);

            final ArrayList<String> primaryInfo = new ArrayList<String>();
            final ArrayList<String> secondaryInfo = new ArrayList<String>();
            final ArrayList<String> passiveInfo = new ArrayList<String>();
            final ArrayList<String> skill1Info = new ArrayList<String>();
            final ArrayList<String> skill2Info = new ArrayList<String>();
            final ArrayList<String> ultInfo = new ArrayList<String>();

            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview, parent, false);
            }

            RelativeLayout listItem = (RelativeLayout)convertView.findViewById(R.id.custom_listview);
            ImageView image = (ImageView)convertView.findViewById(R.id.ability_icon);
            TextView name = (TextView)convertView.findViewById(R.id.ability_name);
            TextView description = (TextView)convertView.findViewById(R.id.ability_description);

            //Standardize width and height of image
            image.getLayoutParams().width = 150;
            image.getLayoutParams().height = 150;

            final FragmentManager fm = getSupportFragmentManager();
            switch (position){
                case 0:
                    if(!primaryInfo.isEmpty()){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", primaryInfo);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(primaryInfo.get(3)));
                        name.setText(primaryInfo.get(1));
                        description.setText(primaryInfo.get(2));
                    }
                    break;
                case 1:
                    if(!secondaryInfo.isEmpty()){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", secondaryInfo);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(secondaryInfo.get(3)));
                        name.setText(secondaryInfo.get(1));
                        description.setText(secondaryInfo.get(2));
                    }
                    else if(!passiveInfo.isEmpty()){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", passiveInfo);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");}
                        });
                        image.setImageResource(Integer.parseInt(passiveInfo.get(3)));
                        name.setText(passiveInfo.get(1));
                        description.setText(passiveInfo.get(2));
                    }
                    else{
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", skill1Info);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(skill1Info.get(3)));
                        name.setText(skill1Info.get(1));
                        description.setText(skill1Info.get(2));
                    }
                    break;
                case 2:
                    if(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty()){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", passiveInfo);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(passiveInfo.get(3)));
                        name.setText(passiveInfo.get(1));
                        description.setText(passiveInfo.get(2));
                    }
                    else if((!secondaryInfo.isEmpty() && passiveInfo.isEmpty()) || (secondaryInfo.isEmpty() && !passiveInfo.isEmpty())){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", skill1Info);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(skill1Info.get(3)));
                        name.setText(skill1Info.get(1));
                        description.setText(skill1Info.get(2));
                    }
                    else{
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", skill2Info);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(skill2Info.get(3)));
                        name.setText(skill2Info.get(1));
                        description.setText(skill2Info.get(2));
                    }
                    break;
                case 3:
                    listItem.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList( "Ability Info", skill1Info);
                            innerFragment.setArguments(bundle);

                            //Display HeroAbilityFragment
                            innerFragment.show(fm, "fragment_hero_ability");
                        }
                    });
                    if(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && !skill1Info.isEmpty()){
                        image.setImageResource(Integer.parseInt(skill1Info.get(3)));
                        name.setText(skill1Info.get(1));
                        description.setText(skill1Info.get(2));
                    }
                    else if((secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && !skill1Info.isEmpty() && !skill2Info.isEmpty())
                            || (!secondaryInfo.isEmpty() && passiveInfo.isEmpty() && !skill1Info.isEmpty() && !skill2Info.isEmpty())
                            ||(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && skill1Info.isEmpty() && !skill2Info.isEmpty())){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", skill2Info);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(skill2Info.get(3)));
                        name.setText(skill2Info.get(1));
                        description.setText(skill2Info.get(2));
                    }
                    else if((secondaryInfo.isEmpty() && passiveInfo.isEmpty() && !skill2Info.isEmpty())){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", ultInfo);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(ultInfo.get(3)));
                        name.setText(ultInfo.get(1));
                        description.setText(ultInfo.get(2));
                    }
                    break;
                case 4:
                    if(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && !skill1Info.isEmpty() && !skill2Info.isEmpty()){
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", skill2Info);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(skill2Info.get(3)));
                        name.setText(skill2Info.get(1));
                        description.setText(skill2Info.get(2));
                    }
                    else{
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                                Bundle bundle = new Bundle();
                                bundle.putStringArrayList( "Ability Info", ultInfo);
                                innerFragment.setArguments(bundle);

                                //Display HeroAbilityFragment
                                innerFragment.show(fm, "fragment_hero_ability");
                            }
                        });
                        image.setImageResource(Integer.parseInt(ultInfo.get(3)));
                        name.setText(ultInfo.get(1));
                        description.setText(ultInfo.get(2));
                    }
                    break;
                case 5:
                    listItem.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            HeroAbilityFragment innerFragment = new HeroAbilityFragment();
                            Bundle bundle = new Bundle();
                            bundle.putStringArrayList( "Ability Info", ultInfo);
                            innerFragment.setArguments(bundle);

                            //Display HeroAbilityFragment
                            innerFragment.show(fm, "fragment_hero_ability");
                        }
                    });
                    image.setImageResource(Integer.parseInt(ultInfo.get(3)));
                    name.setText(ultInfo.get(1));
                    description.setText(ultInfo.get(2));
                    break;
            }

            return convertView;
        }
    }
}