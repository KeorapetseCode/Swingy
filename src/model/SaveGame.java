package model;

import controller.Gameplay;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class SaveGame {

    public static void createSaveFile(Character player){
        try{
            FileWriter saveFile = new FileWriter("swingy.txt");
            saveFile.write("Player Name: " + player.name + "\n" + "Hero Type: " + player.getHero() + "\n");
            saveFile.write("Level: " + player.level + "\n" + "XP: " + player.xp + "\n");
            saveFile.write("Attack: " + player.hero.attack + "\n");
            saveFile.write("Defence: " + player.hero.defense + "\n");
            //saveFile.write("Luck Artifacts: " + player.hero.luck + "\n");
            saveFile.close();
            
        }
        catch(IOException err){
            System.out.println("Could Not Create Save File");
        }
    }
    public static void saveProgress(Character player){

        /*
        try{
            BufferedReader reader = new BufferedReader(new FileReader("swingy.txt"));
            String line = reader.readLine();
            
            while (line != null){

                line = reader.readLine();
            }
            FileWriter editor = new FileWriter("swingy.txt");
            editor.close();
            reader.close();
        }
        catch (IOException err){
            System.out.println("Swingy Was NEVER Found!!!");
            err.getMessage();
            //err.printStackTrace();
        }
        */
    }

    public static void loadPlayer(String name){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("swingy.txt"));
            String line = reader.readLine();
            if (line == null){
                System.out.println("Cannot Load Player");
            }
            else{
                String temp_1 = null;
                String temp_2 = null;
                if (line.contains(name)){
                    int indx = line.indexOf(": ");
                    temp_1 = line.substring(indx+2);
                    //System.out.println("Temp 1 =" + temp_1);
                    indx = 0;
                    
                    line = reader.readLine();
                    indx = line.indexOf(": ");
                    temp_2 = line.substring(indx+2);
                    
                    Character player = new Character();
                    System.out.println("Temp 2 " + temp_2 + "\n");
                    player.createPlayer(temp_1, temp_2);
                    System.out.println("Player Hero " + player.getHero() + "\n");
                    Map.newMap(player);
                    Gameplay.iterate(player);
                
                
                }
                else {
                    System.out.println("Could Not Find User");
                }
            }
            reader.close();
        }
        catch(IOException err){
            System.out.println("Could Not Load!!!");
        }        
    }
    
}
