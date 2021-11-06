package godOfJava2th.ch24;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;
import java.util.Set;

class PropertiesSampleTest {

    @Test
    void test_checkProperties(){
        Properties prop = System.getProperties();
        Set<Object> keySet = prop.keySet();
        for (Object tempObject : keySet){
            System.out.println(tempObject + " : " + prop.get(tempObject));
        }
    }

    @Test
    void test_saveAndLoadProperties() throws IOException {
        String fileName = "test.properties";
        File propertiesFile = new File(fileName);
        FileOutputStream fos = new FileOutputStream(propertiesFile);

        Properties prop = new Properties();
        prop.setProperty("Writer", "weno");
        prop.setProperty("WriterHome", "https://wenodev.tistory.com");
        prop.store(fos, "Basic Properties file");
        fos.close();

        FileInputStream fis = new FileInputStream(propertiesFile);
        Properties propLoaded = new Properties();
        propLoaded.load(fis);
        fis.close();
        System.out.println(propLoaded);
    }

}