package Weapons;

import Interfaces.IObject;

public class Weapon implements IObject {

    private String type;
    private int damage;

    public Weapon(String type, int attack){
        this.type = type;
        this.damage = attack;
    }

    public String getType() {
        return type;
    }

    public int getAttack() {
        return damage;
    }
}
