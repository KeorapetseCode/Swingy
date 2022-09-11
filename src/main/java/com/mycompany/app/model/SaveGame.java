package com.mycompany.app.model;

import java.util.ArrayList;
import java.util.Iterator;
import com.mycompany.app.controller.Gameplay;
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
        createSaveFile(player);
    }
    public static void loadPlayer(String name){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("swingy.txt"));
            String line = reader.readLine();
            if (line == null){
                System.out.println("Cannot Load Player");
            }
            else{
                ArrayList<String> temp_2 = new ArrayList<String>();
                if (line.contains(name)){
                    while (line != null){
                        int indx = line.indexOf(": ");
                        temp_2.add(line.substring(indx+2));
                        line = reader.readLine();
                    }
                    Iterator<String> iter = temp_2.iterator();
                    String temp_1 = iter.next();
                    Character player = new Character();
                    player.createPlayer(temp_1, iter.next());
                    temp_1 = iter.next();
                    player.level = Integer.parseInt(temp_1);

                    temp_1 = iter.next();
                    player.xp = Integer.parseInt(temp_1);

                    temp_1 = iter.next();
                    player.hero.attack = Integer.parseInt(temp_1);

                    temp_1 = iter.next();
                    player.hero.defense = Integer.parseInt(temp_1);
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
