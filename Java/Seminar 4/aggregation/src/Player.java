public class Player {
  private final String name;
  private int jerseyNum;
  private String position;
  private int goals;
  private int assists;

  public String getName() {
    return name;
  }

  public int getJerseryNum() {
    return jerseyNum;
  }

  public String getPosition() {
    return position;
  }

  public int getGoals() {
    return goals;
  }

  public int getAssists() {
    return assists;
  }

  public Player (String name, int jerseyNum, String position, int goals, int assists) {
    this.name = name;
    this.jerseyNum = jerseyNum;
    this.position = position;
    this.goals = goals;
    this.assists = assists;
  }

  public void addGoal(int newGoalAmount) {
    if (newGoalAmount < 0) {
      System.out.println("You must add 1 or more goals to the count");
    }
    goals += newGoalAmount;
  }

  public void addAssist(int newAssistAmount) {
    if (newAssistAmount < 0) {
      System.out.println("You must add one or more assists to the count");
    }
    assists += newAssistAmount;
  }
}
