package apps.vinsa_000.overwatchhelper.Utils;

import android.content.Context;
import android.util.Log;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import apps.vinsa_000.overwatchhelper.Database.Database;
import apps.vinsa_000.overwatchhelper.Database.Hero;
import apps.vinsa_000.overwatchhelper.Database.Item;
import apps.vinsa_000.overwatchhelper.R;

/**
 * Created by vinsa_000 on 2/12/2017.
 */
//TODO: Add insert statements to populate DB
public class XMLParser {
    //This is highest priority

    private static final String TAG = "XMLParser";

    private Context c;

    private ArrayList<Hero> heroList;

    public XMLParser(Context c){
        this.c = c;
        heroList = new ArrayList<Hero>();
    }

    public ArrayList<Hero> parse(File xml) throws IOException, SAXException, ParserConfigurationException{
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xml);

        //<type> tags
        NodeList typeNodes = doc.getElementsByTagName("type");

        for(int i = 0; i < typeNodes.getLength(); i++){
            Element type = (Element)typeNodes.item(i);
            String heroType = type.getAttribute("name");

            //<hero> tags + create new Hero object
            NodeList heroNodes = type.getChildNodes();

            for(int j = 0; j < heroNodes.getLength(); j++){
                Node heroNode = heroNodes.item(j);
                String heroString = heroNode.getNodeName();

                if(!(heroNode instanceof Text)){
                    //<basic>, <primary>, etc tags
                    NodeList infoNodes = heroNode.getChildNodes();
                    Hero hero = new Hero();

                    for(int h = 0; h < infoNodes.getLength(); h++){
                        Node info = infoNodes.item(h);
                        String infoString = info.getNodeName();

                        if(!(info instanceof Text)){
                            //<name>, <description>, etc tags
                            NodeList itemNodes = info.getChildNodes();

                            for(int p = 0; p < itemNodes.getLength(); p++){
                                Node itemNode = itemNodes.item(p);
                                String itemName = itemNode.getNodeName();
                                String itemValue = itemNode.getTextContent();


                                if(!(itemNode instanceof Text)){
                                    if(infoString.equals("basic")){
                                        Item item  = new Item();
                                        item.setTitle(itemName);
                                        item.setValue(itemValue);

                                        hero.addBasicItem(item);
                                    }
                                    else if(infoString.equals("primary")){
                                        if(itemName.equals("name")){
                                            hero.setPrimaryName(itemValue);
                                        }
                                        else if(itemName.equals("description")){
                                            hero.setPrimaryDescription(itemValue);
                                        }
                                        else{
                                            NodeList lowestNodes = itemNode.getChildNodes();
                                            Item item = new Item();
                                            for(int index = 0; index < lowestNodes.getLength(); index++){
                                                Node lowestNode = lowestNodes.item(index);
                                                String lowestName = lowestNode.getNodeName();
                                                String lowestValue = lowestNode.getTextContent();

                                                if(!(lowestNode instanceof Text)){
                                                    if(lowestName.equals("title")){
                                                        item.setTitle(lowestValue);
                                                    }
                                                    else{
                                                        item.setValue(lowestValue);
                                                    }
                                                }
                                            }

                                            if (item.getTitle() != null){
                                                hero.addPrimaryItem(item);
                                            }                                        }
                                    }
                                    else if(infoString.equals("secondary")){
                                        if(itemName.equals("name")){
                                            hero.setSecondaryName(itemValue);
                                        }
                                        else if(itemName.equals("description")){
                                            hero.setSecondaryDescription(itemValue);
                                        }
                                        else{
                                            NodeList lowestNodes = itemNode.getChildNodes();
                                            Item item = new Item();
                                            for(int index = 0; index < lowestNodes.getLength(); index++){
                                                Node lowestNode = lowestNodes.item(index);
                                                String lowestName = lowestNode.getNodeName();
                                                String lowestValue = lowestNode.getTextContent();

                                                if(!(lowestNode instanceof Text)){
                                                    if(lowestName.equals("title")){
                                                        item.setTitle(lowestValue);
                                                    }
                                                    else{
                                                        item.setValue(lowestValue);
                                                    }
                                                }
                                            }

                                            if (item.getTitle() != null){
                                                hero.addSecondaryItem(item);
                                            }                                        }
                                    }
                                    else if(infoString.equals("passive")){
                                        if(itemName.equals("name")){
                                            hero.setPassiveName(itemValue);
                                        }
                                        else if(itemName.equals("description")){
                                            hero.setPassiveDescription(itemValue);
                                        }
                                        else{
                                            NodeList lowestNodes = itemNode.getChildNodes();
                                            Item item = new Item();
                                            for(int index = 0; index < lowestNodes.getLength(); index++){
                                                Node lowestNode = lowestNodes.item(index);
                                                String lowestName = lowestNode.getNodeName();
                                                String lowestValue = lowestNode.getTextContent();

                                                if(!(lowestNode instanceof Text)){
                                                    if(lowestName.equals("title")){
                                                        item.setTitle(lowestValue);
                                                    }
                                                    else{
                                                        item.setValue(lowestValue);
                                                    }
                                                }
                                            }

                                            if (item.getTitle() != null){
                                                hero.addPassiveItem(item);
                                            }                                        }
                                    }
                                    else if(infoString.equals("skill1")){
                                        if(itemName.equals("name")){
                                            hero.setSkill1Name(itemValue);
                                        }
                                        else if(itemName.equals("description")){
                                            hero.setSkill1Description(itemValue);
                                        }
                                        else{
                                            NodeList lowestNodes = itemNode.getChildNodes();
                                            Item item = new Item();
                                            for(int index = 0; index < lowestNodes.getLength(); index++){
                                                Node lowestNode = lowestNodes.item(index);
                                                String lowestName = lowestNode.getNodeName();
                                                String lowestValue = lowestNode.getTextContent();

                                                if(!(lowestNode instanceof Text)){
                                                    if(lowestName.equals("title")){
                                                        item.setTitle(lowestValue);
                                                    }
                                                    else{
                                                        item.setValue(lowestValue);
                                                    }
                                                }
                                            }

                                            if (item.getTitle() != null){
                                                hero.addSkill1Item(item);
                                            }                                        }
                                    }
                                    else if(infoString.equals("skill2")){
                                        if(itemName.equals("name")){
                                            hero.setSkill2Name(itemValue);
                                        }
                                        else if(itemName.equals("description")){
                                            hero.setSkill2Description(itemValue);
                                        }
                                        else{
                                            NodeList lowestNodes = itemNode.getChildNodes();
                                            Item item = new Item();
                                            for(int index = 0; index < lowestNodes.getLength(); index++){
                                                Node lowestNode = lowestNodes.item(index);
                                                String lowestName = lowestNode.getNodeName();
                                                String lowestValue = lowestNode.getTextContent();

                                                if(!(lowestNode instanceof Text)){
                                                    if(lowestName.equals("title")){
                                                        item.setTitle(lowestValue);
                                                    }
                                                    else{
                                                        item.setValue(lowestValue);
                                                    }
                                                }
                                            }

                                            if (item.getTitle() != null){
                                                hero.addSkill2Item(item);
                                            }                                        }
                                    }
                                    else if(infoString.equals("ultimate")){
                                        if(itemName.equals("name")){
                                            hero.setUltName(itemValue);
                                        }
                                        else if(itemName.equals("description")){
                                            hero.setUltDescription(itemValue);
                                        }
                                        else{
                                            NodeList lowestNodes = itemNode.getChildNodes();
                                            Item item = new Item();
                                            for(int index = 0; index < lowestNodes.getLength(); index++){
                                                Node lowestNode = lowestNodes.item(index);
                                                String lowestName = lowestNode.getNodeName();
                                                String lowestValue = lowestNode.getTextContent();

                                                if(!(lowestNode instanceof Text)){
                                                    if(lowestName.equals("title")){
                                                        item.setTitle(lowestValue);
                                                    }
                                                    else{
                                                        item.setValue(lowestValue);
                                                    }
                                                }
                                            }

                                            if (item.getTitle() != null){
                                                hero.addUltItem(item);
                                            }                                        }
                                    }
                                    else{
                                        if(itemName.equals("name")){
                                            hero.setOptionalName(itemValue);
                                        }
                                        else if(itemName.equals("description")){
                                            hero.setOptionalDescription(itemValue);
                                        }
                                        else{
                                            NodeList lowestNodes = itemNode.getChildNodes();
                                            Item item = new Item();
                                            for(int index = 0; index < lowestNodes.getLength(); index++){
                                                Node lowestNode = lowestNodes.item(index);
                                                String lowestName = lowestNode.getNodeName();
                                                String lowestValue = lowestNode.getTextContent();

                                                if(!(lowestNode instanceof Text)){
                                                    if(lowestName.equals("title")){
                                                        item.setTitle(lowestValue);
                                                    }
                                                    else{
                                                        item.setValue(lowestValue);
                                                    }
                                                }
                                            }

                                            if (item.getTitle() != null){
                                                hero.addOptionalItem(item);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    heroList.add(hero);
                }
            }
        }

//        Hero h = heroList.get(11);//Torb
//
//        Log.d(TAG, "Name: " + h.getOptionalName());
//        Log.d(TAG, "Description: " + h.getOptionalDescription());
//        for(int i = 0; i < h.getOptionalLength(); i++){
//            String title = h.getOptionalItem(i).getTitle();
//            String value = h.getOptionalItem(i).getValue();
//
//            Log.d(TAG, "Item " + i + ": " + title + " | " + value);
//        }

        return heroList;
    }

    public void transferToCache() throws IOException{
        InputStream input = c.getResources().openRawResource(R.raw.restructuredheroes);
        try{
            File cacheFile = new File(c.getCacheDir(), "cFile.xml");
            OutputStream output = new FileOutputStream(cacheFile);
            try{
                byte[] buffer = new byte[4 * 1024];
                int read;

                while((read = input.read(buffer)) != -1){
                    output.write(buffer, 0, read);
                }
                output.flush();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                output.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            input.close();
        }
    }
}
