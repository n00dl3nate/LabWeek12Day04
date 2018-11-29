package Rooms;

import Interfaces.IObject;

public class TreasureRoom extends Room  {

    private int gold;

    public TreasureRoom(IObject object, int gold){
        super(object);
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }
}
