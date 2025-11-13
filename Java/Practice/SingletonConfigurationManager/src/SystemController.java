import java.util.ArrayList;
import java.util.Random;

public class SystemController {
    private ArrayList<Service> services = new ArrayList<>();

    public ArrayList<Service> getServices() {
        return services;
    }

    public SystemController (ArrayList<Service> services) {
        this.services = services;
    }

    public void addService(Service service) {
        if (!services.contains(service)) {
            services.add(service);
        }
    }

    public void simulateUpdate() {
        if (services.isEmpty()) {
            System.out.println("No services available to simulate an update.");
            return;
        }

        Random random = new Random();
        Service updatingService = services.get(random.nextInt(services.size()));

        String key = "maxConnections";
        String value = "200";
        System.out.printf("Service '%s' is updating configuration: %s → %s%n",updatingService.getServiceName(), key, value);
        updatingService.updateConfiguration(key, value);

        System.out.println("\nAll services reflecting the updated configuration:");

        for (Service service : services) {
            service.showServiceStatus();
        }
    }
}
