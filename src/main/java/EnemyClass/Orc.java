package EnemyClass;

import Warriors.Warrior;
import Weapons.Club;

public class Orc extends Enemy {

    private Club club;

    public Orc(String name, int health, int damage, Club club) {
        super(name, health, damage);
        this.club = club;
    }

    public int attack( Warrior warrior){
        return warrior.getHealth() - getDamage();

    }
}
