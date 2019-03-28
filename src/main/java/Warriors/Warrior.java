package Warriors;

public abstract class Warrior {
    private String name;
    private int attackDamage;
    private int health;

    public Warrior(String name, int attackDamage, int health) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
