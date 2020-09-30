package model;

public class Map {
    public void newMap(Character player){
        int mapType = mapSize(player);
        System.out.println("Map Size is " + mapType);
    }
    public int mapSize(Character player){
        int sqr = 0;

        if (player.level == 1){
            sqr = (player.level - 1) * 5 + 10 - (player.level % 2); 
        }
        return sqr;
    }
}
