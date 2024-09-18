package cc.oop.lecture4.interfaces;

public class MySQLImplementation implements IDatabaseRepository {

    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    public void executeQuery() {
        System.out.println("Executing MySQL query...");
    }

    public void closeConnection() {
        System.out.println("Closing connection to MySQL database...");
    }
}
