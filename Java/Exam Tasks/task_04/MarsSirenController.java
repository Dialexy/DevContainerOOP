public final class MarsSirenController {
    private static volatile MarsSirenController instance;

    private boolean armed;
    private boolean sounding;
    private int volume;

    private MarsSirenController() {
        if (instance != null) {
            throw new IllegalStateException("Use getInstance() to access the singleton instance");
        }
    }

    public static MarsSirenController getInstance() {
        MarsSirenController result = instance;
        if (result == null) {
            synchronized (MarsSirenController.class) {
                if (result == null) {
                    instance = result = new MarsSirenController();
                }
            }
        }
        return result;
    }

    public boolean arm() {
        if (!armed) {
            armed = true;
        }
        return armed;
    }

    public boolean disarm() {
        if (armed) {
            armed = false;
            sounding = false;
        }
        return !armed;
    }

    public boolean isArmed() {
        return armed;
    }

    public void setVolume(int db) {
        if (db < 0 || db > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100.");
        }
        volume = db;
    }

    public int getVolume() {
        return volume;
    }

    public void sound() {
        if (!armed) {
            throw new IllegalStateException("You can not sound the siren if the system is not armed.");
        }
        else {
            sounding = true;
        }
    }

    public void stop() {
        sounding = false;
    }

    public boolean isSounding() {
        return sounding;
    }
}
