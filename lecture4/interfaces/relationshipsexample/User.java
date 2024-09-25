package cc.oop.lecture4.interfaces.relationshipsexample;

public abstract class User {

    private String firstName;
    private String lastName;
    private IAddressable homeAddress;
    private String username;
    private String password;

    public User(String firstName, String lastName, IAddressable homeAddress, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.homeAddress = homeAddress;
        this.username = username;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public IAddressable getHomeAddress() {
        return homeAddress;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", homeAddress=" + homeAddress +
                ", username='" + username + '\'' +
                '}';
    }
}
