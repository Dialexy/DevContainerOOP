import java.util.ArrayList;
import java.util.Random;

public class Game {
    private final String gameTitle;
    private ArrayList<Player> players = new ArrayList<>();

    public String getGameTitle() {
        return gameTitle;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Game (String gameTitle, ArrayList<Player> players) {
        this.gameTitle = gameTitle;
        this.players = players;
    }

    public void addPlayer(Player player) {
        if(!players.contains(player)) {
            players.add(player);
        }
    }

    public void simulateGame() {
        Random random = new Random();
        String[] achievements = {"First Blood", "Sharp Shooter", "Survivor", "MVP", "Headshot Master"};

        for (Player player : players) {
            String randomAchievement = achievements[random.nextInt(achievements.length)];

            GameStatisticsManager manager = GameStatisticsManager.getInstance();
            manager.addAchievement(player.getName(), randomAchievement);

            System.out.printf("Player %s earned the achievement: %s%n", player.getName(), randomAchievement);
        }
    }
}
