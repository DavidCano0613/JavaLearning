package OOP;

import OOP.singleton.DataBaseConnector;

public class MainForOOP {
    public static void main(String[] args) {
        //  Singleton
        DataBaseConnector dataBaseConnector = DataBaseConnector.getInstance();
        System.out.println("salto de linea");
        System.out.println("dataBaseConnector = " + dataBaseConnector);

        DataBaseConnector dataBaseConnector2 = DataBaseConnector.getInstance();
        System.out.println("dataBaseConnector = " + dataBaseConnector2);

        System.out.println("salto de linea");
        dataBaseConnector.connectDatabase();

        System.out.println("salto de linea");
        dataBaseConnector2.connectDatabase();
    }
}