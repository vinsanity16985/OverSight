package apps.vinsa_000.overwatchhelper.Fragments;


import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apps.vinsa_000.overwatchhelper.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RootFragment extends Fragment{
    private static final String TAG = "RootFragment";
    SharedPreferences myPrefs;

    public RootFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_root, container, false);
        myPrefs = PreferenceManager.getDefaultSharedPreferences(view.getContext());

        //Fill root with Login Fragment
        if(myPrefs.contains("Logged In") && myPrefs.getBoolean("Logged In", true)){
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.root_frame, new UserDetailFragment());
            ft.commit();
        }
        else{
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.root_frame, new UserLoginFragment());
            ft.commit();
        }
        return view;
    }

}
