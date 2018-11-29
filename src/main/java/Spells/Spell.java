package Spells;

import Interfaces.IObject;

public class Spell implements IObject {

    private String type;
    private int damage;

    public Spell(String type, int damage){
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}
