public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int level;
    protected int experience;
    protected int damage;
    protected boolean isBuffed = false;
    protected int buffTurnsRemaining = 0;
    protected int specialCooldown = 0;

    public final void performCombatTurn(GameCharacter opponent) {
        chooseAction(opponent);
        if (specialCooldown > 0) {
            specialCooldown--;
        }
        levelingMechanic();
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void levelingMechanic() {
        if (experience >= level * 50) {
            level++;
            experience = 0;
            maxHealth += 300;
            health = Math.min(health + 100, maxHealth);
            damage += 10;
            System.out.printf("%s has leveled up! %s is now level: %d%n", this.name, this.name, getLevel());
        }
    }

    public abstract String getAttackType();
    public abstract void attack(GameCharacter target);
    public abstract int defend(int incomingDamage, String attackType);
    public abstract void useSpecialAbility(GameCharacter target);
    public abstract String getCharacterClass();
    public abstract void chooseAction(GameCharacter opponent);
}
