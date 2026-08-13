public class Mercenary extends Character{


    private String weapon;
    private String weaponType;
    private int fp;
    private int maxFP;
    private int adoch;
    private int baseAttack;
    private int masteryCount;

    public Mercenary(
            String name,
            double maxHealth,
            int attack,
            int defense,
            int maxFP,
            int adoch,
            String weapon,
            String weaponType) {

        super(name, maxHealth, attack, defense);

        this.weapon = weapon;
        this.weaponType = weaponType;

        if (maxFP < 1 || maxFP > 300) {
            this.maxFP = 100;
        } else {
            this.maxFP = maxFP;
        }

        this.fp = this.maxFP;

        if (adoch < 1 || adoch > 300) {
            this.adoch = 1;
        } else {
            this.adoch = adoch;
        }

        this.baseAttack = getAttack();
        this.masteryCount = 0;
    }

    public boolean slash() {
        if (!isAlive()) {
            return false;
        }
        if (fp <=19){
            return false;
        }
        fp -=20;
        return true;
    }

    public boolean bloodyStrike(){
        if (!isAlive()){
            return false;
        }
        if (fp <= 39) {
            return false;
        }
        fp -=40;
        return true;
    }

    public boolean weaponMastery(){
        if (masteryCount >=3){
            return false;
        }
        if (!isAlive()){
            return false;
        }
        if (fp <=19){
            return false;
        }
        if (getAttack() >=400){
            return false;
        }


        int attack = getAttack();

        attack +=100;
        setAttack(attack);
        masteryCount ++;
        fp -=20;
        return true;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getMasteryCount() {
        return masteryCount;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getFp() {
        return fp;
    }

    public int getAdoch() {
        return adoch;
    }

    public int getMaxFP() {
        return maxFP;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void setAdoch(int adoch) {
        if (adoch <=-1 || adoch >=301){
            return;
        }
        this.adoch = adoch;
    }

    public void setMaxFP(int maxFP) {
        if (maxFP <= -1 || maxFP >=300){
            return;
        }
        this.maxFP = maxFP;
    }

    public void setFp(int fp) {
        if (fp <=-1 || fp > maxFP) {
            return;
        }
        this.fp = fp;
    }


}


