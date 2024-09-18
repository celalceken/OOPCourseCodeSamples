/*
 * "Program to interface, not implementation"
 * This module (client code) uses the "DatabaseDriver" interface instead of
 * using concrete implementations like PostgreSQL, MySQL, etc.
 * This allows coding by specifying what needs to be done, rather than how it is done.
 * Benefits include:
 * i) The client code does not change when modifications are needed.
 * ii) Changes in the implementation do not affect the client code.
 * iii) Interfaces can be used in client code even before implementations are available.
 * Teamwork and ease of adding new features.
 * iv) Code reuse is achieved. The same code can work with PostgreSQL, MySQL, etc.
 */

package cc.oop.lecture4.interfaces;

public class ClientService {

    private IDatabaseRepository databaseDriver;

    // private PostgreSQLDriver database; // this needs to be changed for each different database driver

    // Dependency injection: the object is created externally and passed to client code.

    public ClientService(IDatabaseRepository database) {
        this.databaseDriver = database;
    }

    public void add() {
        databaseDriver.connect();
        System.out.println("Performing add operation....");
        databaseDriver.executeQuery();
        databaseDriver.closeConnection();
    }

    public void findById(int id) {
        databaseDriver.connect();
        System.out.println("Searching for record with ID " + id + "....");
        databaseDriver.executeQuery();
        databaseDriver.closeConnection();
    }

    public void list() {
        databaseDriver.connect();
        System.out.println("Performing list operation....");
        databaseDriver.executeQuery();
        databaseDriver.closeConnection();
    }

    public void delete() {
        databaseDriver.connect();
        System.out.println("Performing delete operation....");
        databaseDriver.executeQuery();
        databaseDriver.closeConnection();
    }

    public void update() {
        databaseDriver.connect();
        System.out.println("Performing update operation....");
        databaseDriver.executeQuery();
        databaseDriver.closeConnection();
    }
}
