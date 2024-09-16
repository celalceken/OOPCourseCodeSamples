package cc.oop.lecture3.relationships;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Customer> customerList = new ArrayList<>();

        System.out.println("********** Enter Customer Information *********");

        String response = null;
        String firstName = null;
        String lastName = null;
        String phoneNumber = null;
        String addressLine = null;
        String city = null;
        Address homeAddress = null;
        Address workAddress = null;
        String username = null;
        String password = null;

        do {
            System.out.println("Enter customer first name, last name, phone number, username, and password:");
            firstName = input.nextLine();
            lastName = input.nextLine();
            phoneNumber = input.nextLine();
            username = input.nextLine();
            password = input.nextLine();

            System.out.println("Enter home address line and city:");
            addressLine = input.nextLine();
            city = input.nextLine();
            homeAddress = new Address(addressLine, city);

            System.out.println("Enter work address line and city:");
            addressLine = input.nextLine();
            city = input.nextLine();
            workAddress = new Address(addressLine, city);

            customerList.add(new Customer(firstName, lastName, homeAddress, username, password, phoneNumber, workAddress));

            System.out.println("Do you want to add another record (y/n)?");
            response = input.nextLine();

        } while (response.equalsIgnoreCase("y"));

        for (Customer customer : customerList) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getHomeAddress().toString() + " " + customer.getWorkAddress().toString());
        }

        System.out.println(customerList);

        customerList.forEach(item -> System.out.println(item.getFirstName() + " " + item.getLastName() + " " +item.getHomeAddress().getCity()));
    }
}

