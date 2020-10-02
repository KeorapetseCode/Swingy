package model;

import java.lang.Math;

public class Villain{
    public VillainType villian;
    public Coordinates coordinates;
    public String name;
    public String artifact;
    public int power;

    public Villain(){

        String[] tempA = {"Armour", "Weapon", "Helm"};
        String[] tempN = {"Slime", "Zombie", "Ghost"};

        int random = (int)(Math.random() * 3);
        this.name = tempN[random];
        if (this.name.equals("Slime")){
            this.artifact = tempA[2];
            this.power = 500;
        }
        else if (this.name.equals("Zombie")){
            this.artifact = tempA[0];
            this.power = 600;
        }
        else if (this.name.equals("Ghost")){
            this.artifact = tempA[1];
            this.power = 800;
        }
        else{
            System.out.println("It picked None");
        }
    }
    public String getName(){
        return this.name;
    }
}