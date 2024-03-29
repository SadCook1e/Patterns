import java.util.ArrayList;

public class TextChat implements  Chat {

    User admin;
    ArrayList<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        this.admin = admin;
    }
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users) {
            u.getMessage(message);
        }
        admin.getMessage(message);
    }
}
