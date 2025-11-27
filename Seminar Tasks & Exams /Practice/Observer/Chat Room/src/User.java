public class User implements ChatObserver {
    private final String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {
        System.out.printf("User: %s recived message: %s%n", userName, message);
    }
}
