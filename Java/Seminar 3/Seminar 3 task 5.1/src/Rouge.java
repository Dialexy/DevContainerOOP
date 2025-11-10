import java.util.Random;

public class Rouge extends GameCharacter {

    private final String attackType = "Melee";

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

    public boolean critChance() {
        int critProbability = crit.nextInt(100) + 1;
        return critProbability < 25;
    }

    public boolean dodgeChance() {
        int dodgeProbability = dodge.nextInt(100) + 1;
        return dodgeProbability < 25;
    }

    @Override
    public String getAttackType() {
        return attackType;
    }

    @Override
    public void attack(GameCharacter target) {
        if (critChance()) {
            target.health -= (2 * this.damage);
            System.out.printf("%s Critically strikes %s for %dHP.%n", this.name, target.name, this.damage);
        }
        else {
        target.health -= this.damage;
        System.out.printf("%s Strikes %s for %dHP.%n", this.name, target.name, this.damage);
        }
        LevelingMechanic();
    }

    @Override
    public void defend (GameCharacter target) {
        if (dodgeChance()) {
            System.out.printf("%s Dodges the attack, taking no damage.%n", this.name);
        }
        else {
            health -= (int)(0.2 * target.damage);
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
        System.out.printf("%s Uses their special ability (Shadows whisper), doing: %dHP to %s.%n", this.name, this.damage, target.name);
        }
        LevelingMechanic();
    }

    @Override
    public String getCharacterClass() {
        return "Rogue";
    }
   }
