package model;

public class Character {
    public String name;
    public HeroType hero;
    public Coordinates coordinates;
    public int level;
    public int xp;
    
    public void createPlayer(String name, String heroStr){
        HeroType temp = new HeroType(heroStr);
        
        this.name = name;
        this.level = 0;
        this.xp = 0;
        this.hero = temp;
    }
    public String getHero(){
        return this.hero.hero_type;
    }
    public void getPos(){
        System.out.println("X axis " + this.coordinates.x_ax);
        System.out.println("Y axis " + this.coordinates.y_ax + "\n");
    }

}
