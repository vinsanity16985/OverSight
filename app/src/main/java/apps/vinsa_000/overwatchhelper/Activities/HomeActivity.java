package apps.vinsa_000.overwatchhelper.Activities;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;
import java.io.InputStream;

import apps.vinsa_000.overwatchhelper.Fragments.HeroListFragment;
import apps.vinsa_000.overwatchhelper.Fragments.MapListFragment;
import apps.vinsa_000.overwatchhelper.Fragments.RootFragment;
import apps.vinsa_000.overwatchhelper.R;
import apps.vinsa_000.overwatchhelper.Utils.XMLParser;


public class HomeActivity extends AppCompatActivity {
    private static final String TAG = "HomeActivity";

    private ViewPager viewPager;
    private MyPagerAdapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setUpPage();
    }

    private void setUpPage(){
        //Set up the ViewPager
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        //Set up the TabLayout and connect to the ViewPager
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    //Adapter used to populate the ViewPager with fragments
    public class MyPagerAdapter extends FragmentPagerAdapter {

        String[] titles = {"Heroes", "Maps", "User Stats"};

        public MyPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public int getCount() {
            return titles.length;
        }
        @Override
        public Fragment getItem(int position){
            switch(position){
                case 0:
                    return new HeroListFragment();
                case 1:
                    return new MapListFragment();
                case 2:
                    return new RootFragment();
                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position){
            return titles[position];
        }

    }
}
