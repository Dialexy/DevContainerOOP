public class TestTeam {

    private static int passed = 0;
    private static int failed = 0;

    private static void check(String testName, boolean condition) {
        if (condition) {
            System.out.println(testName + ": PASS");
            passed++;
        } else {
            System.out.println(testName + ": FAIL");
            failed++;
        }
    }

    public static void main(String[] args) {

        // --- Create players (exist independently of teams) ---
        Player p1 = new Player("Alice", 10, "Striker", 12, 5);
        Player p2 = new Player("Bob", 8, "Midfielder", 8, 10);

        check("Players exist before teams", p1 != null && p2 != null);

        // --- Create teams ---
        java.util.ArrayList<Player> teamAList = new java.util.ArrayList<>();
        java.util.ArrayList<Player> teamBList = new java.util.ArrayList<>();

        Team teamA = new Team("Falcons", "Coach A", "Falcon Arena", teamAList);
        Team teamB = new Team("Tigers", "Coach B", "Tiger Stadium", teamBList);

        check("Teams created successfully", teamA != null && teamB != null);

        // --- Add players to Team A ---
        teamA.addPlayer(p1);
        check("Player added to Team A", teamAList.contains(p1));

        // --- Add player to both teams (aggregation: shared player allowed) ---
        teamA.addPlayer(p2);
        teamB.addPlayer(p2);

        check("Player shared across teams (Team A)", teamAList.contains(p2));
        check("Player shared across teams (Team B)", teamBList.contains(p2));

        // --- Remove player from Team A but player still exists ---
        teamA.removePlayer(p2);

        boolean stillExists = (p2 != null);
        boolean notInTeamA = !teamAList.contains(p2);
        boolean stillInTeamB = teamBList.contains(p2);

        check("Player removed from Team A only", notInTeamA && stillInTeamB && stillExists);

        // --- Players still intact after team operations ---
        check("Player object persists independently", p1.getName().equals("Alice"));

        // Display final roster for visual confirmation (not scored)
        System.out.println("\nFinal Rosters:");
        System.out.println("Team A players:");
        teamA.displayPlayers();
        System.out.println("Team B players:");
        teamB.displayPlayers();

        // --- Summary ---
        System.out.println("\n---------");
        System.out.println("TEST SUMMARY:");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("---------");
    }
}
