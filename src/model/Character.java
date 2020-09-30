package model;

public class Character {
    public String name;
    public HeroType hero;
    public int level;
    public int xp;
    
    public void createPlayer(String name, String heroStr){
        HeroType newHero = new HeroType(heroStr);
        
        this.name = name;    
        this.level = 1;
        this.xp = 100;
        this.hero = newHero;
    }

    public String getHero(){
        return this.hero.hero_type;
    }

}
