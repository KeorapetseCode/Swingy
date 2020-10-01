package model;

import java.util.Random;

public class Villain{
    public VillainType villian;
    public Coordinates coordinates;
    public String name;
    public String artifact;
    public int power;

    public void makeVillain(){
        //int enemy_num = Map.max_size / 2;
        String[] tempA = {"Armour, Weapon, Helm"};
        String[] tempN = {"Slime, Zombie, Ghost"};
        Random random = new Random();

        this.name = tempN[random.nextInt(3)];
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
    }
}