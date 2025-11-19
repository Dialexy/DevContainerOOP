public class Warrior extends GameCharacter {

    private final String attackType = "Melee";

    public Warrior (String name, int level, int experience, int damage) {
        this.name = name;
        this.health = 1000;
        this.maxHealth = 3000;
        this.level = level;
        this.experience = experience;
        this.damage = damage;
    }

    @Override
    public String getAttackType() {
        return attackType;
    }

    @Override
    public void attack(GameCharacter target) {
        int attackDamage = (int)(1.2 * this.damage);
        int damageDealt = target.defend(attackDamage, this.attackType);
        target.health -= damageDealt;
        System.out.printf("%s Strikes %s for %d HP.%n", this.name, target.name, damageDealt);
        experience++;
    }

    @Override
    public int defend(int incomingDamage, String attackType) {
        int damageReduction;

        if (attackType.equals("Melee")) {
            System.out.printf("%s Blocks the melee attack, taking no damage.%n", this.name);
            damageReduction = 0;
        }
        else {
            damageReduction = (int)(0.8 * incomingDamage);
            System.out.printf("%s Defends from a %s attack, reducing damage to %d HP.%n", this.name, attackType, damageReduction);
        }

        experience++;
        return damageReduction;
    }

    @Override
    public void useSpecialAbility(GameCharacter target) {
        if (specialCooldown > 0) {
            System.out.printf("The special ability for %s is currently on cooldown for %d more turns.%n", this.name, specialCooldown);
            attack(target);
        }
        else {
            int attackDamage = 3 * this.damage;
            int damageDealt = target.defend(attackDamage, this.attackType);
            target.health -= damageDealt;
            specialCooldown = 3;
            System.out.printf("%s Uses their special ability (Undying rage), doing: %d HP to %s.%n", this.name, damageDealt, target.name);
            experience++;
        }
    }

    @Override
    public String getCharacterClass() {
        return "Warrior";
    }

    @Override
    public void chooseAction(GameCharacter opponent) {
        if (specialCooldown == 0) {
            useSpecialAbility(opponent);
        }
        else {
            attack(opponent);
        }
    }
}
