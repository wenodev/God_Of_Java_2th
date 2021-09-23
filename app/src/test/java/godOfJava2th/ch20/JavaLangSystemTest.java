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

    @Test
    void test_printStreamCheck(){
        byte b = 127;
        short s = 32767;
        System.out.print(b);
        System.out.println();
        System.out.print(s);
        System.out.println();
        System.out.println(b);
        System.out.println(s);
    }

    @Test
    void test_printNull(){
        Object object = null;
        System.out.println(object); // null
        System.out.println(object + " is object's value"); // null is object's value
        // new StringBuilder().append(obj).append(" is object's value)
    }

    @Test
    void test_toString(){
        Object object = null;
        System.out.println(object.toString()); // NullPointerException!
    }

}