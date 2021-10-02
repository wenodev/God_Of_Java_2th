package godOfJava2th.ch22;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


class ListSampleTest {
    @Test
    void test_checkArrayList(){
        ArrayList list1 = new ArrayList();
        System.out.println(list1.add(1));
        list1.add("abc");

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
    }

    @Test
    void test_toArray(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        String[] strArray = list.toArray(new String[0]);
        Arrays.stream(strArray).forEach(s -> System.out.println(s));
    }
}