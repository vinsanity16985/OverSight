package apps.vinsa_000.overwatchhelper;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by vinsa on 10/12/2016.
 * Holds data for each hero in Overwatch
 */

public class Hero {
    //Used to determine size of Hero's listview
    private int numAbilities;

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
    private int primaryPic;
    private String primaryName;
    private String primaryDescription;

    //Hero secondary weapon info
    private ArrayList<String> secondaryInfo;
    private int secondaryPic;
    private String secondaryName;
    private String secondaryDescription;

    //Hero passive ability info
    private ArrayList<String> passiveInfo;
    private int passivePic;
    private String passiveName;
    private String passiveDescription;

    //Hero skill1 ability info
    private ArrayList<String> skill1Info;
    private int skill1Pic;
    private String skill1Name;
    private String skill1Description;

    //Hero skill2 ability info
    private ArrayList<String> skill2Info;
    private int skill2Pic;
    private String skill2Name;
    private String skill2Description;

    //Hero ult ability info
    private ArrayList<String> ultInfo;
    private int ultPic;
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
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
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
                primaryPic = context.getResources().getIdentifier("primary_mccree", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("primary_mccree", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_mccree", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_mccree", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_mccree", "drawable", context.getPackageName());
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
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
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
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
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
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
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
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
                break;
            case Constants.BASTION:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("bastion_icon", "drawable", context.getPackageName());
                name = "SST Laboratories Siege Automaton E54";
                height = "7'3";
                age = "30";
                difficulty = "1";
                health = "200";
                armor = "100";
                shield = "0";
                total = "300";
                primaryName = "Configuration: Recon";
                primaryDescription = "In Recon mode, Bastion is fully mobile, outfitted with a submachine gun that fires steady bursts of bullets at medium range.";
                secondaryName = "Configuration: Sentry";
                secondaryDescription = "In Sentry mode, Bastion is a stationary powerhouse equipped with a gatling gun capable of unleashing a hail of bullets. The gun's aim can be \"walked\" across multiple targets, dealing devastating damage at short to medium range.";
                skill1Name = "Reconfigure";
                skill1Description = "Bastion transforms between its two primary combat modes to adapt to changing battlefield conditions.";
                skill2Name = "Self-Repair";
                skill2Description = "Bastion restores its health; it cannot move or fire weapons while the repair process is in effect.";
                ultName = "Configuration: Tank";
                ultDescription = "In Tank mode, Bastion extends wheeled treads and a powerful long-range cannon. The cannon’s explosive shells demolish targets in a wide blast radius, but Bastion can only remain in this mode for a limited time.";
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
                break;
            case Constants.HANZO:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("hanzo_icon", "drawable", context.getPackageName());
                name = "Hanzo Shimada";
                height = "5'8";
                age = "38";
                difficulty = "3";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Storm Bow";
                primaryDescription = "Hanzo nocks and fires an arrow at his target.";
                passiveName = "Wall Climb";
                passiveDescription = "Hanzo can climb any vertical surface.";
                skill1Name = "Sonic Arrow";
                skill1Description = "Hanzo launches an arrow that contains a sonar tracking device. Any enemy within its detection radius is visibly marked, making them easier for Hanzo and his allies to hunt down.";
                skill2Name = "Scatter Arrow";
                skill2Description = "Hanzo shoots a fragmenting arrow that ricochets off walls and objects and can strike multiple targets at once.";
                ultName = "Dragonstrike";
                ultDescription = "Hanzo summons a Spirit Dragon which travels through the air in a line. It passes through walls in its way, devouring any enemies it encounters.";
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
                break;
            case Constants.JUNKRAT:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("junkrat_icon", "drawable", context.getPackageName());
                name = "Jamison Fawkes";
                height = "6'6";
                age = "25";
                difficulty = "2";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Frag Launcher";
                primaryDescription = "Junkrat's Frag Launcher lobs grenades a significant distance. They bounce to reach their destination, and blow up when they strike an enemy.g";
                passiveName = "Total Mayhem";
                passiveDescription = "Junkrat's deranged sense of humor persists past his death. If killed, he drops several live grenades.";
                skill1Name = "Concussion Mine";
                skill1Description = "After placing one of his homemade Concussion Mines, Junkrat can trigger it to damage enemies and send them flying... or propel himself through the air.";
                skill2Name = "Steel Trap";
                skill2Description = "Junkrat tosses out a giant, metal-toothed trap. Should an enemy wander too close to the trap, it clamps on, injuring and immobilizing them.";
                ultName = "RIP-Tire";
                ultDescription = "Junkrat revs up a motorized tire bomb and sends it rolling across the battlefield, climbing over walls and obstacles. He can remotely detonate the RIP-Tire to deal serious damage to enemies caught within the blast, or just wait for it to explode on its own.";
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
                break;
            case Constants.MEI:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("mei_icon", "drawable", context.getPackageName());
                name = "Mei-Ling Zhou";
                height = "unknown";
                age = "31";
                difficulty = "3";
                health = "250";
                armor = "0";
                shield = "0";
                total = "250";
                primaryName = "Endothermic Blaster";
                primaryDescription = "Mei's blaster unleashes a concentrated, short-range stream of frost that damages, slows, and ultimately freezes enemies in place.";
                secondaryName = "Icicle";
                secondaryDescription = "Mei can use her blaster to shoot icicle-like projectiles at medium range.";
                skill1Name = "Cryo-Freeze";
                skill1Description = "Mei instantly surrounds herself with a block of thick ice. She heals and ignores damage while encased, but cannot move or use abilities.";
                skill2Name = "Ice Wall";
                skill2Description = "Mei generates an enormous ice wall that obstructs lines of sight, stops movement, and blocks attacks.";
                ultName = "Blizzard";
                ultDescription = "Mei deploys a weather-modification drone that emits gusts of wind and snow in a wide area. Enemies caught in the blizzard are slowed and take damage; those who linger too long are frozen solid.";
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
                break;
            case Constants.TORBJORN:
                numAbilities = 7;
                heroPortrait = context.getResources().getIdentifier("torbjorn_icon", "drawable", context.getPackageName());
                name = "Torbjörn Lindholm";
                height = "4'7";
                age = "57";
                difficulty = "2";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Rivet Gun";
                primaryDescription = "Torbjörn fires rivets at long range, or ejects molten metal from his gun in a short, close-range burst.";
                secondaryName = "Forge Hammer";
                secondaryDescription = "Torbjörn uses his multipurpose hammer to build, upgrade and repair turrets. In a pinch, it can also be swung as a weapon.";
                passiveName = "Scrap Collector";
                passiveDescription = "Collect scrap to gain resources.";
                skill1Name = "Build Turret";
                skill1Description = "Torbjörn constructs an enemy-tracking autocannon. He can use his Forge Hammer to repair or upgrade it, increasing its health and adding a second cannon barrel and a rocket launcher.";
                skill2Name = "Armor Pack";
                skill2Description = "Torbjörn deploys an armor upgrade; either he or his allies can pick it up to absorb some damage.";
                ultName = "Molten Core";
                ultDescription = "After overheating his personal forge, Torbjörn gains a significant amount of armor. He also attacks (and builds and repairs turrets) far faster than normal";
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
                break;
            case Constants.WIDOWMAKER:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("widowmaker_icon", "drawable", context.getPackageName());
                name = "Amélie Lacroix";
                height = "5'9";
                age = "33";
                difficulty = "2";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Sniper Mode";
                primaryDescription = "Widowmaker’s versatile sniper rifle is ideal for scope-aimed shots at distant targets. ";
                secondaryName = "Widow's Kiss";
                secondaryDescription = "Should targets close to medium range, the rifle can also be fired in fully-automatic mode.";
                skill1Name = "Grappling Hook";
                skill1Description = "Widowmaker launches a grappling hook towards the location she’s aiming at – when the hook connects with a scalable surface, she’s quickly drawn towards it, allowing her to expand her view of the battlefield and evade or flank targets.";
                skill2Name = "Venom Mine";
                skill2Description = "Widowmaker adheres a swiftly-arming venom mine to nearly any surface. When a target wanders within range of the mine’s motion trigger, it explodes, delivering poison gas to any enemies in the vicinity.";
                ultName = "Infra-Sight";
                ultDescription = "Widowmaker’s recon visor allows her to see the heat signatures of her targets through walls and objects for a moderate amount of time. This enhanced vision is shared with her allies.";
                primaryPic = context.getResources().getIdentifier("primary_genji", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_genji", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_genji", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_genji", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_genji", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_genji", "drawable", context.getPackageName());
                break;
            //
            //
            //
            case Constants.DVA:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("dva_icon", "drawable", context.getPackageName());
                name = "Hana Song";
                height = "Unknown";
                age = "19";
                difficulty = "2";
                health = "100";
                armor = "400";
                shield = "0";
                total = "500";
                primaryName = "Fusion Cannons";
                primaryDescription = "D.Va's mech is equipped with twin short-range rotating cannons. They lay down continuous, high-damage fire without needing to reload, but slow D.Va’s movement while they’re active.";
                secondaryName = "Defense Matrix";
                secondaryDescription = "D.Va can activate this forward-facing targeting array to shoot incoming projectiles out of the air.";
                passiveName = "Eject";
                passiveDescription = "D.Va ejects out of her mech when it is destroyed.";
                skill1Name = "Boosters";
                skill1Description = "D.Va’s mech launches into the air, her momentum carrying her forward. She can turn and change directions or barrel through her enemies, knocking them back.";
                ultName = "Self-Destruct";
                ultDescription = "D.Va ejects from her mech and sets its reactor to explode, dealing massive damage to nearby opponents.";
                primaryPic = context.getResources().getIdentifier("primary_dva", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_dva", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_dva", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_dva", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_dva", "drawable", context.getPackageName());
                break;
            case Constants.REINHARDT:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("reinhardt_icon", "drawable", context.getPackageName());
                name = "Reinhardt Wilhelm";
                height = "7'4";
                age = "61";
                difficulty = "1";
                health = "300";
                armor = "200";
                shield = "0";
                total = "500";
                primaryName = "Rocket Hammer";
                primaryDescription = "Reinhardt’s Rocket Hammer is an exemplary melee weapon, able to deal punishing damage in a wide arc with every swing.";
                secondaryName = "Barrier Field";
                secondaryDescription = "Reinhardt projects a broad, forward-facing energy barrier, which can absorb substantial damage before it is destroyed. Although Reinhardt can protect himself and his companions behind the barrier, he cannot attack while sustaining it.";
                skill1Name = "Charge";
                skill1Description = "Reinhardt charges forth in a straight line, pinning the first enemy in his path and knocking others aside. If he collides with a wall, the foe he’s carrying suffers extreme damage.";
                skill2Name = "Fire Strike";
                skill2Description = "By whipping his Rocket Hammer forward, Reinhardt slings a flaming projectile which pierces and damages any enemies it touches.";
                ultName = "Earthshatter";
                ultDescription = "Reinhardt forcefully slams his rocket hammer into the ground, knocking down and damaging all enemies in front of him.";
                primaryPic = context.getResources().getIdentifier("primary_reinhardt", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_reinhardt", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_reinhardt", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_reinhardt", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_reinhardt", "drawable", context.getPackageName());
                break;
            case Constants.ROADHOG:
                numAbilities = 4;
                heroPortrait = context.getResources().getIdentifier("roadhog_icon", "drawable", context.getPackageName());
                name = "Mako Rutledge";
                height = "7'3";
                age = "48";
                difficulty = "1";
                health = "600";
                armor = "0";
                shield = "0";
                total = "600";
                primaryName = "Scrap Gun";
                primaryDescription = "Roadhog's Scrap Gun fires short-range blasts of shrapnel with a wide spread. Alternatively, it can launch a shrapnel ball that detonates farther away, scattering metal fragments from the point of impact.";
                skill1Name = "Chain Hook";
                skill1Description = "Roadhog hurls his chain at a target; if it catches, he yanks them into close range";
                skill2Name = "Take a Breather";
                skill2Description = "Roadhog restores a chunk of his health over a brief period of time.";
                ultName = "Whole Hog";
                ultDescription = "After cramming a top-loader onto his Scrap Gun, Roadhog pours in ammo. For a short time, he can crank out a stream of shrapnel that knocks back enemies.";
                primaryPic = context.getResources().getIdentifier("primary_roadhog", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_roadhog", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_roadhog", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_roadhog", "drawable", context.getPackageName());
                break;
            case Constants.WINSTON:
                numAbilities = 4;
                heroPortrait = context.getResources().getIdentifier("winston_icon", "drawable", context.getPackageName());
                name = "Winston";
                height = "7'3";
                age = "29";
                difficulty = "2";
                health = "400";
                armor = "100";
                shield = "0";
                total = "500";
                primaryName = "Tesla Cannon";
                primaryDescription = "Winston’s weapon fires a short-range electric barrage for as long as he holds down the trigger.";
                skill1Name = "Jump Pack";
                skill1Description = "Assisted by his energy pack, Winston lunges through the air, dealing significant damage and staggering nearby enemies when he lands.";
                skill2Name = "Barrier Projector";
                skill2Description = "Winston's barrier projector extends a bubble-shaped field that absorbs damage until it's destroyed. Allies protected by the barrier can return fire from within it.";
                ultName = "Primal Rage";
                ultDescription = "Winston embraces his animal nature, significantly boosting his health and making him very difficult to kill, strengthening his melee attack, and allowing him to use his Jump Pack ability more frequently. While raging, Winston can only make melee and Jump Pack attacks.";
                primaryPic = context.getResources().getIdentifier("primary_winston", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_winston", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_winston", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_winston", "drawable", context.getPackageName());
                break;
            case Constants.ZARYA:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("zarya_icon", "drawable", context.getPackageName());
                name = "Aleksandra Zaryanova";
                height = "6'5";
                age = "28";
                difficulty = "3";
                health = "200";
                armor = "0";
                shield = "200";
                total = "400";
                primaryName = "Particle Cannon";
                primaryDescription = "Zarya’s mighty Particle Cannon unleashes a short-range beam of destructive energy. Alternatively, Zarya can lob an explosive charge to strike multiple opponents.";
                passiveName = "Energy";
                passiveDescription = "Damage blocked increases Particle Cannon damage.";
                skill1Name = "Particle Barrier";
                skill1Description = "The Particle Cannon can emit a personal barrier that shields Zarya against incoming attacks, redirecting their energy to enhance her weapon’s damage and the width of its beam.";
                skill2Name = "Projected Barrier";
                skill2Description = "Zarya surrounds one of her teammates with an energy barrier that simultaneously absorbs fire and boosts the power of her Particle Cannon.";
                ultName = "Graviton Surge";
                ultDescription = "Zarya launches a gravity bomb that draws in enemy combatants and deals damage while they’re trapped.";
                primaryPic = context.getResources().getIdentifier("primary_zarya", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_zarya", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_zarya", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_zarya", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_zarya", "drawable", context.getPackageName());
                break;
            case Constants.ANA:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("ana_icon", "drawable", context.getPackageName());
                name = "Ana Amari";
                height = "Unknown";
                age = "60";
                difficulty = "3";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Biotic Rifle";
                primaryDescription = "Ana’s rifle shoots darts that can restore health to her allies or deal ongoing damage to her enemies.";
                secondaryName = "Zoom";
                secondaryDescription = "She can use the rifle’s scope to zoom in on targets and make highly accurate shots.";
                skill1Name = "Sleep Dart";
                skill1Description = "Ana fires a dart from her sidearm, rendering an enemy unconscious (though any damage will rouse them).";
                skill2Name = "Biotic Grenade";
                skill2Description = "Ana tosses a biotic bomb that deals damage to enemies and heals allies in a small area of effect. Affected allies briefly receive increased healing from all sources, while enemies caught in the blast cannot be healed for a few moments.";
                ultName = "Nano Boost";
                ultDescription = "After Ana hits one of her allies with a combat boost, they temporarily move faster, deal more damage, and take less damage from enemies’ attacks.";
                primaryPic = context.getResources().getIdentifier("primary_ana", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("primary_ana", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_ana", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_ana", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_ana", "drawable", context.getPackageName());
                break;
            case Constants.LUCIO:
                numAbilities = 6;
                heroPortrait = context.getResources().getIdentifier("lucio_icon", "drawable", context.getPackageName());
                name = "Lúcio Correia dos Santos";
                height = "5'3";
                age = "26";
                difficulty = "2";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Sonic Amplifier";
                primaryDescription = "Lúcio can hit his enemies with sonic projectiles";
                secondaryName = "Soundwave";
                secondaryDescription = "Lucio can knock enemies back with a blast of sound.";
                passiveName = "Wall Ride";
                passiveDescription = "Lúcio rides along a wall. This has a slight upwards angle, allowing him to ascend the wall.";
                skill1Name = "Crossfade";
                skill1Description = "Lúcio continuously energizes himself, and nearby teammates, with music. He can switch between two songs: one amplifies movement speed, while the other regenerates health.";
                skill2Name = "Amp It Up";
                skill2Description = "Lúcio increases the volume on his speakers, boosting the effects of his songs.";
                ultName = "Sound Barrier";
                ultDescription = "Protective waves radiate out from Lúcio’s Sonic Amplifier, briefly providing him and nearby allies with personal shields.";
                primaryPic = context.getResources().getIdentifier("primary_lucio", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("primary_lucio", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_lucio", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_lucio", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_lucio", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_lucio", "drawable", context.getPackageName());
                break;
            case Constants.MERCY:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("mercy_icon", "drawable", context.getPackageName());
                name = "Angela Ziegler";
                height = "5'7";
                age = "37";
                difficulty = "1";
                health = "200";
                armor = "0";
                shield = "0";
                total = "200";
                primaryName = "Caduceus Staff";
                primaryDescription = "Mercy engages one of two beams that connect to an ally. By maintaining the beams, she can either restore that ally's health or increase the amount of damage they deal.";
                secondaryName = "Caduceus Blaster";
                secondaryDescription = "Mercy shoots a round from her sidearm. It's best reserved for emergency personal defense.";
                passiveName = "Angelic Descent";
                passiveDescription = "Propelled by her Valkyrie suit, Mercy slows the speed of her descent from great heights.";
                skill1Name = "Gaurdian Angel";
                skill1Description = "Mercy flies towards a targeted ally, allowing her to reach them quickly and provide assistance in crucial moments.";
                ultName = "Resurrect";
                ultDescription = "Mercy radiates restorative power, bringing nearby dead allies back into the fight with full health.";
                primaryPic = context.getResources().getIdentifier("primary_mercy", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("secondary_mercy", "drawable", context.getPackageName());
                passivePic = context.getResources().getIdentifier("passive_mercy", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_mercy", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_mercy", "drawable", context.getPackageName());
                break;
            case Constants.SYMMETRA:
                numAbilities = 4;
                heroPortrait = context.getResources().getIdentifier("symmetra_icon", "drawable", context.getPackageName());
                name = "Satya Vaswani";
                height = "5'7";
                age = "28";
                difficulty = "2";
                health = "100";
                armor = "0";
                shield = "100";
                total = "200";
                primaryName = "Photon Projecter";
                primaryDescription = "Symmetra’s weapon emits a short-range beam that homes in on a nearby enemy, dealing continuous damage that increases the longer it is connected. The projector can also release a charged energy ball that deals high damage.";
                skill1Name = "Sentry Turret";
                skill1Description = "Symmetra sets up a small turret that automatically fires speed-reducing blasts at the nearest enemy within range. Several turrets can be built on the battlefield at once.";
                skill2Name = "Photon Shield";
                skill2Description = "Symmetra surrounds an ally with a hard-light shield that absorbs damage and persists as long as that ally remains alive.";
                ultName = "Teleporter";
                ultDescription = "Symmetra places a teleporter exit pad at her current location, and connects it to a teleporter entry pad at her team’s starting point. Allies can travel through the entry pad to the exit pad instantly, enabling them to return to the fight swiftly after being defeated.";
                primaryPic = context.getResources().getIdentifier("primary_symmetra", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_symmetra", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_symmetra", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_symmetra", "drawable", context.getPackageName());
                break;
            case Constants.ZENYATTA:
                numAbilities = 5;
                heroPortrait = context.getResources().getIdentifier("zenyatta_icon", "drawable", context.getPackageName());
                name = "Tekhartha Zenyatta";
                height = "5'8";
                age = "20";
                difficulty = "3";
                health = "50";
                armor = "0";
                shield = "150";
                total = "200";
                primaryName = "Orb of Destruction";
                primaryDescription = "Zenyatta projects his destructive energy orbs either individually.";
                secondaryName = "Orb Volley";
                secondaryDescription = "Zenyatta projects a rapid-fire volley after a few seconds spent gathering power.";
                skill1Name = "Orb of Harmony";
                skill1Description = "Zenyatta casts an orb over the shoulder of a targeted ally. So long as Zenyatta maintains line of sight, the orb slowly restores health to his ally. Only one ally can receive the orb's benefit at a time.";
                skill2Name = "Orb of Discord";
                skill2Description = "Attaching the orb of discord to an opponent amplifies the amount of damage they receive for as long as Zenyatta maintains line of sight. Only one opponent can suffer the orb's effects at a time.";
                ultName = "Transcendence";
                ultDescription = "Zenyatta enters a state of heightened existence for a short period of time. While transcendent, Zenyatta cannot use abilities or weapons, but is immune to damage, moves twice as fast, and automatically restores his health and that of nearby allies.";
                primaryPic = context.getResources().getIdentifier("primary_zenyatta", "drawable", context.getPackageName());
                secondaryPic = context.getResources().getIdentifier("primary_zenyatta", "drawable", context.getPackageName());
                skill1Pic = context.getResources().getIdentifier("skill1_zenyatta", "drawable", context.getPackageName());
                skill2Pic = context.getResources().getIdentifier("skill2_zenyatta", "drawable", context.getPackageName());
                ultPic = context.getResources().getIdentifier("ult_zenyatta", "drawable", context.getPackageName());
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
            primaryInfo.add(Integer.toString(primaryPic));
        }
        if(secondaryName != null){
            secondaryInfo.add(secondaryName);
            secondaryInfo.add(secondaryDescription);
            secondaryInfo.add(Integer.toString(secondaryPic));
        }
        if(passiveName != null){
            passiveInfo.add(passiveName);
            passiveInfo.add(passiveDescription);
            passiveInfo.add(Integer.toString(passivePic));
        }
        if(skill1Name != null){
            skill1Info.add(skill1Name);
            skill1Info.add(skill1Description);
            skill1Info.add(Integer.toString(skill1Pic));
        }
        if(skill2Name != null){
            skill2Info.add(skill2Name);
            skill2Info.add(skill2Description);
            skill2Info.add(Integer.toString(skill2Pic));
        }
        if(ultName != null){
            ultInfo.add(ultName);
            ultInfo.add(ultDescription);
            ultInfo.add(Integer.toString(ultPic));
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
