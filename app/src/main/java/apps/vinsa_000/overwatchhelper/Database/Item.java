package apps.vinsa_000.overwatchhelper.Database;

/**
 * Created by vinsa_000 on 2/21/2017.
 */
public class Item {

    private String title;
    private String value;

    public Item(){}

    public void setTitle(String s){
        title = s;
    }
    public void setValue(String s){
        value = s;
    }

    public String getTitle(){
        return title;
    }
    public String getValue(){
        return value;
    }
}
