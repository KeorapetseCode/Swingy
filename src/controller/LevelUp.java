package controller;

import model.Character;
//import model.Map;
//import

public class LevelUp {
    public static boolean level_up(Character player){
        if (player.xp >= 12200 && player.level < 5){
            player.level = 5;
            System.out.print("Player Leveled Up " + player.level +"\n");
            return true;
        }
        else if (player.xp >= 8050 && player.level < 4){
            player.level = 4;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        else if (player.xp >= 4800 && player.level < 3){
            player.level = 3;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        else if (player.xp >= 2450 && player.level < 2){
            player.level = 2;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        else if (player.xp >= 1000 && player.level < 1){
            player.level = 1;
            System.out.print("Player Leveled Up " + player.level + "\n");
            return true;
        }
        return false;
    }
}
