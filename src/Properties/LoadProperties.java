package Properties;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) {

        Properties properties = new Properties();

//      Load an XML
        try {
            InputStream xmlFile = new FileInputStream("/Users/juandavidpaniaguacano/src/learncorejava/src/Properties/resources/app.xml");

            properties.loadFromXML(xmlFile);
            System.out.println(properties);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//      Load a Properties file

        try {
            InputStream envFile = new FileInputStream("/Users/juandavidpaniaguacano/src/learncorejava/src/config.properties");

            properties.load(envFile);

            String env = properties.getProperty("env");

            System.out.println(properties.getProperty("env"));

            InputStream fileInput = new FileInputStream(String.format("/Users/juandavidpaniaguacano/src/learncorejava/src/%s.properties", env));

            properties.load(fileInput);
            fileInput.close();

            // Acceder a las propiedades
            String url = properties.getProperty("base-url");

            System.out.println("URL: " + url);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}