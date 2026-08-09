public class Character {

    private String name;
    private int level;
    private double health;
    private double maxHealth;
    private int attack;
    private int defense;
    private boolean alive;
    private int revive;

    public Character(String name, double maxHealth, int attack, int defense) {

        this.name = name;

        if (maxHealth <= 0 || maxHealth > 500) {
            maxHealth = 50;
        }

        if (attack <= 0 || attack > 500) {
            attack = 50;
        }

        if (defense <= 0 || defense > 500) {
            defense = 50;
        }

        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attack = attack;
        this.defense = defense;

        this.level = 1;
        this.alive = true;
        this.revive = 2;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getRevive() {
        return revive;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAttack(int attack) {

        if (attack <= 0 || attack > 500) {
            attack = 50;
        }

        this.attack = attack;
    }

    public void setDefense(int defense) {

        if (defense <= 0 || defense > 500) {
            defense = 50;
        }

        this.defense = defense;
    }

    public void setHealth(double health) {

        if (health <= 0) {
            this.health = 0;
            this.alive = false;
            return;
        }

        if (health > maxHealth) {
            this.health = maxHealth;
            return;
        }

        this.health = health;
    }


    public void showStatus() {

        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Attack: " + attack);
        System.out.println("Defense: " + defense);
        System.out.println("Alive: " + alive);
        System.out.println("Revives: " + revive);
        System.out.println();
    }


    public boolean heal() {

        if (!alive) {
            return false;
        }

        if (health == maxHealth) {
            return false;
        }

        health = maxHealth;

        System.out.println("You have been healed, your life is now complete.");

        return true;
    }


    public boolean revive() {

        if (revive <= 0) {
            return false;
        }

        if (alive) {
            return false;
        }

        revive--;
        alive = true;
        health = maxHealth;

        return true;
    }
}