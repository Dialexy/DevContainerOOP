public class DisplayPanel implements NotificationObserver {
    private final String panelId;

    public String getPanelId() {
        return panelId;
    }

    public DisplayPanel(String panelId) {
        this.panelId = panelId;
    }

    @Override
    public void update(String message) {
        if (!message.contains("door")) {
            System.out.printf("[Pannel: %s] - Alert: %s%n", panelId, message);
        }
    }
}
