public class GameEventService {

    public void recordKill(String playerName) {
        EventLogger.instanceOf().log("KILL: " + playerName);
    }

    public void recordItemPickUp(String playerName, String itemName) {
        EventLogger.instanceOf().log("ITEM_PICKUP: " + playerName + " " + itemName);
    }
}
