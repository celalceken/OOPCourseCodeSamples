package cc.oop.lecture4.interfaces;

public class PostgreSQLImplementation implements IDatabaseRepository {

    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    public void executeQuery() {
        System.out.println("Executing PostgreSQL query...");
    }

    public void closeConnection() {
        System.out.println("Closing connection to PostgreSQL database...");
    }
}
