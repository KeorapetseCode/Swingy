package controller;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.lang.Math;
//import java.util.Random;
import model.Character;
import model.Map;
//import view.Stats;
import model.Villain;

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
    public Villain[] giveCoordinates(Villain[] enemies, Character player){

        int num = Map.max_size / 2;
        int random = (int)(Math.random() * num);
        int i = 0;
        int x = 0;
        int temp;

        for (int a = 0; a < enemies.length; a++){
            temp = (int)(Math.random() * random);
            if (temp == player.coordinates.x_ax){

            }
            //enemies[a].coordinates.x_ax = (int)(Math.random() * num);
            //enemies[a].coordinates.y_ax = (int)(Math.random() * num);
        }
        return enemies;
    }

    public static void iterate(Character player){
        
        Gameplay temp = new Gameplay();
        Villain enemyLst[] = temp.makeEnemies();
        Villain loop;
        int i = 0;
        //System.out.println("Enemy List is " + enemyLst[0].getName());
        while (i < enemyLst.length){
            System.out.println(enemyLst[i].name);
            i++;
        }
        //temp.giveCoordinates(enemyLst, player);
        System.out.println("Move Player" + "\n");
        System.out.println("(1).Up  (2).Down  (3).Left  (4).Right" + "\n");
        /*
        while ((player.coordinates.x_ax < Map.max_size) && (player.coordinates.y_ax < Map.max_size)){
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
        }*/
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