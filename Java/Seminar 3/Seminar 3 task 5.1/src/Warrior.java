public class Warrior extends GameCharacter {

    public Warrior (String name, int level, int experience, int damage) {
        super();
        this.name = name;
        this.health = 1000;
        this.maxHealth = 3000;
        this.level = level;
        this.experience = experience;
        this.damage = damage;
    }

     @Override
     public void attack(GameCharacter target) {
        target.health -= (int)(1.2 * this.damage);
        System.out.printf("%s Strikes %s for %dHP.%n", name, target.name, this.damage);
    }

    @Override
    public void defend(GameCharacter target) {
        health -= (0.1 * target.damage);
        System.out.printf("%s Defends the attack with a shield, therefore taking less damage.%n", name);
    }

    @Override
    public void useSpecialAbility(GameCharacter target) {
        target.health -= (3 * this.damage);
        System.out.printf("%s Uses their special ability, doing: %dHP to %s%n", name, this.damage, target.name);
    }

    @Override
    public String getCharacterClass() {
        return "Warrior";
    }
}
