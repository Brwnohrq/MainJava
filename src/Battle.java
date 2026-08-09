public class Battle {

    public boolean attack(Character attacker, Character target) {
        if (!attacker.isAlive()){
        return false;
    }
        if (!target.isAlive()){
            return false;
        }
        int attack = attacker.getAttack();
        int defense = target.getDefense();

        double damage = attack - defense;

        if (damage <= 0){
            damage = 0;
        }
        double targetHealth = target.getHealth();
        targetHealth = targetHealth - damage;
        target.setHealth(targetHealth);

        return true;
}



    public boolean heavyAttack(Warrior attacker, Character target) {
        if (!attacker.isAlive()) {
            return false;
        }
        if (!target.isAlive()) {
            return false;
        }
        if (!attacker.heavyAttack()) {
            return false;
        }
            int attack = attacker.getAttack();
            int defense = target.getDefense();
            double damage = (attack *2) - defense;

            if (damage <= 0) {
                damage = 0;
            }
            double targetHealth = target.getHealth();
            targetHealth = targetHealth - damage;
            target.setHealth(targetHealth);
            return true;
        }

        public boolean castSpeel (Magician attacker, Character target){
        if (!attacker.isAlive()){
            return false;
        }
        if (!target.isAlive()){
            return false;
        }
        if (!attacker.castSpell()){
            return false;
        }

        int attack = attacker.getAttack();
        int defense = target.getDefense();

        double damage = (attack - defense);

        if (damage <=0){
            damage =0;
        }
        double targetHealth = target.getHealth();
        targetHealth = targetHealth - damage;
        target.setHealth(targetHealth);
        return true;
        }

    }

