import java.util.ArrayList;

public class TestGameSystem {

    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;

        try {
            // Test 1: Singleton instance consistency
            GameStatisticsManager g1 = GameStatisticsManager.getInstance();
            GameStatisticsManager g2 = GameStatisticsManager.getInstance();
            if (g1 == g2) {
                System.out.println("PASS: Singleton instance is consistent across calls.");
                passed++;
            } else {
                System.out.println("FAIL: Singleton instance is not consistent.");
                failed++;
            }

            // Test 2: Adding and retrieving achievements directly through Singleton
            g1.addAchievement("Alice", "First Blood");
            ArrayList<String> result = g2.getAchievements("Alice");
            if (result != null && result.contains("First Blood")) {
                System.out.println("PASS: Achievements correctly stored and retrieved.");
                passed++;
            } else {
                System.out.println("FAIL: Achievements not retrieved correctly.");
                failed++;
            }

            // Test 3: Player earning achievements
            Player p1 = new Player("Bob", 100);
            p1.earnAchievement("Sharp Shooter");
            ArrayList<String> playerAchievements = g1.getAchievements("Bob");
            if (playerAchievements != null && playerAchievements.contains("Sharp Shooter")) {
                System.out.println("PASS: Player successfully earns and stores achievements.");
                passed++;
            } else {
                System.out.println("FAIL: Player achievement not stored correctly.");
                failed++;
            }

            // Test 4: Game aggregation of players
            ArrayList<Player> players = new ArrayList<>();
            players.add(new Player("Alice", 150));
            players.add(new Player("Bob", 200));
            Game game = new Game("Arena", players);

            if (game.getGameTitle().equals("Arena") && game.getPlayers().size() == 2) {
                System.out.println("PASS: Game correctly aggregates Player objects.");
                passed++;
            } else {
                System.out.println("FAIL: Game does not properly aggregate Player objects.");
                failed++;
            }

            // Test 5: Simulate game adds achievements correctly
            int preUpdateCountAlice = g1.getAchievements("Alice") != null ? g1.getAchievements("Alice").size() : 0;
            int preUpdateCountBob = g1.getAchievements("Bob") != null ? g1.getAchievements("Bob").size() : 0;
            game.simulateGame();
            int postUpdateCountAlice = g1.getAchievements("Alice") != null ? g1.getAchievements("Alice").size() : 0;
            int postUpdateCountBob = g1.getAchievements("Bob") != null ? g1.getAchievements("Bob").size() : 0;

            if (postUpdateCountAlice > preUpdateCountAlice || postUpdateCountBob > preUpdateCountBob) {
                System.out.println("PASS: Game simulation updates achievements correctly.");
                passed++;
            } else {
                System.out.println("FAIL: Game simulation did not update achievements.");
                failed++;
            }

        } catch (Exception e) {
            System.out.println("FAIL: Exception during testing: " + e.getMessage());
            failed++;
        }

        System.out.println("---------");
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("---------");
    }
}
