import Armour.Armour;
import Pets.Pet;
import Player.Player;
import Player.Tank;
import Player.Mage;
import Player.Healer;
import Potions.Potion;
import Spells.Spell;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Tank tank;
    Mage mage;
    Healer healer;

    Armour armour;
    Potion healPotion;
    Potion attackPotion;
    Potion defencePotion;
    Weapon weapon;
    Pet pet;
    Spell fireball;

    @Before
    public void before(){
        ArrayList<Potion> potions = new ArrayList<>();
        armour = new Armour("Iron",6);
        weapon = new Weapon("Axe",10);
        healPotion = new Potion("Heal", 25);
        attackPotion = new Potion("Attack", 2);
        defencePotion = new Potion("Defence", 2);
        potions.add(healPotion);
        potions.add(attackPotion);
        potions.add(defencePotion);

        pet = new Pet(50,"Dragon",6,6);
        fireball = new Spell("FireBall",10);

        tank = new Tank("Knight",weapon,armour);
        mage = new Mage("Wizard",fireball,pet);
        healer = new Healer("Cleric",potions);
    }


    @Test
    public void canGetHp(){
        assertEquals(100,this.tank.getHp());
        assertEquals(100,this.mage.getHp());
        assertEquals(100,this.healer.getHp());
    }

    @Test
    public void canGetAttackTank(){
        int result = this.tank.totalAttack();
        assertEquals(11,result);
    }

    @Test
    public void canGetDefenceTank(){
        int result = this.tank.totalDefence();
        assertEquals(7,result);
    }

    @Test
    public void canGetAttackMage(){
        int result = this.mage.totalAttack();
        assertEquals(11,result);
    }

    @Test
    public void canGetDefenceMage(){
        int result = this.mage.totalDefence();
        assertEquals(7,result);
    }

    @Test
    public void canGetPetAttack(){
        int result = this.mage.petAttack();
        assertEquals(6,result);
    }

    @Test
    public void canGetAttackHealer(){
        int result = this.healer.totalAttack();
        assertEquals(1,result);
    }

    @Test
    public void canGetDefenceHealer(){
        int result = this.healer.totalDefence();
        assertEquals(1,result);
    }

    @Test
    public void canHealPlayer(){
        String result = healer.useHealPotion(1, mage);
        assertEquals(120, mage.getHp());
        assertEquals("Wizard Gained 20 HealthPoints", result);
    }

    @Test
    public void canIncreasePlayerAttack(){
        String result = healer.useAttackPotion(4, healer);
        assertEquals(9, healer.totalAttack());
        assertEquals("Cleric Gained 8 Attack Points", result);
    }

    @Test
    public void canIncreasePlayerDefence(){
//        assertEquals(7,tank.getDefence());
        String result = healer.useDefencePotion(2, tank);
        assertEquals(11, tank.totalDefence());
        assertEquals("Knight Gained 4 Defence Points", result);
    }



}
