package Rooms;

import EnemyClass.Enemy;
import EnemyClass.Orc;
import Warriors.Barbarian;
import Warriors.Warrior;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Warrior> warriors;
    private ArrayList<Enemy> enemies;

    public Room(ArrayList<Warrior> warriors, ArrayList<Enemy> enemies) {
        this.warriors = warriors;
        this.enemies = enemies;
    }

    public int countWarriors(){
        return this.warriors.size();
    }

    public int countEnemies(){
        return this.enemies.size();
    }

    public void addWarrior(Warrior warrior){
        this.warriors.add(warrior);
    }

    public void addEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }
}


