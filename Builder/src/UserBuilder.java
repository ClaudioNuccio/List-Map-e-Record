public class UserBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;


    public UserBuilder setfirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setlastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public User build (){
        return new User(firstName,lastName,age,address);
    }
}
