public class BlobAlien implements Alien {
    private final String name;
    private int healthPoints;
    private double gooinessFactor;

    public BlobAlien (String name, int healthPoints, double gooinessFactor) {
        this.name = name;
        if (healthPoints >= 0 && healthPoints <= 5000) {
            this.healthPoints = healthPoints;
        }
        else {
            throw new IllegalArgumentException("Health must be between 0 and 5000");
        }

        if (gooinessFactor >= 0.5 && gooinessFactor <= 2.0) {
            this.gooinessFactor = gooinessFactor;
        }
        else {
            throw new IllegalArgumentException("Gooiness factor must be between 0.5 and 2.0");
        }
    }

    public double getGooinessFactor() {
        return gooinessFactor;
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
        double actualDamage = (damage * this.gooinessFactor);

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
       return "BlobAlien " + getName() + " - HP: " + getHealthPoints() + ", Gooiness: " + getGooinessFactor();
    }
}
