public class Healer extends GameCharacter {

    private final String attackType = "Healing";
    private final int healing;

    public Healer (String name, int level, int experience, int damage, int healing) {
        this.name = name;
        this.health = 500;
        this.maxHealth = 1500;
        this.level = level;
        this.experience = experience;
        this.damage = damage;
        this.healing = healing;
    }

    public void buff() {
        if(!isBuffed) {
            isBuffed = true;
            buffTurnsRemaining = 1;
            System.out.printf("%s casts porcupine - reducing damage by 50%%.%n", this.name);
            experience++;
        }
        else {
            System.out.printf("Buffs can not be stacked.%n%s is currently buffed.%n", this.name);
            experience++;
        }
    }

    public void heal() {
        int actualHealing;

        if(isBuffed) {
            actualHealing = (int)(1.4 * this.healing);
            health = Math.min(health + actualHealing, maxHealth);
            System.out.printf("%s is buffed therefore, heals for %d HP.%n", this.name, actualHealing);
            experience++;
        }
        else {
            actualHealing = this.healing;
            health = Math.min(health + actualHealing, maxHealth);
            System.out.printf("%s heals for %d HP.%n", this.name, actualHealing);
            experience++;
        }

        if (isBuffed) {
            buffTurnsRemaining--;
            if (buffTurnsRemaining <= 0) {
                isBuffed = false;
                System.out.printf("The buff on %s has worn out.%n", this.name);
            }
        }
    }

    @Override
    public String getAttackType() {
        return attackType;
    }

    @Override
    public void attack(GameCharacter target) {
        int attackDamage;

        if (isBuffed) {
            attackDamage = (int)(1.4 * this.damage);
        }
        else {
            attackDamage = this.damage;
        }

        int damageDealt = target.defend(attackDamage, this.attackType);
        target.health -= damageDealt;

        if (isBuffed) {
            System.out.printf("%s is buffed and therefore does %d HP to %s.%n", this.name, damageDealt, target.name);
        }
        else {
            System.out.printf("%s does %d HP to %s.%n", this.name, damageDealt, target.name);
        }

        experience++;

        if (isBuffed) {
            buffTurnsRemaining--;
            if (buffTurnsRemaining <= 0) {
                isBuffed = false;
                System.out.printf("The buff on %s has worn out.%n", this.name);
            }
        }
    }

    @Override
    public int defend(int incomingDamage, String attackType) {
        int damageReduction;

        if (isBuffed) {
            damageReduction = (int)(0.5 * 0.2 * incomingDamage);
            System.out.printf("%s is buffed and therefore took only 50%% damage, %d HP.%n", this.name, damageReduction);
        }
        else {
            damageReduction = (int)(0.8 * incomingDamage);
            System.out.printf("%s defends from a %s attack, reducing damage to %d HP.%n", this.name, attackType, damageReduction);
        }

        experience++;

        if (isBuffed) {
            buffTurnsRemaining--;
            if (buffTurnsRemaining <= 0) {
                isBuffed = false;
                System.out.printf("The buff on %s has worn out.%n", this.name);
            }
        }

        return damageReduction;
    }

    @Override
    public void useSpecialAbility(GameCharacter target) {
        if (specialCooldown > 0) {
            System.out.printf("The special ability for %s is currently on cooldown for %d more turns.%n", this.name, specialCooldown);
            attack(target);
        }
        else {
            int actualHealing = 3 * this.healing;
            int attackDamage = 3 * this.damage;

            health = Math.min(health + actualHealing, maxHealth);
            System.out.printf("%s uses their special ability (Divine justice), healing themselves for %d HP ", this.name, actualHealing);
            experience++;

            int damageDealt = target.defend(attackDamage, this.attackType);
            target.health -= damageDealt;
            System.out.printf("and also does: %d HP to %s.%n", damageDealt, target.name);
            experience++;

            specialCooldown = 3;
        }
    }

    @Override
    public String getCharacterClass() {
        return "Healer";
    }

    @Override
    public void chooseAction(GameCharacter opponent) {
        if (specialCooldown == 0) {
            useSpecialAbility(opponent);
        }
        else {
            buff();
            attack(opponent);
        }
    }
}
