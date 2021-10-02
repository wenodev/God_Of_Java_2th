package godOfJava2th.ch22;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class ListSampleTest {
    @Test
    void test_checkArrayList(){
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add("abc");

        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
    }

}