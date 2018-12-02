package Game;

import Interfaces.IObject;
import Monsters.Monster;
import Player.Player;
import Rooms.MonsterRoom;
import Rooms.Room;
import Rooms.TreasureRoom;

import java.util.Random;



import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Game {

    private ArrayList<Monster> monsters;
    private ArrayList<IObject> objects;

    public Game(ArrayList<Monster> monsters,ArrayList<IObject> objects){
        this.monsters = monsters;
        this.objects = objects;
    }

    public String playerAttacksMonster(Monster monster,Player player){
        int damage = ((player.getAttack()*3 - monster.getDefence()*2)/2);
        if( damage <= 0 ){
            damage = 1;
        }
        monster.setHp(monster.getHp()-damage);
        return "You Dealt " + damage + " Damage!";
    }

    public String monsterAttacksPlayer(Monster monster, Player player){
        int damage = ((monster.getAttack()*3 - player.getDefence()*2)/2);
        if(damage <= 0){
            damage = 1;
        }
        player.setHp(player.getHp() - damage);
        return "Monster Dealt " + damage + " Damage!";
    }

    public Room generateRandomRoom(){
        Random rand = new Random();
        int roomType= rand.nextInt(2);
        int monsterIndex = rand.nextInt(5);
        int objectIndex = rand.nextInt(5);
        int treasureAmount = rand.nextInt(100)+10;
        if(roomType == 0){
            Room room = new MonsterRoom(this.objects.get(objectIndex),this.monsters.get(monsterIndex));
            return room;
        }
        else{
            Room room = new TreasureRoom(this.objects.get(objectIndex),treasureAmount);
            return room;
        }
    }


}
