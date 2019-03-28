package Warriors;

import EnemyClass.Enemy;
import Weapons.Claymore;

public class Barbarian extends Warrior implements IStrike {
private Claymore claymore;
    public Barbarian(String name, int attackDamage, int health, Claymore claymore) {
        super(name, attackDamage, health);
        this.claymore = claymore;
    }

    public int attack(int damage, Enemy enemy){
        return enemy.getHealth() - getAttackDamage();
    }

}
