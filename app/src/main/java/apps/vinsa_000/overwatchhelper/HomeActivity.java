package apps.vinsa_000.overwatchhelper;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class HomeActivity extends AppCompatActivity {
    ViewPager viewPager;
    MyPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Set up the ViewPager
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        //Set up the TabLayout and connect to the ViewPager
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void createDatabase(){
        //Get helper
        DatabaseHelper dbHelper = new DatabaseHelper(getBaseContext());

        //Get database
        //If it doesn't exist then create one
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        //Create entries
        ContentValues values = new ContentValues();

        values.put(DatabaseContract.HeroTable.NAME_COL2, "Genji");

        //INSERT into Database
        //returns unigue value for new row
        long newRowId;
        newRowId = db.insert(
                DatabaseContract.HeroTable.TABLE_NAME,
                null,
                values
        );


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
