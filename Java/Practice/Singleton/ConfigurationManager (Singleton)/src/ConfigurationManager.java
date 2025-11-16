import java.util.concurrent.ConcurrentHashMap;

public class ConfigurationManager {
    private static volatile ConfigurationManager instance;

    private ConcurrentHashMap<String, String> data = new ConcurrentHashMap<>();

    private ConfigurationManager() {}

    public static ConfigurationManager instanceOf() {
        ConfigurationManager result = instance;
        if (result == null) {
            synchronized (ConfigurationManager.class) {
               if (result == null) {
                instance = result = new ConfigurationManager();
               }
            }
        }
        return result;
    }

    public void setConfig(String key, String value) {
        data.put(key, value);
    }

    public String getConfig(String key) {
        return data.get(key);
    }

    public void printAllConfigs() {
        for (var entry : data.entrySet()) {
            System.out.println("Config: " + entry.getKey() + " = " + entry.getValue());
        }
    }
}
