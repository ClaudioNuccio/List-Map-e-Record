public class Main {
    private static User instance;



    public static void main(String[] args) {
        User user1 = User.getInstance();
        user1.printInfo();

        user1.setAge(25);
        user1.setName("Marcello");
        System.out.println("Modified user1 ");
       user1.printInfo();

        User user2 = User.getInstance();

        System.out.println("User2 " + user2);
        user2.setAge(32);
        user2.setName("Francesco");
        System.out.println("Modified user2 " );
        user2.printInfo();
    }
}