package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
import model.Character;
import model.Map;
import view.Stats;

public class Gameplay{

//Create An Array Of Villains and Initialise their cooordinates  
    public static void iterate(Character player){
        
        System.out.println("Move Player" + "\n");
        System.out.println("(1).Up  (2).Down  (3).Left  (4).Right" + "\n");    
        while ((player.coordinates.x_ax < Map.max_size) && (player.coordinates.y_ax < Map.max_size)){
            Gameplay obj = new Gameplay();

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
                System.out.println("Something else happens");
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