package cc.oop.lecture4.interfaces;


public class MainClass {

    public static void main(String args[]) {

        IDatabaseRepository dataSource = new PostgreSQLImplementation();
        //IDatabaseRepository dataSource = new MySQLImplementation();

        // Dependency injection: the object is initialized externally and passed to client code.
        ClientService databaseService = new ClientService(dataSource);

        // Other modules call the relevant methods of the repository for database operations.
        databaseService.add();

        databaseService.findById(2);

        databaseService.delete();

        databaseService.update();

        databaseService.list();
    }
}
