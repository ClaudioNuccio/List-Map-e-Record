public  class User {
    private String name;
    private int age;
    private static User instance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static User getInstance() {
        if (instance == null) {
            instance = new User("default", 0);
        }
        return instance;
    }
    public void printInfo() {
        System.out.println("name " + name);
        System.out.println("age " + age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
