public class Healer extends GameCharacter {

    private int healing;

    public Healer (String name, int health, int maxHealth, int level, int experience) {
        this.name = name;
        this.health = 500;
        this.maxHealth = 1500;
        this.level = level;
        this.experience = experience;
    }

    public int getHealing() {
        return this.healing;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.printf("%s heals ally %s for %dHP", name, target.name, getHealing());
    }
}
