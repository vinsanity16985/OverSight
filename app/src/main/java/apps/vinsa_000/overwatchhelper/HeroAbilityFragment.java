package apps.vinsa_000.overwatchhelper;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
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
    private final int ID1 = 1;
    private final int ID2 = 2;

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

    private void setUpFragmentLayout() {
        abilityTitle.setText(abilityData.get(0).toUpperCase());
        abilityName.setText(abilityData.get(1));
        abilityIcon.setImageResource(Integer.parseInt(abilityData.get(3)));
        //Give icon a standard size
        abilityIcon.getLayoutParams().height = 100;
        abilityIcon.getLayoutParams().width = 100;

        //Switch layouts
        ViewGroup parent = (ViewGroup) abilityInfoLayout.getParent();
        int index = parent.indexOfChild(abilityInfoLayout);

        parent.removeView(abilityInfoLayout);
        abilityInfoLayout = createInfoLayout();
        parent.addView(abilityInfoLayout, index);
    }

    private RelativeLayout createInfoLayout(){
        //Create main layout
        RelativeLayout layout = new RelativeLayout(getContext());
        LinearLayout.LayoutParams mainParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        mainParams.gravity = Gravity.CENTER_HORIZONTAL;

        //Set the main layouts layoutParams and padding
        layout.setLayoutParams(mainParams);
        layout.setPadding(10,10,10,10);

        //Set up vertical LinearLayout to add horizontal rows // TODO: 11/4/2016
        LinearLayout verticalLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams verticalParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        verticalLayout.setLayoutParams(verticalParams);
        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        layout.addView(verticalLayout);

        int endTitles = abilityData.size() - ((abilityData.size() - 4)/2);
        int offSet = endTitles - 4;
        //Iterate through data
        for(int i = 4; i < endTitles; i++) {
            //Set up one row of ability data
            RelativeLayout abilityItem = new RelativeLayout(getContext());
            LinearLayout.LayoutParams rowParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
            rowParams.setMargins(0,0,0,10);
            abilityItem.setLayoutParams(rowParams);
            verticalLayout.addView(abilityItem);

            //Set up title TextView
            TextView infoTitle = new TextView(getContext());
            RelativeLayout.LayoutParams titleParams = new RelativeLayout.LayoutParams(600, RelativeLayout.LayoutParams.WRAP_CONTENT);
            titleParams.setMargins(0,0,15,0);
            infoTitle.setId(ID1);
            infoTitle.setText(abilityData.get(i));
            infoTitle.setBackground(getResources().getDrawable(R.drawable.info_title_background));
            infoTitle.setGravity(Gravity.RIGHT);
            infoTitle.setTextAppearance(getContext(), R.style.fontAbilityFragmentTitles);
            infoTitle.setLayoutParams(titleParams);
            abilityItem.addView(infoTitle);

            //Set up item TextView
            TextView infoItem = new TextView(getContext());
            RelativeLayout.LayoutParams itemParams = new RelativeLayout.LayoutParams(500, RelativeLayout.LayoutParams.WRAP_CONTENT);
            itemParams.addRule(RelativeLayout.ALIGN_TOP, infoTitle.getId());
            itemParams.addRule(RelativeLayout.RIGHT_OF, infoTitle.getId());
            infoItem.setId(ID2);
            infoItem.setMovementMethod(new ScrollingMovementMethod());
            infoItem.setSingleLine(true);
            infoItem.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            infoItem.setLines(1);
            infoItem.setSelected(true);
            infoItem.setHorizontallyScrolling(true);
            infoItem.setText(abilityData.get(i+offSet));
            infoItem.setTextColor(getResources().getColor(R.color.colorText));
            infoItem.setTextSize(20);
            infoItem.setLayoutParams(itemParams);
            abilityItem.addView(infoItem);

            /*abilityData.add("test"); TODO: 11/4/2016  Add any optional data to row layout
            int optionalData = (4 + (2 * offSet));
            if(abilityData.size() > optionalData && abilityData.get(optionalData) != null){
                //Set up optional TextView
                TextView optionalItem = new TextView(getContext());
                RelativeLayout.LayoutParams optionalParams = new RelativeLayout.LayoutParams(500, RelativeLayout.LayoutParams.WRAP_CONTENT);
                optionalParams.addRule(RelativeLayout.ALIGN_LEFT, infoItem.getId());
                optionalParams.addRule(RelativeLayout.BELOW, infoItem.getId());
                optionalItem.setMovementMethod(new ScrollingMovementMethod());
                optionalItem.setSingleLine(true);
                optionalItem.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                optionalItem.setLines(1);
                optionalItem.setSelected(true);
                optionalItem.setHorizontallyScrolling(true);
                optionalItem.setText(abilityData.get(0));
                optionalItem.setTextColor(getResources().getColor(R.color.colorText));
                optionalItem.setTextSize(20);
                optionalItem.setLayoutParams(optionalParams);
                abilityItem.addView(optionalItem);
            }*/
        }

        /*Create LayoutParams for
        RelativeLayout.LayoutParams rlParams1 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams rlParams2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        //Set up two Relative layouts
        RelativeLayout titlesLayout = new RelativeLayout(getContext());
        RelativeLayout itemsLayout = new RelativeLayout(getContext());

        titlesLayout.setId(ID1);
        titlesLayout.setLayoutParams(rlParams1);
        itemsLayout.setId(ID2);
        rlParams2.addRule(RelativeLayout.ALIGN_TOP, titlesLayout.getId());
        rlParams2.addRule(RelativeLayout.RIGHT_OF, titlesLayout.getId());
        itemsLayout.setLayoutParams(rlParams2);

        }

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
            infoItem.setMovementMethod(new ScrollingMovementMethod());
            infoItem.setSingleLine(true);
            infoItem.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            infoItem.setLines(1);
            infoItem.setSelected(true);
            infoItem.setHorizontallyScrolling(true);
            infoItem.setText(abilityData.get(i));
            infoItem.setTextColor(getResources().getColor(R.color.colorText));
            infoItem.setTextSize(20);
            infoItem.setLayoutParams(llParams);

            itemsLayout.addView(infoItem);
        }
        layout.addView(titlesLayout);
        layout.addView(itemsLayout);
        */
        return layout;
    }
}
