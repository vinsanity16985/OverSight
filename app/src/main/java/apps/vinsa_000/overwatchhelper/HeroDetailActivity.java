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
import android.widget.Toast;

import java.util.ArrayList;

public class HeroDetailActivity extends AppCompatActivity{
    private Intent intent;
    ListView listView;
    Hero hero;
    ArrayList<String> heroBasicInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = getIntent();
        int heroNum = intent.getIntExtra("Hero Number", Constants.NO_NUM);
        //Sets correct layout to display hero requested
        setHeroDetail(heroNum);

        hero = new Hero(heroNum);
        listView = (ListView)findViewById(R.id.hero_ability_list);
        populateListView();
    }

    private void populateListView() {
        //Populate list of hero info
        ArrayList<Hero> heroInfo = new ArrayList<Hero>();
        for(int i = 0; i < hero.numAbilities; i++){
            Hero temp = hero;
            heroInfo.add(temp);
        }
        //Place in adapter
        AbilityListAdapter adapter = new AbilityListAdapter(this, heroInfo);

        //Tie adapter to listview
        listView.setAdapter(adapter);
    }

    private void setHeroDetail(int heroNum){
        switch(heroNum){
            case Constants.GENJI:
                setContentView(R.layout.genji_layout);
                break;
            case Constants.MCCREE:
                setContentView(R.layout.mccree_layout);
                break;
            case Constants.PHARAH:
                setContentView(R.layout.pharah_layout);
                break;
            case Constants.REAPER:
                setContentView(R.layout.reaper_layout);
                break;
            case Constants.SOLDIER:
                setContentView(R.layout.soldier_layout);
                break;
            case Constants.TRACER:
                setContentView(R.layout.tracer_layout);
                break;
            case Constants.BASTION:
                setContentView(R.layout.bastion_layout);
                break;
            case Constants.HANZO:
                setContentView(R.layout.hanzo_layout);
                break;
            case Constants.JUNKRAT:
                setContentView(R.layout.junkrat_layout);
                break;
            case Constants.MEI:
                setContentView(R.layout.mei_layout);
                break;
            case Constants.TORBJORN:
                setContentView(R.layout.torbjorn_layout);
                break;
            case Constants.WIDOWMAKER:
                setContentView(R.layout.widowmaker_layout);
                break;
            case Constants.DVA:
                setContentView(R.layout.dva_layout);
                break;
            case Constants.REINHARDT:
                setContentView(R.layout.reinhardt_layout);
                break;
            case Constants.ROADHOG:
                setContentView(R.layout.roadhog_layout);
                break;
            case Constants.WINSTON:
                setContentView(R.layout.winston_layout);
                break;
            case Constants.ZARYA:
                setContentView(R.layout.zarya_layout);
                break;
            case Constants.ANA:
                setContentView(R.layout.ana_layout);
                break;
            case Constants.LUCIO:
                setContentView(R.layout.lucio_layout);
                break;
            case Constants.MERCY:
                setContentView(R.layout.mercy_layout);
                break;
            case Constants.SYMMETRA:
                setContentView(R.layout.symmetra_layout);
                break;
            case Constants.ZENYATTA:
                setContentView(R.layout.zenyatta_layout);
                break;
        }
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

            if(convertView == null){
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_listview, parent, false);
            }

            RelativeLayout listItem = (RelativeLayout)convertView.findViewById(R.id.custom_listview);
            ImageView image = (ImageView)convertView.findViewById(R.id.ability_icon);
            TextView name = (TextView)convertView.findViewById(R.id.ability_name);
            TextView description = (TextView)convertView.findViewById(R.id.ability_description);

            switch (position){
                case 0:
                    if(currentHero.hasPrimary){
                        image.setImageResource(R.drawable.primary_genji);
                        name.setText(currentHero.primaryName);
                        description.setText(currentHero.primaryDescription);
                        listItem.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast toast = Toast.makeText(context, "Primary", Toast.LENGTH_SHORT);
                                toast.show();
                            }
                        });
                    }
                    break;
                case 1:
                    if(currentHero.hasSecondary){
                        image.setImageResource(R.drawable.primary_genji);
                        name.setText(currentHero.secondaryName);
                        description.setText(currentHero.secondaryDescription);
                    }
                    else if(currentHero.hasPassive){
                        image.setImageResource(R.drawable.passive_genji);
                        name.setText(currentHero.passiveName);
                        description.setText(currentHero.passiveDescription);
                    }
                    else{
                        image.setImageResource(R.drawable.skill1_genji);
                        name.setText(currentHero.skill1Name);
                        description.setText(currentHero.skill1Description);
                    }
                    break;
                case 2:
                    if(currentHero.hasSecondary && currentHero.hasPassive){
                        image.setImageResource(R.drawable.passive_genji);
                        name.setText(currentHero.passiveName);
                        description.setText(currentHero.passiveDescription);
                    }
                    else if((currentHero.hasSecondary && !currentHero.hasPassive) || (!currentHero.hasSecondary && currentHero.hasPassive)){
                        image.setImageResource(R.drawable.skill1_genji);
                        name.setText(currentHero.skill1Name);
                        description.setText(currentHero.skill1Description);
                    }
                    else{
                        image.setImageResource(R.drawable.skill2_genji);
                        name.setText(currentHero.skill2Name);
                        description.setText(currentHero.skill2Description);
                    }
                    break;
                case 3:
                    if(currentHero.hasSecondary && currentHero.hasPassive && currentHero.hasSkill1){
                        image.setImageResource(R.drawable.skill1_genji);
                        name.setText(currentHero.skill1Name);
                        description.setText(currentHero.skill1Description);
                    }
                    else if((!currentHero.hasSecondary && currentHero.hasPassive && currentHero.hasSkill1 && currentHero.hasSkill2) || (currentHero.hasSecondary && !currentHero.hasPassive && currentHero.hasSkill1 && currentHero.hasSkill2)||(currentHero.hasSecondary && currentHero.hasPassive && !currentHero.hasSkill1 && currentHero.hasSkill2)){
                        image.setImageResource(R.drawable.skill2_genji);
                        name.setText(currentHero.skill2Name);
                        description.setText(currentHero.skill2Description);
                    }
                    else if((!currentHero.hasSecondary && !currentHero.hasPassive && currentHero.hasSkill2)){
                        image.setImageResource(R.drawable.ult_genji);
                        name.setText(currentHero.ultName);
                        description.setText(currentHero.ultDescription);
                    }
                    break;
                case 4:
                    if(currentHero.hasSecondary && currentHero.hasPassive && currentHero.hasSkill1 && currentHero.hasSkill2){
                        image.setImageResource(R.drawable.skill2_genji);
                        name.setText(currentHero.skill2Name);
                        description.setText(currentHero.skill2Description);
                    }
                    else{
                        image.setImageResource(R.drawable.ult_genji);
                        name.setText(currentHero.ultName);
                        description.setText(currentHero.ultDescription);
                    }
                    break;
                case 5:
                    image.setImageResource(R.drawable.ult_genji);
                    name.setText(currentHero.ultName);
                    description.setText(currentHero.ultDescription);
                    break;
            }

            return convertView;
        }
    }
}
