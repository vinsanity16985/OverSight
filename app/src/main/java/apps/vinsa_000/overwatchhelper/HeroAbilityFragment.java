package apps.vinsa_000.overwatchhelper;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroAbilityFragment extends Fragment {
    private ArrayList<String> abilityInfo;
    private TextView test;


    public HeroAbilityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_hero_ability, container, false);

        abilityInfo = getArguments().getStringArrayList("Ability Info");
        test = (TextView) view.findViewById(R.id.test);

        //Test text
        test.setText("This is a test.");

        return view;
    }

}
