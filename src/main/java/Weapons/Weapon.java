package Weapons;

public abstract class Weapon {

    private int attackDamage;
    private int defence;

    public Weapon(int attackDamage, int defence){
        this.attackDamage = attackDamage;
        this.defence = defence;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}


