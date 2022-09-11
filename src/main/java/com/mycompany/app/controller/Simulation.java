package com.mycompany.app.controller;

import com.mycompany.app.model.Character;
import com.mycompany.app.model.Villain;
import java.lang.Math;

public class Simulation {
    
    public static boolean run(Character player, Villain enemy){
        if (player.hero.luck > 0){
            player.hero.luck--;
        }
        else{
            int temp = (int)(Math.random() * 2);
            if (temp == 0){
                System.out.println("Could Not Run Away!");
                if (Simulation.fight(player, enemy) == false){
                    return false;
                }
            }
        }
        System.out.println("You Have Fled Successful");
        return true;
    }
    
    public static boolean fight(Character player, Villain enemies){
        if (player.hero.luck > 0){
            player.hero.luck -= 1;
            player.defeatVillain(enemies);
        }
        else if (player.hero.attack >= 5){
            player.hero.attack -= 5;
            player.defeatVillain(enemies);
        }
        else if (player.hero.defense >= 5){
            player.hero.defense -= 5;
            player.defeatVillain(enemies);
        }
        else{
            int temp = (int)(Math.random() * 2);
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
