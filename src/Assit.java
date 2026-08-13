public class Assit extends Character  {

    private String weapon;
    private int mp;
    private int maxMP;
    private int baseAttack;
    private int buffCount;


    public Assit (String name, double maxHealth, int attack, int defense, String weapon, int maxMP){
        super(name,maxHealth,attack,defense);

        this.weapon = weapon;

        if (maxMP <= -1){
            maxMP =100;
        }
        if (maxMP >= 501){
            maxMP = 100;
        }

        this.mp = maxMP;
        this.maxMP = maxMP;

       this.buffCount = 0;
       this.baseAttack = getAttack();


       }

       public boolean heal(){
           if (!isAlive()){
               return false;
           }
           if (mp <=19) {
               return false;
           }
           mp -=20;
           return true;
       }

       public boolean heapUp(){
        if (buffCount >=3){
            return false;
        }
        if (!isAlive()){
            return false;
        }
        if (mp <=29){
            return false;
        }
        mp -=30;
        buffCount ++;
        return true;
       }

       public boolean mentalSign(){
        if (buffCount >=3){
            return false;
        }
        if (!isAlive()){
            return false;
        }
        if (mp <=39){
            return false;
        }

        mp -=40;
        buffCount ++;
        return true;
       }

}
