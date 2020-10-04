package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.IOException;
import java.lang.Math;
import model.Character;
import model.Map;
import view.Stats;
import model.Villain;
//import model.Simulation;

public class Gameplay{

    //Create An Array Of Villains
    public Villain[] makeEnemies(){
        
        int num = Map.max_size / 2;
        Villain[] ret = new Villain[num];
    //  Giving name and stats values to each Villian
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
                System.out.println("Coordinates Similar To that of player");
                while (enemies[i].x_axis == player.coordinates.x_ax){
                    enemies[i].x_axis = (int)(Math.random() * Map.max_size);
                }
            }
        }
    }

    public static void iterate(Character player){
        
        Gameplay temp = new Gameplay();
        Gameplay obj = new Gameplay();
        Villain enemyLst[] = temp.makeEnemies();
        temp.setCoordinates(enemyLst, player);
        
        System.out.println("Move Player" + "\n");
        System.out.println("(1).Up  (2).Down  (3).Left  (4).Right" + "\n");
        
        while ((player.coordinates.x_ax < Map.max_size) && (player.coordinates.y_ax < Map.max_size)){
            
            System.out.println("Player's Coordinates " + player.coordinates.x_ax + " " + player.coordinates.y_ax);
            int i = 0;
            while (i < enemyLst.length){
                System.out.println(enemyLst[i].name + " " + enemyLst[i].x_axis + " " + enemyLst[i].y_axis);
                i++;
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
                //System.out.println("Something else happens");
                for (int a = 0; a < enemyLst.length; a++){
                    if ((enemyLst[a].x_axis == player.coordinates.x_ax) && (enemyLst[a].y_axis == player.coordinates.y_ax)){
                        System.out.println("You Have Encountered A Villain" + "\n" + "1. Fight" + "\n" + "2. Run");
                        if (Simulation.encounter(player, enemyLst, a) == 1){
                            break ;
                        }
                        else if (Simulation.encounter(player, enemyLst, a) == 2){
                            System.out.println("Your Character Died");
                            System.exit(0);
                        }
                    }
                }
            }
            catch(IOException err){
                System.out.println("Error_Cannot Process Input Movement" + "\n");
                err.printStackTrace();
            }      
        }
    }
    private void move_left(Character player){
        player.coordinates.x_ax -= 1;
    }
    private void move_right(Character player){
        player.coordinates.x_ax += 1;
    }
    private void move_up(Character player){
        player.coordinates.y_ax += 1;
    }
    private void move_down(Character player){
        player.coordinates.y_ax -= 1;
    }
}