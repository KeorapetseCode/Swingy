package model;

public class HeroType {
    public int attack;
    public int defense;
    public String hero_type;
    
    public HeroType(String hero){
        if (hero.equals("Worrior")){
            this.attack = 4;
            this.defense = 2;
            this.hero_type = "Worrior";
        }
        else if (hero.equals("Assassin")){
            this.attack = 3;
            this.defense = 3;
            this.hero_type = "Assassin";
        }
        else if (hero.equals("Brute")){
            this.attack = 5;
            this.defense = 1;
            this.hero_type = "Brute";
        }
    }
}
