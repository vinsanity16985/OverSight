package apps.vinsa_000.overwatchhelper.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import apps.vinsa_000.overwatchhelper.Utils.Constants;
import apps.vinsa_000.overwatchhelper.Activities.HeroDetailActivity;
import apps.vinsa_000.overwatchhelper.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HeroListFragment extends Fragment {

    private static final String TAG = "HeroListFragment";

    private FrameLayout genjiFrame, mccreeFrame, pharahFrame, reaperFrame, soldierFrame, tracerFrame, bastionFrame, hanzoFrame,
            junkratFrame, meiFrame, torbjornFrame, widowmakerFrame, dvaFrame, reinhardtFrame, roadhogFrame, winstonFrame,
            zaryaFrame, anaFrame, lucioFrame, mercyFrame, symmetraFrame, zenyattaFrame;

    public HeroListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hero_list, container, false);

        genjiFrame = (FrameLayout)view.findViewById(R.id.genji_frame);
        mccreeFrame = (FrameLayout)view.findViewById(R.id.mccree_frame);
        pharahFrame = (FrameLayout)view.findViewById(R.id.pharah_frame);
        reaperFrame = (FrameLayout)view.findViewById(R.id.reaper_frame);
        soldierFrame = (FrameLayout)view.findViewById(R.id.soldier_frame);
        tracerFrame = (FrameLayout)view.findViewById(R.id.tracer_frame);
        bastionFrame = (FrameLayout)view.findViewById(R.id.bastion_frame);
        hanzoFrame = (FrameLayout)view.findViewById(R.id.hanzo_frame);
        junkratFrame = (FrameLayout)view.findViewById(R.id.junkrat_frame);
        meiFrame = (FrameLayout)view.findViewById(R.id.mei_frame);
        torbjornFrame = (FrameLayout)view.findViewById(R.id.torbjorn_frame);
        widowmakerFrame = (FrameLayout)view.findViewById(R.id.widowmaker_frame);
        dvaFrame = (FrameLayout)view.findViewById(R.id.dva_frame);
        reinhardtFrame = (FrameLayout)view.findViewById(R.id.reinhardt_frame);
        roadhogFrame = (FrameLayout)view.findViewById(R.id.roadhog_frame);
        winstonFrame = (FrameLayout)view.findViewById(R.id.winston_frame);
        zaryaFrame = (FrameLayout)view.findViewById(R.id.zarya_frame);
        anaFrame = (FrameLayout)view.findViewById(R.id.ana_frame);
        lucioFrame = (FrameLayout)view.findViewById(R.id.lucio_frame);
        mercyFrame = (FrameLayout)view.findViewById(R.id.mercy_frame);
        symmetraFrame = (FrameLayout)view.findViewById(R.id.symmetra_frame);
        zenyattaFrame = (FrameLayout)view.findViewById(R.id.zenyatta_frame);

        setOnClicks(genjiFrame, Constants.GENJI);
        setOnClicks(mccreeFrame, Constants.MCCREE);
        setOnClicks(pharahFrame, Constants.PHARAH);
        setOnClicks(reaperFrame, Constants.REAPER);
        setOnClicks(soldierFrame, Constants.SOLDIER);
        setOnClicks(tracerFrame, Constants.TRACER);
        setOnClicks(bastionFrame, Constants.BASTION);
        setOnClicks(hanzoFrame, Constants.HANZO);
        setOnClicks(junkratFrame, Constants.JUNKRAT);
        setOnClicks(meiFrame, Constants.MEI);
        setOnClicks(torbjornFrame, Constants.TORBJORN);
        setOnClicks(widowmakerFrame, Constants.WIDOWMAKER);
        setOnClicks(dvaFrame, Constants.DVA);
        setOnClicks(reinhardtFrame, Constants.REINHARDT);
        setOnClicks(roadhogFrame, Constants.ROADHOG);
        setOnClicks(winstonFrame, Constants.WINSTON);
        setOnClicks(zaryaFrame, Constants.ZARYA);
        setOnClicks(anaFrame, Constants.ANA);
        setOnClicks(lucioFrame, Constants.LUCIO);
        setOnClicks(mercyFrame, Constants.MERCY);
        setOnClicks(symmetraFrame, Constants.SYMMETRA);
        setOnClicks(zenyattaFrame, Constants.ZENYATTA);

        // Inflate the layout for this fragment
        return view;
    }

    private void setOnClicks(View view, final int heroNum){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, heroNum + "");
                Intent intent = new Intent(getContext(), HeroDetailActivity.class);
                intent.putExtra("Hero Number", heroNum);
                startActivity(intent);
            }
        });
    }
}
