import java.util.ArrayList;
import java.util.List;

class UserManager {
    private static UserManager instance;
    private List<User> users;

    private UserManager() {
        users = new ArrayList<>();
    }

    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void addUser(String name) {
        int id = users.size() + 1;
        User user = new User(id, name);
        users.add(user);
    }

    public void listUsers() {
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName());
        }
    }
}