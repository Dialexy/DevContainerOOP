
public class Battle {

    GameCharacter c1;
    GameCharacter c2;
    private int turnCounter;
    // private ArrayList<String> battleLog;
    GameCharacter winner;

    public Battle (GameCharacter c1, GameCharacter c2) {
        this.c1 = c1;
        this.c2 = c2;
        this.turnCounter = 1;
        // this.battleLog = new ArrayList<>();
        this.winner = null;
    }

    public void startBattle() {
        System.out.printf("=== BATTLE START ===%n%s (%s) vs %s (%s)%n%n",
            c1.name, c1.getCharacterClass(), c2.name, c2.getCharacterClass());

        while (c1.isAlive() && c2.isAlive()) {
            System.out.printf("--- Turn %d ---%n", turnCounter);
            System.out.printf("%s HP: %d | %s HP: %d%n%n", c1.name, c1.getHealth(), c2.name, c2.getHealth());

            System.out.printf("[%s's Turn]%n", c1.name);
            c1.performCombatTurn(c2);
            System.out.println();

            if (!c2.isAlive()) {
                winner = c1;
                break;
            }

            System.out.printf("[%s's Turn]%n", c2.name);
            c2.performCombatTurn(c1);
            System.out.println();

            if (!c1.isAlive()) {
                winner = c2;
                break;
            }

            turnCounter++;
            System.out.println("=".repeat(50) + "\n");
        }

        System.out.printf("=== BATTLE END ===%n%s wins the battle!%n", winner.name);
        System.out.printf("Final Stats - %s: %d HP (Level %d) | %s: %d HP (Level %d)%n",
            c1.name, Math.max(0, c1.getHealth()), c1.getLevel(),
            c2.name, Math.max(0, c2.getHealth()), c2.getLevel());
    }
}
