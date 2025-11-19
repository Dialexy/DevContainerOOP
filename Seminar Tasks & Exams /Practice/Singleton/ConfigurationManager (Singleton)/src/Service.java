public class Service {
    private final String serviceName;
    private final ConfigurationManager configManager;

    public String getServiceName() {
        return serviceName;
    }

    public Service(String serviceName) {
        this.serviceName = serviceName;
        this.configManager = ConfigurationManager.instanceOf();
    }

    public void updateConfiguration(String key, String value) {
        this.configManager.setConfig(key, value);
    }

    public String readConfiguration(String key) {
        return this.configManager.getConfig(key);
    }

    public void showServiceStatus() {
        System.out.println("Service Name: " + this.serviceName);
        System.out.println("Current Configurations:");
        this.configManager.printAllConfigs();
    }
}
