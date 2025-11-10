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

    public int getLevel() {
        return level;
    }

    public void LevelingMechanic() {
        if (experience >= level * 50) {
            level++;
            experience = 0;
            maxHealth += 300;
            health = Math.min(health + 100, maxHealth);
            damage += 10;
            System.out.printf("%s has leveled up! %s is now level: %d%n", this.name, this.name, getLevel());
        }
    }

    @Override
    public String getAttackType() {
        return attackType;
    }


    @Override
    public void attack(GameCharacter target) {
        target.health -= (int)(0.8 * this.damage);
        System.out.printf("%s Strikes with a ranged spell attack, doing: %d HP to %s.%n", this.name, this.damage, target.name);

        LevelingMechanic();
    }

    @Override
    public void defend (GameCharacter target) {
        if (target.getAttackType().matches("Magic")) {
           System.out.printf("%s Blocks the attack, taking no damage.%n", this.name);
        }
        else {
            health -= (int)(0.8 * target.damage);
           System.out.printf("%s Defends from an attack.%n", this.name);
        }

        LevelingMechanic();
    }

    @Override
    public void useSpecialAbility(GameCharacter target) {
        if (specialCooldown > 0) {
            specialCooldown--;
            System.out.printf("The special ability for %s is currently on cooldown for %d more turns", this.name, specialCooldown);
        }
        else {
        specialCooldown = 3;
        target.health -= (3 * this.damage);
        System.out.printf("%s Uses their special attack (Scarlet rot), doing: %dHP to %s.%n", this.name, this.damage, target.name);
        }
        LevelingMechanic();
    }

    @Override
    public String getCharacterClass() {
        return "Mage";
    }
}
