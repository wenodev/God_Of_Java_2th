package godOfJava2th.ch23;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class SetSampleTest {
    String[] cars = new String[]{
            "Tico", "Sonata", "BMW", "Benz",
            "Lexus", "Mustang", "Grandeure",
            "The Beetle", "Mini Cooper", "i30",
            "BMW", "Lexus", "Carnibal", "SM5",
            "SM7", "SM3", "Tico"
    };

    @Test
    void getCarKinds(){
        Set<String> carSet = new HashSet<>();
        carSet.addAll(Arrays.asList(cars));
        Iterator<String> iterator = carSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }

    @Test
    void test_listIterator(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("c");
        linkedList.addFirst("b");
        linkedList.addFirst("a");

        Iterator<String> iterator = linkedList.listIterator(1);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    void test_descendingIterator(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("b");
        linkedList.addFirst("a");

    }

}