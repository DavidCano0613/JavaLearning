package OOP.singleton;

/*
Rules for a singleton:
1) We need to have a private constructor
2) We need to have a static private attribute
3) We need to have a public static method which returns the instance
*/

public class DataBaseConnector {

    private static DataBaseConnector dataBaseConnector;

    private DataBaseConnector() {
        System.out.println("Private to forbid the instance creation outside");
    }

    public static synchronized DataBaseConnector getInstance() {
        if (dataBaseConnector == null) {
            dataBaseConnector = new DataBaseConnector();
        }
        return dataBaseConnector;
    }

    public void connectDatabase() {
        System.out.println("Connecting database = " + dataBaseConnector);
    }

    public void disconnectDataBase(){
        System.out.println("Disconnecting database  = " + dataBaseConnector);
    }

}