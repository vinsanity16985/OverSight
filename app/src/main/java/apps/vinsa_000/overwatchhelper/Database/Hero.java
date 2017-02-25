package apps.vinsa_000.overwatchhelper.Database;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vinsa on 10/12/2016.
 * Holds data for each hero in Overwatch
 */

public class Hero {

	/*-------------BASIC-------------*/
	private ArrayList<Item> basicItems;

	/*-------------PRIMARY-------------*/
	private boolean hasPrimary;
	private String primaryName;
	private String primaryDescription;
	private ArrayList<Item> primaryItems;

	/*-------------SECONDARY-------------*/
	private boolean hasSecondary;
	private String secondaryName;
	private String secondaryDescription;
	private ArrayList<Item> secondaryItems;

	/*-------------PASSIVE-------------*/
	private boolean hasPassive;
	private String passiveName;
	private String passiveDescription;
	private ArrayList<Item> passiveItems;

	/*-------------SKILL1-------------*/
	private boolean hasSkill1;
	private String skill1Name;
	private String skill1Description;
	private ArrayList<Item> skill1Items;

	/*-------------SKILL2-------------*/
	private boolean hasSkill2;
	private String skill2Name;
	private String skill2Description;
	private ArrayList<Item> skill2Items;

	/*-------------ULTIMATE-------------*/
	private boolean hasUlt;
	private String ultName;
	private String ultDescription;
	private ArrayList<Item> ultItems;

	/*-------------Optional-------------*/
	private boolean hasOptional;
	private String optionalName;
	private String optionalDescription;
	private ArrayList<Item> optionalItems;

	public Hero() {
		basicItems = new ArrayList<Item>();

		hasPrimary = false;
		primaryItems = new ArrayList<Item>();

		hasSecondary = false;
		secondaryItems = new ArrayList<Item>();

		hasPassive = false;
		passiveItems = new ArrayList<Item>();

		hasSkill1 = false;
		skill1Items = new ArrayList<Item>();

		hasSkill2 = false;
		skill2Items = new ArrayList<Item>();

		hasUlt = false;
		ultItems = new ArrayList<Item>();

		hasOptional = false;
		optionalItems = new ArrayList<Item>();
	}

	/*-------------ADD ITEMS-------------*/
	public void addBasicItem(Item i){
		basicItems.add(i);
	}
	public void addPrimaryItem(Item i){
		primaryItems.add(i);
		hasPrimary = true;
	}
	public void addSecondaryItem(Item i){
		secondaryItems.add(i);
		hasSecondary = true;
	}
	public void addPassiveItem(Item i){
		passiveItems.add(i);
		hasPassive = true;
	}
	public void addSkill1Item(Item i){
		skill1Items.add(i);
		hasSkill1 = true;
	}
	public void addSkill2Item(Item i){
		skill2Items.add(i);
		hasSkill2 = true;
	}
	public void addUltItem(Item i){
		ultItems.add(i);
		hasUlt = true;
	}
	public void addOptionalItem(Item i){
		optionalItems.add(i);
		hasOptional = true;
	}

	/*-------------NAME SETTERS-------------*/
	public void setPrimaryName(String s){
		primaryName = s;
		hasPrimary = true;
	}
	public void setSecondaryName(String s){
		secondaryName = s;
		hasSecondary = true;
	}
	public void setPassiveName(String s){
		passiveName = s;
		hasPassive = true;
	}
	public void setSkill1Name(String s){
		skill1Name = s;
		hasSkill1 = true;
	}
	public void setSkill2Name(String s){
		skill2Name = s;
		hasSkill2 = true;
	}
	public void setUltName(String s){
		ultName = s;
		hasUlt = true;
	}
	public void setOptionalName(String s){
		optionalName = s;
		hasOptional = true;
	}

	/*-------------DESCRIPTION SETTERS-------------*/
	public void setPrimaryDescription(String s){
		primaryDescription = s;
	}
	public void setSecondaryDescription(String s){
		secondaryDescription = s;
	}
	public void setPassiveDescription(String s){
		passiveDescription = s;
	}
	public void setSkill1Description(String s){
		skill1Description = s;
	}
	public void setSkill2Description(String s){
		skill2Description = s;
	}
	public void setUltDescription(String s){
		ultDescription = s;
	}
	public void setOptionalDescription(String s){
		optionalDescription = s;
	}

	/*-------------NAME GETTERS-------------*/
	public String getPrimaryName(){
		return primaryName;
	}
	public String getSecondaryName(){
		return secondaryName;
	}
	public String getPassiveName(){
		return passiveName;
	}
	public String getSkill1Name(){
		return skill1Name;
	}
	public String getSkill2Name(){
		return skill2Name;
	}
	public String getUltName(){
		return ultName;
	}
	public String getOptionalName(){
		return optionalName;
	}

	/*-------------DESCRIPTION GETTERS-------------*/
	public String getPrimaryDescription(){
		return primaryDescription;
	}
	public String getSecondaryDescription(){
		return secondaryDescription;
	}
	public String getPassiveDescription(){
		return passiveDescription;
	}
	public String getSkill1Description(){
		return skill1Description;
	}
	public String getSkill2Description(){
		return skill2Description;
	}
	public String getUltDescription(){
		return ultDescription;
	}
	public String getOptionalDescription(){
		return optionalDescription;
	}

	/*-------------ITEM GETTERS-------------*/
	public Item getBasicItem(int i){
		return basicItems.get(i);
	}
	public Item getPrimaryItem(int i){
		return primaryItems.get(i);
	}
	public Item getSecondaryItem(int i){
		return secondaryItems.get(i);
	}
	public Item getPassiveItem(int i){
		return passiveItems.get(i);
	}
	public Item getSkill1Item(int i){
		return skill1Items.get(i);
	}
	public Item getSkill2Item(int i){
		return skill2Items.get(i);
	}
	public Item getUltItem(int i){
		return ultItems.get(i);
	}
	public Item getOptionalItem(int i){
		return optionalItems.get(i);
	}

	/*-------------ARRAY SIZES-------------*/
	public int getPrimarySize(){
		return primaryItems.size();
	}
	public int getSecondarySize(){
		return secondaryItems.size();
	}
	public int getPassiveSize(){
		return passiveItems.size();
	}
	public int getSkill1Size(){
		return skill1Items.size();
	}
	public int getSkill2Size(){
		return skill2Items.size();
	}
	public int getUltSize(){
		return ultItems.size();
	}
	public int getOptionalSize(){
		return optionalItems.size();
	}

	/*-------------HAS GETTERS-------------*/
	public boolean hasPrimary(){
		return hasPrimary;
	}
	public boolean hasSecondary(){
		return hasSecondary;
	}
	public boolean hasPassive(){
		return hasPassive;
	}
	public boolean hasSkill1(){
		return hasSkill1;
	}
	public boolean hasSkill2(){
		return hasSkill2;
	}
	public boolean hasUlt(){
		return hasUlt;
	}
	public boolean hasOptional(){
		return hasOptional;
	}
}
