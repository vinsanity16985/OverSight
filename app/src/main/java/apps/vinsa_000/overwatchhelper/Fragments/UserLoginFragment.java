package apps.vinsa_000.overwatchhelper.Fragments;


import android.support.v4.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import apps.vinsa_000.overwatchhelper.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserLoginFragment extends Fragment implements View.OnClickListener{

    private static final String TAG = "UserLoginFragment";

    SharedPreferences myPrefs;
    EditText battleTag;
    Spinner platformSpinner;
    Spinner regionSpinner;
    Button loginButton;

    public UserLoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_login, container, false);
        loginButton = (Button)view.findViewById(R.id.login_button);
        myPrefs = PreferenceManager.getDefaultSharedPreferences(view.getContext());
        battleTag = (EditText)view.findViewById(R.id.battle_tag_edit);

        //Set up platform spinner
        platformSpinner = (Spinner)view.findViewById(R.id.platform_spinner);
        ArrayAdapter<CharSequence> platformAdapter = ArrayAdapter.createFromResource(view.getContext(), R.array.platforms, android.R.layout.simple_spinner_item);
        platformAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        platformSpinner.setAdapter(platformAdapter);

        //Set up region spinner
        regionSpinner = (Spinner)view.findViewById(R.id.region_spinner);
        ArrayAdapter<CharSequence> regionAdapter = ArrayAdapter.createFromResource(view.getContext(), R.array.regions, android.R.layout.simple_spinner_item);
        regionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        regionSpinner.setAdapter(regionAdapter);

        //Set up button click handler
        loginButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        if(battleTag.getText().toString().matches("")){
            battleTag.setHint("Please Enter");
            return;
        }

        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("BattleTag", battleTag.getText().toString());
        editor.putString("Platform", platformSpinner.getSelectedItem().toString());
        editor.putString("Region", regionSpinner.getSelectedItem().toString());
        editor.putBoolean("Logged In", true);
        editor.commit();

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.root_frame, new UserDetailFragment());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();

    }
}
