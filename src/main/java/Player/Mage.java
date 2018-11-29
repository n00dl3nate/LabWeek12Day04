package Player;

import Pets.Pet;
import Spells.Spell;

public class Mage extends Player{

    private Spell spell;
    private Pet pet;

    public Mage(String type, Spell spell, Pet pet){
        super(type);
        this.spell = spell;
        this.pet = pet;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public int totalAttack(){
        return this.spell.getDamage() +this.attack;
    }

    public int totalDefence(){
        return this.pet.getDefence() + this.defence;
    }

    public int petAttack() {
        return this.pet.getAttack();
    }
}
