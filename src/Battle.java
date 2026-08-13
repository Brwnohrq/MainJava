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

        public boolean fireBall(Magician attacker, Character target){
        if (!attacker.isAlive()){
            return false;
        }
        if (!target.isAlive()){
            return false;
        }
        if (!attacker.fireBall()) {
            return false;
        }

        int attack = attacker.getAttack();
        int defense = target.getDefense();

        double damage = (attack - defense);

        if (damage <=0){
            damage =0;
        }
        double healthTarget = target.getHealth();
        healthTarget = healthTarget - damage;
        target.setHealth(healthTarget);
        return true;

        }

        public boolean hitAttack(Mercenary attacker, Character target){
        if (!attacker.isAlive()){
            return false;
        }
        if (!target.isAlive()){
            return false;
        }

        int attack = attacker.getAttack();
        int denfese = target.getDefense();
        double damage = attack - denfese;

        if (damage <=0){
            damage = 0;
        }

        double healthTarget = target.getHealth();
        healthTarget = healthTarget - damage;
        target.setHealth(healthTarget);
        return true;
        }

        public boolean shoot(Acrobat attacker, Character target){
        if (!attacker.isAlive()){
            return false;
        }
        if (!target.isAlive()){
            return false;
        }
        if (!attacker.brokenBow()){
            return false;
        }
        if (!attacker.haveArrow()){
            return false;
        }

        int bowLife = attacker.getLifeBow();
        bowLife -=10;
        attacker.setLifeBow(bowLife);

        int arrowUse = attacker.getArrows();
        arrowUse = attacker.getArrows() -1;
        attacker.setArrows(arrowUse);

        int attackBow = attacker.getAttack();
        int defenseC = target.getDefense();
        double damage = (attackBow - defenseC);

        if (damage <=0){
            damage =0;
        }

        double healthTarget = target.getHealth();
        healthTarget = healthTarget - damage;
        target.setHealth(healthTarget);

        return true;

        }

        public boolean powerShoot(Acrobat attacker, Character target){
        if (!attacker.isAlive()){
            return false;
        }
        if (!target.isAlive()){
            return false;
        }
        if (!attacker.brokenBow()){
            return false;
        }
        if (!attacker.haveArrows2()){
            return false;
        }


        int arrowSpecialUse = attacker.getSpecialArrowUse();
        arrowSpecialUse ++;
        attacker.setSpecialArrowUse(arrowSpecialUse);

        int lifeBow = attacker.getLifeBow();
        lifeBow -=20;
        attacker.setLifeBow(lifeBow);

        int arrowUse = attacker.getArrows();
        arrowUse -=2;
        attacker.setArrows(arrowUse);


        int attackArcher = attacker.getAttack();
        attackArcher = (attackArcher + attackArcher);
        attacker.setAttack(attackArcher);

        int defenseTarget = target.getDefense();
        defenseTarget = (attackArcher - defenseTarget);

        if (defenseTarget > attackArcher){
            attackArcher =0;
        }

        double damage = (attackArcher - defenseTarget) - target.getHealth();
             target.setHealth(damage);
                return true;
        }


        public boolean heal (Assit healer, Character target) {
            if (!healer.isAlive()) {
                return false;
            }
            if (!target.isAlive()) {
                return false;
            }

            double hpTarget = target.getHealth();
            if (hpTarget == target.getMaxHealth()) {
                return false;
            }

            if (!healer.heal()) {
                return false;
            }


            hpTarget = target.getMaxHealth();
            target.setHealth(hpTarget);
            return true;
        }




    }

