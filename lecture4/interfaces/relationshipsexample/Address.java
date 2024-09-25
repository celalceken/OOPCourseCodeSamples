package cc.oop.lecture4.interfaces.relationshipsexample;

public class Address implements IAddressable {

    private String addressLine;
    private String city;

    public Address(String addressLine, String city) {
        this.addressLine = addressLine;
        this.city = city;
    }


    public String getCity() {
        return city;
    }


    // Method to return a short version of the address
    public String getShortAddress() {
        return city + ", " + (addressLine.length() > 10 ? addressLine.substring(0, 10) + "..." : addressLine);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
