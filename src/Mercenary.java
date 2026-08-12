
public class Warrior extends Character {

    private int rage;
    private String weapon;
    private int lifeWeapon;
    private int startAttack;

    public Warrior(String name, double maxHealth, int attack, int defense, int rage, String weapon){
        super(name, maxHealth, attack, defense);

        this.rage = rage;
        this.weapon = weapon;
        this.lifeWeapon = 100;
        this.startAttack = getAttack();
    }

    public int getStartAttack() {
        return startAttack;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    public boolean heavyAttack(){
        if (rage >= 100){
            rage -= 100;
            return true;
        }
        return false;
    }


    @Override
    public void showStatus(){
    super.showStatus();

        System.out.println("Rage: " +rage);
        System.out.println("Weapon " + weapon);
    }


    public boolean fury(){
        if (rage >=100) {
            return false;

        }else {
            double healthWarrior = getHealth();
            if (healthWarrior <= 25) {
                return false;

            } else {
                rage =100;
                healthWarrior = healthWarrior - 25;
                setHealth(healthWarrior);
                lifeWeapon -=10;
                return true;
                }

    }
}

    public void setLifeWeapon(int lifeWeapon) {
        this.lifeWeapon = lifeWeapon;
    }

    public  boolean brokenWeapon (){
        if (lifeWeapon >=1){
            return false;
        }
        else {
            if (lifeWeapon ==0){
                setAttack(1);
            }
            return true;

        }
    }


}

