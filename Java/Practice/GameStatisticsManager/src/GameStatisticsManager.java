import java.util.ArrayList;
import java.util.HashMap;

public class GameStatisticsManager {

    private static volatile GameStatisticsManager instance;

    private final HashMap<String, ArrayList<String>> achievements = new HashMap<>();

    private GameStatisticsManager() {}

    public static GameStatisticsManager getInstance () {
        GameStatisticsManager result = instance;
        if (result == null) {
            synchronized (GameStatisticsManager.class) {
                result = instance;
                if (result == null) {
                    instance = result = new GameStatisticsManager ();
                }
            }
        }
        return result;
    }
    public void addAchievement(String playerName, String achievement) {
        achievements.computeIfAbsent(playerName, k -> new ArrayList<>()).add(achievement);
    }

    public ArrayList<String> getAchievements(String playerName) {
        ArrayList<String> playerAchievements = achievements.get(playerName);
        if (playerAchievements != null && !playerAchievements.isEmpty()) {
            System.out.println("Player: " + playerName + " Achievements: " + playerAchievements);
        }
        else {
            System.out.println("Player: " + playerName + " has no achievements.");
        }
        return playerAchievements;
    }

    public void printAllAchievements() {
        for (String player : achievements.keySet()) {
            ArrayList<String> playerAchievements = achievements.get(player);
            System.out.println("Player: " + player + " has gained the achievements: " + playerAchievements);
        }
    }
}
