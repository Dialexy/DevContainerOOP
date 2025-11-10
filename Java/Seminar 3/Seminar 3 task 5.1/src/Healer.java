public class Healer extends GameCharacter {

    private final String attackType = "Healing";
    private int healing;

    public Healer (String name, int experience, int healing) {
        this.name = name;
        this.health = 500;
        this.maxHealth = 1500;
        this.level = 1;
        this.experience = experience;
        this.healing = healing;
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

    public void buff() {
        if(!isBuffed) {
            isBuffed = true;
            buffTurnsRemaining = 1;
            System.out.printf("%s casts porcupine - reducing damage by 50%%.", this.name);
            experience++;
        }
        else {
            System.out.printf("Buffs can not be stacked.%n%s is currently buffed", this.name);
            experience++;
        }
        LevelingMechanic();
    }

    public void heal() {
        if(isBuffed) {
            health = Math.min(health + (int)(1.4 * this.healing), maxHealth);
            System.out.printf("%s is buffed therefore, heals for %dHP", this.name, this.healing);
            experience++;
        }
        else {
            health = Math.min(health + this.healing, maxHealth);
            System.out.printf("%s heals for %dHP", this.name, this.healing);
            experience++;
        }
        LevelingMechanic();
        if (isBuffed) {
            buffTurnsRemaining--;
        }
        if (buffTurnsRemaining <= 0 && isBuffed) {
            isBuffed = false;
            System.out.printf("The buff on %s has worn out", this.name);
        }
    }

    @Override
    public String getAttackType() {
        return attackType;
    }

    @Override
    public void attack(GameCharacter target) {
        if (isBuffed) {
            target.health -= (int)(1.4 * this.damage);
            System.out.printf("%s is buffed and therefore does %dHp to %s.%n", this.name ,this.damage, target.name);
            experience++;
        }
        else {
            target.health -= (this.damage);
            System.out.printf("%s does %dHp to %s.%n", this.name ,this.damage, target.name);
            experience++;
        }
        LevelingMechanic();
        if (isBuffed) {
            buffTurnsRemaining--;
        }
        if (buffTurnsRemaining <= 0 && isBuffed) {
            isBuffed = false;
            System.out.printf("The buff on %s has worn out", this.name);
        }
    }

    @Override
    public void defend(GameCharacter target) {
        if (isBuffed) {
            health -= (int)(0.5 * 0.2 * target.damage);
            System.out.printf("%s is buffed and therefore took only 50%% damage, %dHP.%n", this.name, health);
            experience++;
        }
        else {
            health -= (int)(0.2 * target.damage);
            System.out.printf("%s defends from an attack.%n", this.name);
            experience++;
        }
        LevelingMechanic();
        if (isBuffed) {
            buffTurnsRemaining--;
        }
        if (buffTurnsRemaining <= 0 && isBuffed) {
            isBuffed = false;
            System.out.printf("The buff on %s has worn out", this.name);
        }
    }

    @Override
    public void useSpecialAbility(GameCharacter target) {
        if (specialCooldown > 0) {
            specialCooldown--;
            System.out.printf("The special ability for %s is currently on cooldown for %d more turns", this.name, specialCooldown);
        }
        else {
        specialCooldown = 3;
        health += (int)(3 * this.healing);
        System.out.printf("%s uses their special ability (Divine justice), healing themselves for %dHp", this.name, this.healing);
        experience++;

        target.health -= (int)(3 * this.damage);
        System.out.printf("and also does: %dHP to %s.%n", this.damage, target.name);
        experience++;

        LevelingMechanic();
        }
    }

    @Override
    public String getCharacterClass() {
        return "Healer";
    }
}
