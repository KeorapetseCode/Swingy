package controller;

import model.Character;
import model.Villain;
import java.lang.Math;

public class Simulation {
    
    public static boolean run(Character player, Villain[] enemies, int indx){
        int temp = (int)(Math.random() * 2);
        if (temp == 1){
            System.out.println("You Have Fled Successful");
        }
        else if (temp == 0){
            System.out.println("Could Not Run Away!");
            if (Simulation.fight(player, enemies[indx]) == false){
                return false;
            }
        }
        return true;
    }
    public static boolean fight(Character player, Villain enemies){
        if (player.hero.luck > 0){
            player.defeatVillain(enemies);
        }
        if (player.hero.attack > 5){
            player.defeatVillain(enemies);
        }
        if (player.hero.defense > 5){
            player.defeatVillain(enemies);
        }
        else{
            int temp = (int)(Math.random() * 2);
            //System.out.println("temp in fight method is " + temp);
            if (temp == 1){
                player.defeatVillain(enemies);
            }
            else{
                return false;
            }
        }
        System.out.println("You Defeated A Villain check stats to see what you have gained");
        return true;
    }
}
