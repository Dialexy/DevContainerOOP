import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EventLogger {
    private static volatile EventLogger instance;

    private final List<String> logs = Collections.synchronizedList(new ArrayList<>());

    private EventLogger() {}

    public static EventLogger instanceOf() {
        EventLogger result = instance;
        if (result == null) {
            synchronized (EventLogger.class) {
                if (result == null) {
                    instance = result = new EventLogger();
                }
            }
        }
        return result;
    }

    public void log(String message) {
        logs.add(message);
    }

    public List<String> getLogs() {
        return new ArrayList<>(logs);
    }

    public int getLogCount() {
        return logs.size();
    }
}
