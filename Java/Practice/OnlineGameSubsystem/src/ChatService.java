public class ChatService {

    public void sendMessage(String playerName, String message) {
        String formattedMessage = "CHAT_MESSAGE: " + playerName + ": " + message;
        EventLogger.instanceOf().log(formattedMessage);
    }
}
