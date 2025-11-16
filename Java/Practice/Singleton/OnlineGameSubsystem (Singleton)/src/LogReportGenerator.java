import java.util.List;

public class LogReportGenerator {

    public String generateReport() {
        EventLogger logger = EventLogger.instanceOf();
        int count = logger.getLogCount();
        List<String> logs = logger.getLogs();

        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append("GAME EVENT LOG REPORT\n");
        reportBuilder.append("Total Events: ").append(count).append("\n");

        for (String log : logs) {
            reportBuilder.append(log);
        }

        return reportBuilder.toString();
    }
}
