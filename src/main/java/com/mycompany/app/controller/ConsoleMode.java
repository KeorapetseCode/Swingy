package com.mycompany.app.controller;
//package javax.validation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import com.mycompany.app.model.Character;
import com.mycompany.app.model.Map;
import com.mycompany.app.model.SaveGame;
//import javax.validation.constraints.*;
//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.*;

public class ConsoleMode {
    public static void startSwingy(){
        clearScreen();

        System.out.println("\n"+"Welcome To Swingy" + "\n\n" + "1. Create New Player" + "\n" + "2. Load Player");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading data
        try {
            Boolean loop = true;
            while (loop){
                @NotBlank(message = "Name is required.")
                String input = reader.readLine();
                if (input.equals("1")){
                    while (true){
                        System.out.println("Give Player Name" + "\n"); 
                        input = null;
                        input = reader.readLine();
                        if (input.isEmpty() == false){
                            if (input.equals("exit") == true){
                                reader.close();
                                System.exit(0);
                            }
                            break ;
                        }
                    }
                    String playerName = input;
                    Character playerObj = new Character();
                    input = null;
                    while(true){
                        System.out.println("What Type of Hero Is Your Player" + "\n\n" + "1. Warrior" + "\n" + "2. Assassin" + "\n" + "3. Brute");  
                        input = reader.readLine();
                        if (input.isEmpty() == false){
                            if(input.equals("1") || input.equals("2") || input.equals("3")){
                                break ;
                            }
                            else if (input.equals("exit")){
                                reader.close();
                                System.exit(0);
                            }
                            else{
                                System.out.println("Unrecognised Input");
                            }
                        }
                    }
                    if (input.equals("1")){
                        playerObj.createPlayer(playerName, "Warrior");
                    }
                    else if (input.equals("2")){
                        playerObj.createPlayer(playerName, "Assassin");
                    }
                    else if (input.equals("3")){
                        playerObj.createPlayer(playerName, "Brute");
                    }
                    Map.newMap(playerObj);
                    SaveGame.createSaveFile(playerObj);
                    Gameplay.iterate(playerObj);
                    loop = false;
                }
                else if (input.equals("2")){
                    while (true){
                        System.out.println("Give Player Name" + "\n"); 
                        input = null;
                        input = reader.readLine();
                        if (input.isEmpty() == false){
                            if (input.equals("exit")){
                                reader.close();
                                System.exit(0);
                            }
                            break ;
                        }
                    }
                    SaveGame.loadPlayer(input);
                    loop = false;
                }
                else if (input.equals("exit")){
                    loop = false;
                    System.exit(0);
                }
                else{
                    System.out.println("Unrecognised Input");
                    //line = null;
                }
            }
        }
        catch (IOException err) {
            System.out.println("Error Input!!");
            //break ;
        }
        
    }
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
