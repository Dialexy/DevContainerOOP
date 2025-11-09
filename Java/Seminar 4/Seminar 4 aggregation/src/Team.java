import java.util.ArrayList;

public class Team {
  private final String name;
  private String coachName;
  private final String homeStadium;
  ArrayList<Player> players;

  public String getName() {
    return name;
  }

  public String getCoachName() {
    return coachName;
  }

  public String getHomeStad() {
    return homeStadium;
  }

  public Team(String name, String coachName, String homeStadium, ArrayList<Player> players) {
    this.name = name;
    this.coachName = coachName;
    this.homeStadium = homeStadium;
    this.players = players;
  }

  public void addPlayer(Player player) {
    this.players.add(player);
  }

  public void removePlayer(Player player) {
    this.players.remove(player);
  }

  public void displayPlayers() {
    for (Player i : players) {
      System.out.println(i);
    }
  }
}
