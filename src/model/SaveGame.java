package model;

//import java.io.File;
import java.io.FileNotFoundException;
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
    }

    public static void loadPlayer(Character player){
        
    }
    
}
