import java.util.HashSet;
import java.util.Set;

public class User {
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String username, String pass, int custAge, Set<Integer> orders) {
        this.username = username;
        this.password = pass;
        this.age = custAge;
        this.orderIDs = orders;
    }

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(1212);
        User test = new User("name", "12123", 10, a);
    }
}
