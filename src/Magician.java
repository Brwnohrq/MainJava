public class Magician extends Character{

    private int magicianPoint;
    private String weapon;
    private int spellUse;
    private int baseAttack;
    private int fireUses;

    public Magician(String name, double maxHealth, int attack, int defense, int magicianPoint, String weapon){
        super(name, maxHealth, attack, defense);

        this.magicianPoint = magicianPoint;
        this.weapon = weapon;
        this.spellUse = 0;
        this.baseAttack = getAttack();
        this.fireUses = 0;
    }

    public int getFireUses() {
        return fireUses;
    }

    public int getSpellUse() {
        return spellUse;
    }

    public int getMagicianPoint() {
        return magicianPoint;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setMagicianPoint(int magicianPoint) {
        this.magicianPoint = magicianPoint;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void showStatus(){
        super.showStatus();
        System.out.println("Magician Points: " +magicianPoint);
        System.out.println("Weapon:" + weapon);
    }

    public boolean castSpell(){
        if (spellUse >=2){
            return false;
        }

       else if (magicianPoint <25){
            return false;



        } else {
        magicianPoint -=25;
       int mageAttack = getAttack();
       mageAttack +=100;
       setAttack(mageAttack);
       spellUse ++;
        } return true;

    }

    public boolean resetSpell(){
        if (isAlive()){
            return false;
        }

        else {
            this.spellUse = 0;
            setAttack(baseAttack);
        } return true;
    }

    public boolean fireBall(){
        if (fireUses >=3){
            return false;
        }
        if (!isAlive()){
            return false;
        }
        if (magicianPoint <15){
            return false;
        }

        magicianPoint -=15;
        int mageAttack = getAttack();
        mageAttack += 50;
        setAttack(mageAttack);
        fireUses ++;
        return true;
    }


}

