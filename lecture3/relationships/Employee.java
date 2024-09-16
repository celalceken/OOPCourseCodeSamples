package cc.oop.lecture3.relationships;

public class Employee extends User {

    private int employeeID;
    private String department;

    public Employee(String firstName, String lastName, Address homeAddress, String username, String password, int employeeID, String department) {
        super(firstName, lastName, homeAddress, username, password);
        this.employeeID = employeeID;
        this.department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getDepartment() {
        return department;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", department='" + department + '\'' +
                '}';
    }
}
