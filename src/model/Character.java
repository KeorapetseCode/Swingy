package model;

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
        this.artifacts.add(enemy.artifact);
        this.hero.acquirArtifact(enemy.artifact);
        enemy.artifact = null;
        this.xp = this.xp + enemy.power;
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
