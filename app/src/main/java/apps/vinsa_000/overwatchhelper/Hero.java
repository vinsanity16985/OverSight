package apps.vinsa_000.overwatchhelper;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by vinsa on 10/12/2016.
 */

public class Hero {
    int numAbilities;

    boolean hasPrimary;
    boolean hasSecondary;
    boolean hasPassive;
    boolean hasSkill1;
    boolean hasSkill2;
    boolean hasUlt;

    String name;
    String height;
    String age;
    String difficulty;
    String health;
    String armor;
    String shield;

    String primaryName;
    String primaryDescription;

    String secondaryName;
    String secondaryDescription;

    String passiveName;
    String passiveDescription;

    String skill1Name;
    String skill1Description;

    String skill2Name;
    String skill2Description;

    String ultName;
    String ultDescription;

    public Hero(int heroNum) {
        switch(heroNum){
            case Constants.GENJI:
                numAbilities = 6;
                name = "Genji Shimada";
                height = "5'8";
                age = "35";
                difficulty = "3";
                health = "200";
                armor = "0";
                shield = "0";
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
        }
    }

    public ArrayList<String> getPrimaryInfo(){
        ArrayList<String> primaryInfo = new ArrayList<String>();

        primaryInfo.add(this.primaryName);
        primaryInfo.add(this.primaryDescription);

        return primaryInfo;
    }

}
