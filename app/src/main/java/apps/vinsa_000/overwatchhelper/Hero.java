package apps.vinsa_000.overwatchhelper;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by vinsa on 10/12/2016.
 */

public class Hero {
    //Used to determine size of Hero's listview
    private int numAbilities;

    //Boolean used to help build Hero's listview
    private boolean hasPrimary;
    private boolean hasSecondary;
    private boolean hasPassive;
    private boolean hasSkill1;
    private boolean hasSkill2;
    private boolean hasUlt;

    //Hero basic info
    private ArrayList<String> basicInfo;
    private int heroPortrait;
    private String name;
    private String height;
    private String age;
    private String difficulty;
    private String health;
    private String armor;
    private String shield;
    private String total;

    //Hero primary weapon info
    private ArrayList<String> primaryInfo;
    private String primaryName;
    private String primaryDescription;

    //Hero secondary weapon info
    private ArrayList<String> secondaryInfo;
    private String secondaryName;
    private String secondaryDescription;

    //Hero passive ability info
    private ArrayList<String> passiveInfo;
    private String passiveName;
    private String passiveDescription;

    //Hero skill1 ability info
    private ArrayList<String> skill1Info;
    private String skill1Name;
    private String skill1Description;

    //Hero skill2 ability info
    private ArrayList<String> skill2Info;
    private String skill2Name;
    private String skill2Description;

    //Hero ult ability info
    private ArrayList<String> ultInfo;
    private String ultName;
    private String ultDescription;

