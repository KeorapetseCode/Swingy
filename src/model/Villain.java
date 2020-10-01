package model;

import java.util.Random;

public class Villain{
    public VillainType villian;
    public Coordinates coordinates;
  /*  
    public void enemyStartPos(Character player){
    }
*/
    public static void makeVillains(Character player){
        int enemy_num = Map.max_size \ 2;
        int temp[enemy_num-1][enemy_num-1];
        String[] tempA = {"Armour, Weapon, Helm"};
        String[] tempN = {"Slime, Zombie, Ghost"};

        Villain enemies[] = new Villain[enemy_num];
        Random random = new Random();
        //System.out.println("enemy " + enemies.length);
        for (int i = 0; i < enemies.length; i++){
            enemies[i].villian.name = tempN[random.nextInt(3)];
            if (enemies[i].villian.name.equals("Slime")){
                enemies[i].villian.artifact = tempA[2];
                enemies[i].villian.power = 500;
            }
            else if (enemies[i].villian.name.equals("Zombie")){
                enemies[i].villian.artifact = tempA[0];
                enemies[i].villian.power = 600;
            }
            else if (enemies[i].villian.name.equals("Ghost")){
                enemies[i].villian.artifact = tempA[1];
                enemies[i].villian.power = 800;
            }
        }
    }

}