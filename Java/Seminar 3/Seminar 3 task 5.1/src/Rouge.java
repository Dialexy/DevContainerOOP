import java.util.Random;

public class Rouge extends GameCharacter {

    Random crit = new Random();
    Random dodge = new Random();

    public Rouge (String name, int level, int experience, int damage) {
        this.name = name;
        this.health = 500;
        this.maxHealth = 1500;
        this.level = level;
        this.experience = experience;
        this.damage = damage;
    }

    public boolean critChance() {
        int critProbability = crit.nextInt(100) + 1;
        return critProbability < 25;
    }

    public boolean dodgeChance() {
        int dodgeProbability = dodge.nextInt(100) + 1;
        return dodgeProbability < 25;
    }

    @Override
    public void attack(GameCharacter target) {
        if (critChance()) {
            target.health -= (2 * this.damage);
            System.out.printf("%s Critically strikes %s for %dHP.%n", name, target.name, this.damage);
        }
        else {
        target.health -= this.damage;
        System.out.printf("%s Strikes %s for %dHP.%n", name, target.name, this.damage);
        }
    }

    @Override
    public void defend(GameCharacter target) {
        if (dodgeChance()) {
            System.out.printf("%s Dodges the attack, taking no damage.%n", name);
        }
        else {
        health -= (int)(0.2 * target.damage);
        System.out.printf("%s Defends from an attack.%n", name);
        }
    }

    @Override
    public void useSpecialAbility(GameCharacter target) {
        target.health -= (3 * this.damage);
        System.out.printf("%s Uses their special ability, doing: %dHP to %s.%n", name, this.damage, target.name);
    }

    @Override
    public String getCharacterClass() {
        return "Rogue";
    }
   }
