public class Player {
   private final String name;
   private int score;

   public String getName() {
      return name;
   }

   public int getScore() {
      return score;
   }

   public Player (String name, int score) {
      this.name = name;
      this.score = score;
   }

   public void earnAchievement(String achievementName) {
      GameStatisticsManager manager = GameStatisticsManager.getInstance();
      manager.addAchievement(this.name, achievementName);
   }

   //add achievement method is redudent, add.achievement from manager already does both adding and earning

   public void displayAchievements() {
      GameStatisticsManager manager = GameStatisticsManager.getInstance();
      manager.getAchievements(this.name);
   }
}
