public abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int level;
    protected int experience;
    protected int damage;
    protected boolean isBuffed = false;
    protected int buffTurnsRemaining = 0;
    protected int specialCooldown = 3;

    public final void performCombatTurn(GameCharacter opponent) {
    }

    public abstract String getAttackType();
    public abstract void attack(GameCharacter target);
    public abstract void defend(GameCharacter target);
    public abstract void useSpecialAbility(GameCharacter target);
    public abstract String getCharacterClass();
}
