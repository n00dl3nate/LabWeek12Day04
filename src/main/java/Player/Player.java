package Player;

import Rooms.Room;

public abstract class Player {

    protected int hp;
    protected int treasure;
    protected int defence;
    protected int attack;
    private String type;

    public Player(String type){
        this.type = type;
        this.hp = 100;
        this.treasure = 0;
        this.defence = 1;
        this.attack = 1;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getType() {
        return type;
    }

    public void collectTreasure(Room room){

    }
}
