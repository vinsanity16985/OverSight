package apps.vinsa_000.overwatchhelper.Utils;

import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by vinsa_000 on 3/6/2017.
 */
public class NetworkUtils {

    private static final String FILE_URL = "http://www.filehosting.org/file/details/646476/restructuredheroes.xml";
    private static final int SUCCESS = 1;
    private static final int FAIL = -1;

    private Context context;

    public NetworkUtils(Context c){
        context = c;
        HttpGetTask task = new HttpGetTask();
        task.execute(FILE_URL);
    }


    class HttpGetTask extends AsyncTask<String, Void, Integer>{

        @Override
        protected Integer doInBackground(String... strings) {
            int worked;
            HttpURLConnection connection = null;
            try {
                connection = (HttpURLConnection) new URL(strings[0]).openConnection();

                InputStream in = new BufferedInputStream(connection.getInputStream());
                InputStreamReader inReader = new InputStreamReader(in);
                BufferedReader buffReader  = new BufferedReader(inReader);

                transferToCache(buffReader);


            } catch (IOException e) {
                e.printStackTrace();
                worked = FAIL;
                return worked;
            }finally {
                connection.disconnect();
            }
            worked = SUCCESS;
            return worked;
        }

        private void transferToCache(BufferedReader in) throws IOException{
            try{
                File cacheFile = new File(context.getCacheDir(), "cFile.xml");
                FileWriter writer = new FileWriter(cacheFile);
                BufferedWriter buffWriter = new BufferedWriter(writer);
                try{
                    int read;
                    while((read = in.read()) != -1){
                        buffWriter.write(read);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    buffWriter.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }finally {
                in.close();
            }
        }
    }
}
