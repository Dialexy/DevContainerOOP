import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private String message;
    private final List<ChatObserver> observers = new ArrayList<>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String newMessage) {
        message = newMessage;
        notifyObservers();
    }

    public void subscribe(ChatObserver user) {
        observers.add(user);
    }

    public void unsubscribe(ChatObserver user) {
        observers.remove(user);
    }

    private void notifyObservers() {
        for (ChatObserver observer : observers) {
            observer.update(message);
        }
    }
}
