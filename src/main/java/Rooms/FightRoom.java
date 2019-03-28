package Rooms;

import EnemyClass.Enemy;
import EnemyClass.Orc;
import Warriors.Barbarian;
import Warriors.Warrior;

import java.util.ArrayList;

public class FightRoom extends Room {


    public ArrayList countWarriors;

    public FightRoom(ArrayList<Warrior> warriors, ArrayList<Enemy> enemies) {
        super(warriors, enemies);
    }
}
