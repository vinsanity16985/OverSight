package apps.vinsa_000.overwatchhelper;


import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapListFragment extends Fragment {
    private FrameLayout hanamuraFrame, anubisFrame, volskayaFrame, doradoFrame, route66Frame, gibraltarFrame,
            eichenwaldeFrame, hollywoodFrame, kingsrowFrame, numbaniFrame, iliosFrame, lijiangFrame, nepalFrame;

    public MapListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map_list, container, false);

        hanamuraFrame = (FrameLayout)view.findViewById(R.id.hanamura_frame);
        anubisFrame = (FrameLayout)view.findViewById(R.id.anubis_frame);
        volskayaFrame = (FrameLayout)view.findViewById(R.id.volskaya_frame);
        doradoFrame = (FrameLayout)view.findViewById(R.id.dorado_frame);
        route66Frame = (FrameLayout)view.findViewById(R.id.route66_frame);
        gibraltarFrame = (FrameLayout)view.findViewById(R.id.gibraltar_frame);
        eichenwaldeFrame = (FrameLayout)view.findViewById(R.id.eichenwalde_frame);
        hollywoodFrame = (FrameLayout)view.findViewById(R.id.hollywood_frame);
        kingsrowFrame = (FrameLayout)view.findViewById(R.id.kingsrow_frame);
        numbaniFrame = (FrameLayout)view.findViewById(R.id.numbani_frame);
        iliosFrame = (FrameLayout)view.findViewById(R.id.ilios_frame);
        lijiangFrame = (FrameLayout)view.findViewById(R.id.lijiang_frame);
        nepalFrame = (FrameLayout)view.findViewById(R.id.nepal_frame);

        setOnClicks(hanamuraFrame, Constants.HANAMURA);
        setOnClicks(anubisFrame, Constants.ANUBIS);
        setOnClicks(volskayaFrame, Constants.VOLSKAYA);
        setOnClicks(doradoFrame, Constants.DORADO);
        setOnClicks(route66Frame, Constants.ROUTE66);
        setOnClicks(gibraltarFrame, Constants.GIBRALTAR);
        setOnClicks(eichenwaldeFrame, Constants.EICHENWALDE);
        setOnClicks(hollywoodFrame, Constants.HOLLYWOOD);
        setOnClicks(kingsrowFrame, Constants.KINGSROW);
        setOnClicks(numbaniFrame, Constants.NUMBANI);
        setOnClicks(iliosFrame, Constants.ILIOS);
        setOnClicks(lijiangFrame, Constants.LIJIANG);
        setOnClicks(nepalFrame, Constants.NEPAL);
        // Inflate the layout for this fragment
        return view;
    }

    private void setOnClicks(View view, final int mapNum){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), MapDetailActivity.class);
                intent.putExtra("Map Number", mapNum);
                startActivity(intent);
            }
        });
    }

}
