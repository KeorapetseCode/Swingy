package com.mycompany.app.model;

import java.util.ArrayList;

public class Character {
    public String name;
    public HeroType hero;
    public Coordinates coordinates;
    public int level;
    public int xp;
    public ArrayList<String> artifacts = new ArrayList<String>();
    
    public void createPlayer(String name, String heroStr){
        HeroType temp = new HeroType(heroStr);        
        this.name = name;
        this.level = 0;
        this.xp = 500;
        this.hero = temp;
    }

    public void defeatVillain(Villain enemy){

        //this.hero.acquirArtifact(enemy.artifact);
        if (enemy.artifact.equals("Armour")){
            this.hero.defense += 5;
            this.xp += 500;
        }
        else if (enemy.artifact.equals("Helm")){
            this.hero.luck += 1;
            this.xp += 500;
        }
        else if (enemy.artifact.equals("Weapon")){
            this.hero.attack += 5;
            this.xp += 500;
        }
        this.artifacts.add(enemy.artifact);
        //enemy.artifact = null;
        this.xp += enemy.power;
        enemy.power = 0;
        enemy.name = "None";
    }

    public String getHero(){
        return this.hero.hero_type;
    }
    public void getPos(){
        System.out.println("X axis " + this.coordinates.x_ax);
        System.out.println("Y axis " + this.coordinates.y_ax + "\n");
    }

}
