package controller;

import model.Character;
//import model.Map;
//import

public class LevelUp {
    public static boolean level_up(Character player){
        if (player.xp >= 12200){
            player.level++;
            System.out.print("Player Leveled Up " + player.level +"\n");
            return true;
        }
        else if (player.xp >= 8050){
            player.level++;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        else if (player.xp >= 4800){
            player.level++;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        else if (player.xp >= 2450){
            player.level++;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        else if (player.xp >= 1000){
            player.level++;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        return false;
    }
}
