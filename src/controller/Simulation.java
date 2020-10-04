package controller;

import model.Character;
import model.Villain;

public class Simulation {
    
    public static boolean run(Character player, Villain[] enemies, int indx){
        int temp = (int)(Math.random() * 2);
        if (temp == 1){
            System.out.println("You Have Fled Successful");
        }
        else if (temp == 0){
            System.out.println("Could Not Run Away!");
            if (Simulation.fight(player, enemies, indx) == false){
                return false;
            }
        }
        return true;
    }
    public static boolean fight(Character player, Villain[] enemies, int indx){
        

        return true;
    }
}
