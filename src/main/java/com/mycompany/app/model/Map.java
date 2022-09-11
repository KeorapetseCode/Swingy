package com.mycompany.app.model;

public class Map {
    public static int max_size;

    private void mapSize(Character player){
        if (player.level == 0){
            Map.max_size = 6;
        }
        else if (player.level > 0){
            Map.max_size = (player.level - 1) * 5 + 10 - (player.level % 2); 
        }
    }

    public void startingPos(Character player){
        Coordinates temp = new Coordinates();
        temp.y_ax = Map.max_size / 2;
        temp.x_ax = Map.max_size / 2;
        player.coordinates = temp;
    }

    public static void newMap(Character player){
        Map temp = new Map();

        temp.mapSize(player);
        temp.startingPos(player);
    }
    
    
}
