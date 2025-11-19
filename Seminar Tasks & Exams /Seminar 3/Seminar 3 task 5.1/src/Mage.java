public class Mage extends GameCharacter {

    private final String attackType = "Magic";

    public Mage (String name, int level, int experience, int damage) {
        this.name = name;
        this.health = 250;
        this.maxHealth = 1000;
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
        int attackDamage = (int)(0.8 * this.damage);
        int damageDealt = target.defend(attackDamage, this.attackType);
        target.health -= damageDealt;
        System.out.printf("%s Strikes with a ranged spell attack, doing: %d HP to %s.%n", this.name, damageDealt, target.name);
        experience++;
    }

    @Override
    public int defend(int incomingDamage, String attackType) {
        int damageReduction;

        if (attackType.equals("Magic")) {
            System.out.printf("%s Blocks the magic attack, taking no damage.%n", this.name);
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
            System.out.printf("%s Uses their special attack (Scarlet rot), doing: %d HP to %s.%n", this.name, damageDealt, target.name);
            experience++;
        }
    }

    @Override
    public String getCharacterClass() {
        return "Mage";
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
