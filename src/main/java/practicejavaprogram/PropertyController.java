package practicejavaprogram;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

    public class PropertyController {
        public String readPropertyFile(String filepath, String key) {

            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(filepath);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Properties prop = new Properties();
            try {
                prop.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return prop.getProperty(key);
        }

        public static void main(String[] args) throws IOException {
            PropertyController pc = new PropertyController();
            String value = pc.readPropertyFile(".//src//testFiles//Configurations.properties", "appUrl");
            System.out.println(value);
        }
    }