    public Hero(int heroNum, Context context) {
        basicInfo = new ArrayList<String>();
        primaryInfo = new ArrayList<String>();
        secondaryInfo = new ArrayList<String>();
        passiveInfo = new ArrayList<String>();
        skill1Info = new ArrayList<String>();
        skill2Info = new ArrayList<String>();
        ultInfo = new ArrayList<String>();
        //Used to determine which Hero's info to get
        switch(heroNum){
            case Constants.GENJI:
                numAbilities = 6;
                heroPortrait = context.getResources().getIdentifier("genji_icon", "drawable", context.getPackageName());
                name = "Genji Shimada";
                height = "5'8";
                age = "35";
                difficulty = "3";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Shuriken";
                primaryDescription = "Genji looses three deadly throwing stars in quick succession.";
                secondaryName = "Fan of Blades";
                secondaryDescription = "Genji throws three deadly throwing stars in a wide spread.";
                passiveName = "Cyber-Agility";
                passiveDescription = "Thanks to his cybernetic abilities, Genji can climb walls and perform jumps in mid-air.";
                skill1Name = "Swift Strike";
                skill1Description = "Genji darts forward, slashing with his katana and passing through foes in his path. If Genji eliminates a target, he can instantly use this ability again.";
                skill2Name = "Deflect";
                skill2Description = "With lightning-quick swipes of his sword, Genji reflects any oncoming projectiles and can send them rebounding towards his enemies.";
                ultName = "Dragonblade";
                ultDescription = "Genji brandishes his katana for a brief period of time. Until he sheathes his sword, Genji can deliver killing strikes to any targets within his reach.";
                hasPrimary = true;
                hasSecondary = true;
                hasPassive = true;
                hasSkill1 = true;
                hasSkill2 = true;
                hasUlt = true;
                break;
            case Constants.MCCREE:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("mccree_icon", "drawable", context.getPackageName());
                name = "Jesse McCree";
                height = "6'1";
                age = "37";
                difficulty = "2";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Peacekeeper";
                primaryDescription = "McCree fires off a round from his trusty six-shooter.";
                secondaryName = "Fan the Hammer";
                secondaryDescription = "He can fan the Peacekeeper’s hammer to swiftly unload the entire cylinder.";
                skill1Name = "Combat Roll";
                skill1Description = "McCree dives in the direction he's moving, effortlessly reloading his Peacekeeper in the process.";
                skill2Name = "Flashbang";
                skill2Description = "McCree heaves a blinding grenade that explodes shortly after it leaves his hand. The blast staggers enemies in a small radius.";
                ultName = "Deadeye";
                ultDescription = "McCree takes a few precious moments to aim; when he's ready to fire, he shoots every enemy in his line of sight.";
                hasPrimary = true;
                hasSecondary = true;
                hasPassive = false;
                hasSkill1 = true;
                hasSkill2 = true;
                hasUlt = true;
                break;
            case Constants.PHARAH:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("pharah_icon", "drawable", context.getPackageName());
                name = "Fareeha Amari";
                height = "5'11";
                age = "32";
                difficulty = "1";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Rocket Launcher";
                primaryDescription = "Pharah’s primary weapon launches rockets that deal significant damage in a wide blast radius.";
                passiveName = "Hover Jets";
                passiveDescription = "Pharah hovers in mid-air.";
                skill1Name = "Jump Jet";
                skill1Description = "Propelled by her suit’s thrusters, Pharah soars high into the air.";
                skill2Name = "Concussive Blast";
                skill2Description = "Pharah looses a wrist rocket that knocks back any enemies it strikes.";
                ultName = "Barrage";
                ultDescription = "Pharah directs a continuous salvo of mini-rockets to destroy groups of enemies.";
                hasPrimary = true;
                hasSecondary = false;
                hasPassive = true;
                hasSkill1 = true;
                hasSkill2 = true;
                hasUlt = true;
                break;
            case Constants.REAPER:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("reaper_icon", "drawable", context.getPackageName());
                name = "Gabriel Reyes";
                height = "6'1";
                age = "56";
                difficulty = "1";
                health = "250";
                armor = "0";
                shield = "0";
                total = "250";
                primaryName = "Hellfire Shotguns";
                primaryDescription = "Reaper tears enemies apart with twin shotguns.";
                passiveName = "The Reaping";
                passiveDescription = "Reaper collects souls from fallen enemies to replenish his health.";
                skill1Name = "Wraith Form";
                skill1Description = "Reaper becomes a shadow for a short period of time. While in this form, he takes no damage and is able to pass through enemies, but cannot fire his weapons or use other abilities.";
                skill2Name = "Shadow Step";
                skill2Description = "After marking a destination, Reaper disappears and reappears at that location.";
                ultName = "Death Blossom";
                ultDescription = "In a blur of motion, Reaper empties both hellfire shotguns at breakneck speed, dealing massive damage to all nearby enemies.";
                hasPrimary = true;
                hasSecondary = false;
                hasPassive = true;
                hasSkill1 = true;
                hasSkill2 = true;
                hasUlt = true;
                break;
            case Constants.SOLDIER:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("soldier_icon", "drawable", context.getPackageName());
                name = "Jack Morrison";
                height = "6'1";
                age = "55";
                difficulty = "1";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Heavy Pulse Rifle";
                primaryDescription = "Soldier: 76’s rifle remains particularly steady while unloading fully-automatic pulse fire.";
                secondaryName = "Helix Rockets";
                secondaryDescription = "Tiny rockets spiral out of Soldier: 76’s Pulse Rifle in a single burst. The rockets’ explosion damages enemies in a small radius.";
                skill1Name = "Sprint";
                skill1Description = "Whether he needs to evade a firefight or get back into one, Soldier: 76 can rush ahead in a burst of speed. His sprint ends if he takes an action other than charging forward.";
                skill2Name = "Biotic Field";
                skill2Description = "Soldier: 76 plants a biotic emitter on the ground. Its energy projection restores health to 76 and any of his squadmates within the field.";
                ultName = "Tactical Visor";
                ultDescription = "Soldier: 76’s pinpoint targeting visor “locks” his aim on the threat closest to his crosshairs. If an enemy leaves his line of sight, Soldier: 76 can quickly switch to another target.";
                hasPrimary = true;
                hasSecondary = true;
                hasPassive = false;
                hasSkill1 = true;
                hasSkill2 = true;
                hasUlt = true;
                break;
            case Constants.TRACER:
                heroPortrait = context.getResources().getIdentifier("tracer_icon", "drawable", context.getPackageName());
                numAbilities = 4;
                name = "Lena Oxton";
                height = "5'4";
                age = "26";
                difficulty = "2";
                health = "150";
                armor = "0";
                shield = "0";
                total = "150";
                primaryName = "Pulse Pistols";
                primaryDescription = "Tracer rapid-fires both of her pistols.";
                skill1Name = "Blink";
                skill1Description = "Tracer zips horizontally through space in the direction she’s moving, and reappears several yards away. She stores up to three charges of the blink ability and generates more every few seconds.";
                skill2Name = "Recall";
                skill2Description = "Tracer bounds backward in time, returning her health, ammo and position on the map to precisely where they were a few seconds before.";
                ultName = "Pulse Bomb";
                ultDescription = "Tracer lobs a large bomb that adheres to any surface or unfortunate opponent it lands on. After a brief delay, the bomb explodes, dealing high damage to all enemies within its blast radius.";
                hasPrimary = true;
                hasSecondary = false;
                hasPassive = false;
                hasSkill1 = true;
                hasSkill2 = true;
                hasUlt = true;
                break;
        }
        basicInfo.add(name);
        basicInfo.add(height);
        basicInfo.add(age);
        basicInfo.add(difficulty);
        basicInfo.add(health);
        basicInfo.add(armor);
        basicInfo.add(shield);
        basicInfo.add(total);
        basicInfo.add(Integer.toString(heroPortrait));
        if(primaryName != null){
            primaryInfo.add(primaryName);
            primaryInfo.add(primaryDescription);
        }
        if(secondaryName != null){
            secondaryInfo.add(secondaryName);
            secondaryInfo.add(secondaryDescription);
        }
        if(passiveName != null){
            passiveInfo.add(passiveName);
            passiveInfo.add(passiveDescription);
        }
        if(skill1Name != null){
            skill1Info.add(skill1Name);
            skill1Info.add(skill1Description);
        }
        if(skill2Name != null){
            skill2Info.add(skill2Name);
            skill2Info.add(skill2Description);
        }
        if(ultName != null){
            ultInfo.add(ultName);
            ultInfo.add(ultDescription);
        }
    }

    //Returns the number of abilities a Hero has
    public int getNumAbilities(){
        return numAbilities;
    }

    //Returns a Hero's basic info
    public ArrayList<String> getBasicInfo(){
        return basicInfo;
    }

    //Return's a Hero's primary weapon info
    public ArrayList<String> getPrimaryInfo() {
        return primaryInfo;
    }

    //Return's a Hero's secondary weapon info
    public ArrayList<String> getSecondaryInfo() {
        return secondaryInfo;
    }

    //Return's a Hero's passive ability info
    public ArrayList<String> getPassiveInfo() {
        return passiveInfo;
    }

    //Return's a Hero's skill1 ability info
    public ArrayList<String> getSkill1Info() {
        return skill1Info;
    }

    //Return's a Hero's skill2 ability info
    public ArrayList<String> getSkill2Info() {
        return skill2Info;
    }

    //Return's a Hero's Ultimate ability info
    public ArrayList<String> getUltInfo() {
        return ultInfo;
    }

}
