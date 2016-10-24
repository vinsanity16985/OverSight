package apps.vinsa_000.overwatchhelper;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link DialogFragment} subclass.
 */
public class HeroAbilityFragment extends DialogFragment {
    private ArrayList<String> abilityData;
    private TextView abilityTitle;
    private TextView abilityName;

    public HeroAbilityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hero_ability, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        abilityData = getArguments().getStringArrayList("Ability Info");
        abilityTitle = (TextView) view.findViewById(R.id.fragment_abilityTitle);
        abilityName = (TextView) view.findViewById(R.id.fragment_abilityName);

        setUpFragmentLayout();
    }

    private void setUpFragmentLayout(){
        abilityTitle.setText(abilityData.get(0).toUpperCase());
        abilityName.setText(abilityData.get(1));
        switch(abilityData.get(0)){
            case "primary":

                break;
            case "secondary":
                break;
            case "passive":
                break;
            case "skill 1":
                break;
            case "skill 2":
                break;
            case "ultimate":
                break;
        }
    }

}
