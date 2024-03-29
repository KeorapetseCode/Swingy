package com.mycompany.app.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import com.mycompany.app.model.Character;
import com.mycompany.app.model.Map;
import com.mycompany.app.model.SaveGame;
import com.mycompany.app.view.Stats;
import com.mycompany.app.model.Villain;

public class Gameplay{

    //Create An Array Of Villains
    public Villain[] makeEnemies(){
        
        int num = Map.max_size / 2;
        Villain[] ret = new Villain[num];
        for (int a = 0; a < ret.length; a++){
            ret[a] = new Villain();
        }
        return ret;
    }
    //  Initialise Villains cooordinates
    public void setCoordinates(Villain[] enemies, Character player){

        int temp_x;
        int temp_y;

        for (int a = 0; a < enemies.length; a++){
            temp_x = (int)(Math.random() * Map.max_size);
            enemies[a].x_axis = temp_x;
        }
        for (int i = 0; i < enemies.length; i++){
            temp_y = (int)(Math.random() * Map.max_size);
            enemies[i].y_axis = temp_y;
    
            if ((enemies[i].x_axis == player.coordinates.x_ax) && (enemies[i].y_axis == player.coordinates.y_ax)){
                //System.out.println("Coordinates Similar To that of player");
                while (enemies[i].x_axis == player.coordinates.x_ax){
                    enemies[i].x_axis = (int)(Math.random() * Map.max_size);
                }
            }
        }
    }
//  Main game iteration function
    public static void iterate(Character player){
        
        Gameplay temp = new Gameplay();
        Gameplay obj = new Gameplay();
        Villain enemyLst[] = temp.makeEnemies();
        temp.setCoordinates(enemyLst, player);
        
        System.out.println("Move Player" + "\n");
        System.out.println("(1).Up  (2).Down  (3).Left  (4).Right" + "\n");
        
        while ((player.coordinates.x_ax < Map.max_size) && (player.coordinates.y_ax < Map.max_size)){
            
            System.out.println("Player's Coordinates " + player.coordinates.y_ax + " " + player.coordinates.x_ax);
            for (int i = 0; i < enemyLst.length; i++){
                System.out.println(enemyLst[i].name + " " + enemyLst[i].y_axis + " " + enemyLst[i].x_axis + "\n");
            }
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try{
                String input = reader.readLine();
                if (input.equals("1")){
                    obj.move_up(player);
                }
                else if (input.equals("2")){
                    obj.move_down(player);
                }
                else if (input.equals("3")){
                    obj.move_left(player);
                }
                else if (input.equals("4")){
                    obj.move_right(player);
                }
                else if (input.equals("info") || input.equals("stats")){
                    Stats.display(player);
                }
                else if (input.equals("exit")){
                    System.exit(0);
                }
                else{
                    System.out.println("Unrecognised Movement Command");
                }
                if (player.coordinates.x_ax < 0 || player.coordinates.y_ax < 0){
                    player.xp += 1000;
                    Map.newMap(player);
                    enemyLst = temp.makeEnemies();
                    temp.setCoordinates(enemyLst, player);
                    SaveGame.saveProgress(player);
                }
                else if (player.coordinates.x_ax >= Map.max_size || player.coordinates.y_ax >= Map.max_size){
                    player.xp += 1000;
                    Map.newMap(player);
                    enemyLst = temp.makeEnemies();
                    temp.setCoordinates(enemyLst, player);
                    SaveGame.saveProgress(player);
                }
                for (int a = 0; a < enemyLst.length; a++){
                    if ((enemyLst[a].x_axis == player.coordinates.x_ax) && (enemyLst[a].y_axis == player.coordinates.y_ax) && (enemyLst[a].power > 0)){
                        obj.gamefunc(player, enemyLst[a]);
                    }
                }
                if (LevelUp.level_up(player) == true){
                    Map.newMap(player);
                    enemyLst = temp.makeEnemies();
                    temp.setCoordinates(enemyLst, player);
                    SaveGame.saveProgress(player);
                }
            }
            catch(IOException err){
                System.out.println("Error_Cannot Process Input Movement" + "\n");
                err.printStackTrace();
            }      
        }
    }

    public void gamefunc(Character player, Villain enemy){

        ConsoleMode.clearScreen();            
        System.out.println("You Have Encountered A Villain" + "\n" + "1. Fight" + "\n" + "2. Run" + "\n\n" + "tip:You can view your stats before fighting");
        System.out.println("Villain Type: "+ enemy.name + "\n");
        BufferedReader resp = new BufferedReader(new InputStreamReader(System.in));
        try{
            boolean fight = true;
            while (fight){
                String input_2 = resp.readLine();
                if (input_2.equals("1")){
                    System.out.println("\n");
                    if (Simulation.fight(player, enemy) == true){
                        SaveGame.saveProgress(player);
                        fight = false;
                    }
                    else{
                        System.out.println("Your Player Died In The Fight");
                        System.exit(0);
                    }
                }
                else if (input_2.equals("2")){
                    if (Simulation.run(player, enemy) == true){
                        SaveGame.saveProgress(player);
                        fight = false;
                    }
                    else{
                        System.out.println("Your Player Died In The Fight");
                        System.exit(0);
                    }
                }
                else if (input_2.equals("info") || input_2.equals("stats")){
                    Stats.display(player);
                    Stats.villainInfo(enemy);
                    System.out.println("1. Fight" + "\n" + "2. Run");
                }
                else if (input_2.equals("exit")){
                    System.exit(1);
                }
                else{
                    System.out.println("Unrecognised Response To Fight");
                }
            }
        }
        catch(IOException err){
            System.out.println("Error At Response");
        }
    }

    private void move_left(Character player){
        player.coordinates.x_ax += 1;
    }

    private void move_right(Character player){
        player.coordinates.x_ax -= 1;
    }

    private void move_up(Character player){
        player.coordinates.y_ax += 1;
    }

    private void move_down(Character player){
        player.coordinates.y_ax -= 1;
    }
}