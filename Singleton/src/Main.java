public class Main {
    private static User instance;

    private static User getInstance() {
        if (instance == null) {
            instance = new User("default", 0);
        }
        return instance;
    }

    public static void main(String[] args) {
        User user1 = getInstance();
        System.out.println("User 1 " + user1);

        user1.setAge(25);
        user1.setName("Marcello");
        System.out.println("Modified user1 " + user1);

        User user2 = getInstance();

        System.out.println("User2 " + user2);
        user2.setAge(32);
        user2.setName("Francesco");
        System.out.println("Modified user 2 " + user2);
    }
}