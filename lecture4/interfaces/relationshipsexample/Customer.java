package cc.oop.lecture4.interfaces.relationshipsexample;

public class Customer extends User {

    private String phoneNumber;
    private Address workAddress;

    public Customer(String firstName, String lastName, Address homeAddress, String username, String password, String phoneNumber, Address workAddress) {
        super(firstName, lastName, homeAddress, username, password);
        this.phoneNumber = phoneNumber;
        this.workAddress = workAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "phoneNumber='" + phoneNumber + '\'' +
                ", workAddress=" + workAddress +
                "} ";
    }
}
