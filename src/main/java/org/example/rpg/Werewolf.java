package org.example.rpg;

public class Werewolf extends Monster implements Bleedable{
    public Werewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }
    public double bleed() {
        return getDamage() * 0.2;
    }

    public double attack(){
        return getDamage() + bleed();
    }

}
