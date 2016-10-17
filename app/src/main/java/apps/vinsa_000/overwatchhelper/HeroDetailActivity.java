package apps.vinsa_000.overwatchhelper;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroDetailActivity extends AppCompatActivity{
    private Intent intent;
    ListView listView;
    Hero hero;

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
        setContentView(R.layout.hero_detail_layout);

        //Grab intent and heroNum
        intent = getIntent();
        int heroNum = intent.getIntExtra("Hero Number", Constants.NO_NUM);

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

        //Specify which hero to get data for using heroNum
        hero = new Hero(heroNum, this);
        //Set up hero's basic info
        getBasicInfo();
        //Set up hero's abilities list
        setUpAbilityListView();
    }

    private void getBasicInfo(){
        ArrayList<String> heroBasicInfo = hero.getBasicInfo();

        heroName.setText("Name: " + heroBasicInfo.get(0));
        heroAge.setText("Age: " + heroBasicInfo.get(1));
        heroHeight.setText("Height: " + heroBasicInfo.get(2));
        heroDifficulty.setText("Difficulty: " + heroBasicInfo.get(3));
        heroHealth.setText("Health: " + heroBasicInfo.get(4));
        heroArmor.setText("Armor: " + heroBasicInfo.get(5));
        heroShield.setText("Shield: " + heroBasicInfo.get(6));
        heroTotal.setText("Total: " + heroBasicInfo.get(7));
        heroPortrait.setImageResource(Integer.parseInt(heroBasicInfo.get(8)));
    }
    private void setUpAbilityListView() {
        //Populate list of hero info
        ArrayList<Hero> heroInfo = new ArrayList<Hero>();
        for(int i = 0; i < hero.getNumAbilities(); i++){
            Hero temp = hero;
            heroInfo.add(temp);
        }
        //Place in adapter
        AbilityListAdapter adapter = new AbilityListAdapter(this, heroInfo);

        //Tie adapter to listview
        listView.setAdapter(adapter);
    }

    public class AbilityListAdapter extends ArrayAdapter<Hero>{
        Context context;
        public AbilityListAdapter(Context context, ArrayList<Hero> heroes){
            super(context, 0, heroes);
            this.context = context;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            Hero currentHero = getItem(position);
            ArrayList<String> primaryInfo = currentHero.getPrimaryInfo();
            ArrayList<String> secondaryInfo = currentHero.getSecondaryInfo();
            ArrayList<String> passiveInfo = currentHero.getPassiveInfo();
            ArrayList<String> skill1Info = currentHero.getSkill1Info();
            ArrayList<String> skill2info = currentHero.getSkill2Info();
            ArrayList<String> ultInfo = currentHero.getUltInfo();

            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview, parent, false);
            }

            RelativeLayout listItem = (RelativeLayout)convertView.findViewById(R.id.custom_listview);
            ImageView image = (ImageView)convertView.findViewById(R.id.ability_icon);
            TextView name = (TextView)convertView.findViewById(R.id.ability_name);
            TextView description = (TextView)convertView.findViewById(R.id.ability_description);

            switch (position){
                case 0:
                    if(!primaryInfo.isEmpty()){
                        image.setImageResource(R.drawable.primary_genji);
                        name.setText(primaryInfo.get(0));
                        description.setText(primaryInfo.get(1));
                    }
                    break;
                case 1:
                    if(!secondaryInfo.isEmpty()){
                        image.setImageResource(R.drawable.primary_genji);
                        name.setText(secondaryInfo.get(0));
                        description.setText(secondaryInfo.get(1));
                    }
                    else if(!passiveInfo.isEmpty()){
                        image.setImageResource(R.drawable.passive_genji);
                        name.setText(passiveInfo.get(0));
                        description.setText(passiveInfo.get(1));
                    }
                    else{
                        image.setImageResource(R.drawable.skill1_genji);
                        name.setText(skill1Info.get(0));
                        description.setText(skill1Info.get(1));
                    }
                    break;
                case 2:
                    if(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty()){
                        image.setImageResource(R.drawable.passive_genji);
                        name.setText(passiveInfo.get(0));
                        description.setText(passiveInfo.get(1));
                    }
                    else if((!secondaryInfo.isEmpty() && passiveInfo.isEmpty()) || (secondaryInfo.isEmpty() && !passiveInfo.isEmpty())){
                        image.setImageResource(R.drawable.skill1_genji);
                        name.setText(skill1Info.get(0));
                        description.setText(skill1Info.get(1));
                    }
                    else{
                        image.setImageResource(R.drawable.skill2_genji);
                        name.setText(skill2info.get(0));
                        description.setText(skill2info.get(1));
                    }
                    break;
                case 3:
                    if(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && !skill1Info.isEmpty()){
                        image.setImageResource(R.drawable.skill1_genji);
                        name.setText(skill1Info.get(0));
                        description.setText(skill1Info.get(1));
                    }
                    else if((secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && !skill1Info.isEmpty() && !skill2info.isEmpty())
                            || (!secondaryInfo.isEmpty() && passiveInfo.isEmpty() && !skill1Info.isEmpty() && !skill2info.isEmpty())
                            ||(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && skill1Info.isEmpty() && !skill2info.isEmpty())){
                        image.setImageResource(R.drawable.skill2_genji);
                        name.setText(skill2info.get(0));
                        description.setText(skill2info.get(1));
                    }
                    else if((secondaryInfo.isEmpty() && passiveInfo.isEmpty() && !skill2info.isEmpty())){
                        image.setImageResource(R.drawable.ult_genji);
                        name.setText(ultInfo.get(0));
                        description.setText(ultInfo.get(1));
                    }
                    break;
                case 4:
                    if(!secondaryInfo.isEmpty() && !passiveInfo.isEmpty() && !skill1Info.isEmpty() && !skill2info.isEmpty()){
                        image.setImageResource(R.drawable.skill2_genji);
                        name.setText(skill2info.get(0));
                        description.setText(skill2info.get(1));
                    }
                    else{
                        image.setImageResource(R.drawable.ult_genji);
                        name.setText(ultInfo.get(0));
                        description.setText(ultInfo.get(1));
                    }
                    break;
                case 5:
                    image.setImageResource(R.drawable.ult_genji);
                    name.setText(ultInfo.get(0));
                    description.setText(ultInfo.get(1));
                    break;
            }

            return convertView;
        }
    }
}
