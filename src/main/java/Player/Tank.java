package Player;

import Armour.Armour;
import Interfaces.IObject;
import Spells.Spell;
import Weapons.Weapon;

import java.util.ArrayList;

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

    public String PickUpIObject(IObject item){
        if(item instanceof Weapon && ((Weapon) item).getAttack() > this.weapon.getAttack()){
            setWeapon(((Weapon)item));
            return ((Weapon) item).getType() + " Has Been Set As Your New Weapon";
        }
        if(item instanceof Weapon){
            return "Your Current Weapon is More PowerFul";
        }
        if(item instanceof Armour && ((Armour) item).getDefence() > this.armour.getDefence()){
            setArmour((Armour) item);
            return ((Armour) item).getType() + " Has Been Set As Your New Armour";
        }
        if(item instanceof Armour){
            return "Your Current Armour Is Better!";
        }
        else{
            return "You Can Not Use This Item";
        }
    }
}
