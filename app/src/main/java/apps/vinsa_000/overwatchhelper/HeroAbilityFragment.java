package apps.vinsa_000.overwatchhelper;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link DialogFragment} subclass.
 */
public class HeroAbilityFragment extends DialogFragment {
    private ArrayList<String> abilityData;
    private TextView abilityTitle;
    private ImageView abilityIcon;
    private TextView abilityName;
    private RelativeLayout abilityInfoLayout;

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
        abilityIcon = (ImageView) view.findViewById(R.id.fragment_abilityIcon);
        abilityName = (TextView) view.findViewById(R.id.fragment_abilityName);
        abilityInfoLayout = (RelativeLayout)view.findViewById(R.id.fragment_abilityInfo);

        setUpFragmentLayout();
    }

    private void setUpFragmentLayout(){
        abilityTitle.setText(abilityData.get(0).toUpperCase());
        abilityName.setText(abilityData.get(1));
        abilityIcon.setImageResource(Integer.parseInt(abilityData.get(3)));
        //Give icon a standard size
        abilityIcon.getLayoutParams().height = 100;
        abilityIcon.getLayoutParams().width = 100;

        switchLayouts();
    }

    private void switchLayouts(){
        ViewGroup parent = (ViewGroup)abilityInfoLayout.getParent();
        int index = parent.indexOfChild(abilityInfoLayout);

        parent.removeView(abilityInfoLayout);
        abilityInfoLayout = createInfoLayout();
        parent.addView(abilityInfoLayout, index);
    }

    private RelativeLayout createInfoLayout(){
        //Set up main layout
        RelativeLayout layout = new RelativeLayout(getContext());
        LinearLayout.LayoutParams mainParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        mainParams.gravity = Gravity.CENTER_HORIZONTAL;

        RelativeLayout.LayoutParams rlParams1 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams rlParams2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);


        layout.setLayoutParams(mainParams);
        layout.setPadding(10,10,10,10);

        //Set up two linear layouts
        LinearLayout titlesLayout = new LinearLayout(getContext());
        LinearLayout itemsLayout = new LinearLayout(getContext());

        titlesLayout.setId(1);
        titlesLayout.setOrientation(LinearLayout.VERTICAL);
        titlesLayout.setLayoutParams(rlParams1);
        itemsLayout.setId(2);
        itemsLayout.setOrientation(LinearLayout.VERTICAL);
        rlParams2.addRule(RelativeLayout.ALIGN_TOP, titlesLayout.getId());
        rlParams2.addRule(RelativeLayout.RIGHT_OF, titlesLayout.getId());
        itemsLayout.setLayoutParams(rlParams2);

        int endTitles = abilityData.size() - ((abilityData.size() - 4)/2);
        //Set up info title
        for(int i = 4; i < endTitles; i++){
            LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            llParams.setMargins(0,5,0,0);

            TextView infoTitle = new TextView(getContext());
            infoTitle.setText(abilityData.get(i));
            infoTitle.setBackground(getResources().getDrawable(R.drawable.info_title_background));
            infoTitle.setGravity(Gravity.RIGHT);
            infoTitle.setTextAppearance(getContext(), R.style.fontAbilityFragmentTitles);
            //infoTitle.setBackground(getResources().getDrawable(R.drawable.info_title_background));
            infoTitle.setLayoutParams(llParams);

            titlesLayout.addView(infoTitle);
        }
        //Set up info items
        for(int i = endTitles; i < abilityData.size(); i++){
            LinearLayout.LayoutParams llParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            llParams.setMargins(20,0,0,20);

            TextView infoItem = new TextView(getContext());
            infoItem.setText(abilityData.get(i));
            infoItem.setTextColor(getResources().getColor(R.color.colorText));
            infoItem.setTextSize(20);
            infoItem.setLayoutParams(llParams);

            itemsLayout.addView(infoItem);
        }
        layout.addView(titlesLayout);
        layout.addView(itemsLayout);

        return layout;
    }
}
