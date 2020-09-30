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

}
