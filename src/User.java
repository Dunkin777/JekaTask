import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String username;
    ArrayList<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<User>();
    }

    public String getUsername() {
        return username;
    }

    public ArrayList<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe (User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        return subscriptions.stream().anyMatch(user::equals);
    }

    public void sendMessage(User user, String text){
    MessageDatabase.sendMessage(this, user, text);
    }

    public String toString() {
        return username;
    }
}
