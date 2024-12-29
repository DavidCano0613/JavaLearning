package Properties;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class StoreProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("name", "David");
        properties.put("edad", "23");
        properties.put("profesion", "automation");

        try {
//          Exportar propiedades a XML
//            OutputStream outputStreamXML = new FileOutputStream("/Users/juandavidpaniaguacano/src/learncorejava/src/Properties/resources/app.xml");
//            properties.storeToXML(outputStreamXML, "Storing XML file");

            // Exportar propiedades a Properties file
            OutputStream outputStreamXML = new FileOutputStream("/Users/juandavidpaniaguacano/src/learncorejava/src/Properties/resources/app.properties");
            properties.store(outputStreamXML, "Storing properties file");

        } catch (Exception e) {
            throw new RuntimeException();
        }

        System.out.println(properties.get("name"));
    }
}