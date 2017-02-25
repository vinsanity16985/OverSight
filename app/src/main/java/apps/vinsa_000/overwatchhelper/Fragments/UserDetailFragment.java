package apps.vinsa_000.overwatchhelper.Fragments;


import android.support.v4.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import apps.vinsa_000.overwatchhelper.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserDetailFragment extends Fragment implements View.OnClickListener{
    SharedPreferences myPrefs;
    Button logoutButton;

    public UserDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_detail, container, false);

        logoutButton = (Button)view.findViewById(R.id.logout_button);
        myPrefs = PreferenceManager.getDefaultSharedPreferences(view.getContext());

        logoutButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("BattleTag", "");
        editor.putString("Platform", "");
        editor.putString("Region", "");
        editor.putBoolean("Logged In", false);
        editor.commit();

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.root_frame, new UserLoginFragment());
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();
    }
}
