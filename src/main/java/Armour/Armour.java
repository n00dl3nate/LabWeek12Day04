package Armour;

import Interfaces.IObject;

public class Armour implements IObject {

    private String type;
    private int defence;

    public Armour(String type, int defence){
        this.type = type;
        this.defence = defence;
    }

    public String getType() {
        return type;
    }

    public int getDefence() {
        return defence;
    }
}
