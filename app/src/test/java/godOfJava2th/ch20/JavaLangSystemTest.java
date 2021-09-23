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

    @Test
    void test_numberMinMaxElapsedCheck(){
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        System.out.println("Milli second : " + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second : " + (System.nanoTime() - startNanoTime));
    }

}