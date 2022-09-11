package com.mycompany.app.view;

//import controller.ConsoleMode;
import com.mycompany.app.model.Character;
import com.mycompany.app.model.Villain;
import java.util.Iterator;

public class Stats{
    
    public static void display(Character player){
        //ConsoleMode.clearScreen();
        System.out.println("Player Stats: "+ player.name);
        System.out.println("Hero Type: " + player.getHero());
        System.out.println("Level: " + player.level + "\n" + "XP: " + player.xp);
        System.out.println("Attack: " + player.hero.attack + "\n" + "Defence: " + player.hero.defense);
        
        if (player.artifacts.isEmpty() == false){
            Iterator <String> temp = player.artifacts.iterator();
            System.out.println("Artifacts:");
            while (temp.hasNext()){
                System.out.println(temp.next());
            }
        }
        System.out.println("\n");
    }

    public static void villainInfo(Villain enemy)
    {
        if (enemy.name.equals("None") == false){
            System.out.println("Enemy Type: " + enemy.getName());
            System.out.println("Enemy Strength: " + enemy.power);
            System.out.println("Enemy Artifact: " + enemy.artifact + "\n");
        }
    }

}
