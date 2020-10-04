package model;

public class HeroType {
    public int attack;
    public int defense;
    public int luck; 
    public String hero_type;
    
    public HeroType(String hero){
        if (hero.equals("Warrior")){
            this.attack = 4;
            this.defense = 2;
            this.hero_type = hero;
        }
        else if (hero.equals("Assassin")){
            this.attack = 3;
            this.defense = 3;
            this.hero_type = hero;
        }
        else if (hero.equals("Brute")){
            this.attack = 5;
            this.defense = 1;
            this.hero_type = hero;
        }
    }
    public void acquirArtifact(String artifact){
        if (artifact.equals("Armour")){
            this.defense = this.defense + 5;
        }
        else if (artifact.equals("Helm")){
            this.luck = this.luck + 1;
        }
        else if (artifact.equals("Weapon")){
            this.attack = this.attack + 5;
        }
    }
}
