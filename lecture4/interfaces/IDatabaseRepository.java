package cc.oop.lecture4.interfaces;

interface IDatabaseRepository {
    public void connect();

    public void executeQuery();

    public void closeConnection();
}
