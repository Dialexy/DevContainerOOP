public class Mage extends GameCharacter {

    public Mage (String name, int health, int maxHealth, int level, int experience) {
        super();
        this.name = name;
        this.health = 250;
        this.maxHealth = 1000;
        this.level = level;
        this.experience = experience;
    }

    public int getDamage() {
        return this.damage;
    }

    @Override
    public void attack(GameCharacter target) {
        target.doDamage(this.damage);
        System.out.printf("%s Stirkes with a spell attack, doing: %d HP to %s%n", name, getDamage(), target.name);
    }

    @Override
    public void defend () {
        System.out.printf("%s Defends from an attack%n", name);
    }

    @Override
    public void useSpecialAbility(GameCharacter target) {
        target.doDamage(this.damage);
        System.out.printf("%s uses their special attack, doing: %dHP to %s%n", name, getDamage(), target.name);
    }

    @Override
    public String getCharacterClass() {
        return "Mage";
    }

    @Override
    public int doDamage(int damage) {
        return health = (health - this.damage);
    }
}
