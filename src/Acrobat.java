public class Acrobat extends Character {

    private String weapon;
    private int arrows;
    private int maxArrows;
    private int lifeBow;
    private int specialArrowUse;

    public Acrobat(String name, double maxHealth, int attack, int defense){
        super(name,maxHealth,attack,defense);
    this.weapon = "Long Bow";
    this.arrows = 10;
    this.maxArrows = arrows;
    this.lifeBow = 100;
    this.specialArrowUse = 0;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getSpecialArrowUse() {
        return specialArrowUse;
    }

    public int getLifeBow() {
        return lifeBow;
    }

    public int getMaxArrows() {
        return maxArrows;
    }

    public int getArrows() {
        return arrows;
    }


    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setLifeBow(int lifeBow) {
        if (lifeBow <=-1){
            lifeBow =1;
        }
        if (lifeBow >=101){
            lifeBow =1;
        }
        this.lifeBow = lifeBow;
    }

    public void setSpecialArrowUse(int specialArrowUse) {
        this.specialArrowUse = specialArrowUse;
    }

    public void setMaxArrows(int maxArrows) {
        if (maxArrows >=11){
            maxArrows = arrows;
        }
        if (maxArrows <=-1){
            maxArrows = arrows;
        }
        this.maxArrows = maxArrows;
    }

    public void setArrows(int arrows) {
        if (arrows <=-1){
            arrows =10;
        }
        if (arrows >=11){
            arrows =10;
        }
        this.arrows = arrows;
    }

    public boolean brokenBow(){
        if (lifeBow <=10){
            return true;
        }
        return false;
    }

    public boolean haveArrow(){
        if (arrows >=1){
            return true;
        }
        return false;
    }

    public boolean haveArrows2(){
        if (arrows >=2){
            return true;
        }
        return false;
    }

    public boolean reloadAljava(){
        if (arrows >=1){
            return false;
        }
        arrows =10;
        return true;
    }

    @Override
    public boolean revive(){
      if (!super.revive()){
          return false;
      }
      setLifeBow(100);
      setArrows(10);
      setSpecialArrowUse(0);
      return true;
    }
}


