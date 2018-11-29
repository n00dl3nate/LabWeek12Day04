package Player;

import Armour.Armour;
import Weapons.Weapon;

public class Tank extends Player {

    private Weapon weapon;
    private Armour armour;

    public Tank(String type,Weapon weapon,Armour armour){
        super(type);
        this.weapon = weapon;
        this.armour = armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int totalAttack(){
        return this.attack + this.weapon.getAttack();
    }

    public int totalDefence(){
        return this.defence + this.armour.getDefence();
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
