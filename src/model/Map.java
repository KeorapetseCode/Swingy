package model;

public class Map {
    public static int max_size;

    private void makeMap(Character player){
        if (player.level == 0){
            max_size = 5;
        }
        else if (player.level > 0){
            max_size = (player.level - 1) * 5 + 10 - (player.level % 2); 
        }
    }

    private void startingPos(int max_size, Character player){
        player.coordinates.x_ax = max_size / 2; 
        player.coordinates.y_ax = max_size / 2;
    }

    public static void newMap(Character player){
        Map temp = new Map();

        temp.makeMap(player);
        temp.startingPos(max_size, player);
        if (player.level == 0){
            
        }
        //System.out.println("Map Size is " + mapType);
    }
    
}
