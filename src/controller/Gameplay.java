package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.IOException;
import java.util.Random;
import model.Character;
import model.Map;

public class Gameplay{

//Create An Array Of Villains and Initialise their cooordinates  
    public static void iterate(Character player){
        
        while ((player.coordinates.x_ax < Map.max_size) && (player.coordinates.y_ax < Map.max_size)){
            System.out.println("Move Player" + "\n");
            System.out.println("(1).Up  (2).Down  (3).Left  (4).Right" + "\n");
            Gameplay obj = new Gameplay();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try{
                String input = reader.readLine();
                if (input.equals("1")){
                    
                }
            }
            catch(IOException err){
                err.printStackTrace();
            }      
        }
    }
    public void move_left(Character player){
        player.coordinates.x_ax -= 1;
    }
    public void move_right(Character player){
        player.coordinates.x_ax += 1;
    }
    public void move_up(Character player){
        player.coordinates.y_ax += 1;
    }
    public void move_down(Character player){
        player.coordinates.y_ax -= 1;
    }
}