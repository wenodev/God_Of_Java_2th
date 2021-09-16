package godOfJava2th.ch20;

import org.junit.jupiter.api.Test;

class JavaLangSystemTest {

    @Test
    void test_systemPropertiesCheck_javaVersion(){
        System.out.println(System.getProperty("java.version"));
    }

    @Test
    void test_systemPropertiesCheck_javaHome(){
        System.out.println(System.getenv("JAVA_HOME"));
    }
}