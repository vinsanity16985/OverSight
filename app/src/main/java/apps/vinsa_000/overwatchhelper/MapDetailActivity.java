package apps.vinsa_000.overwatchhelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MapDetailActivity extends AppCompatActivity {
    private ImageView mapPic;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_detail);

        intent = getIntent();
        mapPic = (ImageView)findViewById(R.id.map_pic);

        int mapNum = intent.getIntExtra("Map Number", Constants.NO_NUM);
        setPic(mapNum);
    }

    private void setPic(int mapNum){
        switch(mapNum){
            case Constants.HANAMURA:
                mapPic.setImageResource(R.drawable.hanamura);
                break;
            case Constants.ANUBIS:
                mapPic.setImageResource(R.drawable.anubis);
                break;
            case Constants.VOLSKAYA:
                mapPic.setImageResource(R.drawable.volskaya);
                break;
            case Constants.DORADO:
                mapPic.setImageResource(R.drawable.dorado);
                break;
            case Constants.ROUTE66:
                mapPic.setImageResource(R.drawable.route66);
                break;
            case Constants.GIBRALTAR:
                mapPic.setImageResource(R.drawable.gibraltar);
                break;
            case Constants.EICHENWALDE:
                mapPic.setImageResource(R.drawable.eichenwalde);
                break;
            case Constants.HOLLYWOOD:
                mapPic.setImageResource(R.drawable.hollywood);
                break;
            case Constants.KINGSROW:
                mapPic.setImageResource(R.drawable.kingsrow);
                break;
            case Constants.NUMBANI:
                mapPic.setImageResource(R.drawable.numbani);
                break;
            case Constants.ILIOS:
                mapPic.setImageResource(R.drawable.ilios);
                break;
            case Constants.LIJIANG:
                mapPic.setImageResource(R.drawable.lijiang);
                break;
            case Constants.NEPAL:
                mapPic.setImageResource(R.drawable.nepal);
                break;
        }
    }
}
