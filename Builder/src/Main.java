public class Main {
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder("Francesco","Virgulini");
       builder.setAge(42);
       builder.setAddress("Via Garibaldi 32");
        User firstUser = builder.build();
        builder.setfirstName("Marcello");
        builder.setlastName("Rossi");
        builder.setAge(36);
        builder.setAddress("Via Dante 56");
        User secondUser = builder.build();
        System.out.println("First user is " + firstUser);
        System.out.println("Second user is " + secondUser);
    }
}