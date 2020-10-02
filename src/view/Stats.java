package view;

import controller.ConsoleMode;
import model.Character;

public class Stats{
    
    public static void display(Character player){
        ConsoleMode.clearScreen();
        System.out.println("Player Stats: "+ player.name);
        System.out.println("Hero Type: " + player.getHero());
        System.out.println("Level: " + player.level + "\n" + "XP: " + player.xp);
        System.out.println("Player Position:");
        player.getPos();
    }
}
