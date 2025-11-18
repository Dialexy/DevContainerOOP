public class RobotAlien implements Alien {
    private final String name;
    private int healthPoints;
    private double batteryPercentage;

    public RobotAlien (String name, int healthPoints, double batteryPercentage) {
        this.name = name;
        if (healthPoints >= 0 && healthPoints <= 5000) {
            this.healthPoints = healthPoints;
        }
        else {
            throw new IllegalArgumentException("Health must be between 0 and 5000");
        }

        if (batteryPercentage >= 0 && batteryPercentage <= 100) {
            this.batteryPercentage = batteryPercentage;
        }
        else {
            throw new IllegalArgumentException("Battery percentage must be between 0 and 100");
        }
    }

    public double getBatteryPercentage() {
        return batteryPercentage;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeDamage(int damage) {
        double actualDamage = (damage * (this.batteryPercentage / 100.0));

        if (actualDamage > healthPoints) {
            healthPoints = 0;
        }
        else {
            healthPoints -= actualDamage;
        }
    }

    @Override
    public boolean isDefeated() {
        return healthPoints <= 0;
    }

    @Override
    public String getStatus() {
        return "RobotAlien " + getName() + " - HP: " + getHealthPoints() + ", Battery: " + getBatteryPercentage() + "%";
    }
}
