package Potions;

import Interfaces.IObject;

public class Potion implements IObject {

    private String type;
    private int effect;
    private int doses;

    public Potion(String type, int effect){
        this.type = type;
        this.effect = effect;
        this.doses = 4;
    }

    public int getDoses() {
        return doses;
    }

    public void setDoses(int doses) {
        this.doses = doses;
    }

    public String getType() {
        return type;
    }

    public int getEffect() {
        return effect;
    }
}
