package model;

public class Map {
    public static int min;
    public static int max;

    private int makeMap(Character player){
        int sqr = 0;
        if (player.level == 0){
            sqr = 7;
        }
        else{
            sqr = (player.level - 1) * 5 + 10 - (player.level % 2); 
        }
        return sqr;
    }

    public static void newMap(Character player){
        Map temp = new Map();

        int mapType = temp.makeMap(player);
        System.out.println("Map Size is " + mapType);
    }

    
}
