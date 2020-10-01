package model;

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

        Villain enemies[] = new Villain[enemy_num];
        //System.out.println("enemy " + enemies.length);
        for (int i = 0; i < enemies.length; i++){
            enemies[i].villian
        }
    }

}