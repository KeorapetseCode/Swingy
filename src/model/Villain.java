package model;

import java.lang.Math;

public class Villain{
    public VillainType villian;
    public String name;
    public String artifact;
    public int power;
    public int x_axis;
    public int y_axis; 

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
/*
    public void giveY(int y){
        Coordinates temp = new Coordinates();
        temp.y_ax = y;
        this.coordinates = temp;
    }
  */  
    public String getName(){
        return this.name;
    }
}