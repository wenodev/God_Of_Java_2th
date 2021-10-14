package godOfJava2th.ch23;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

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

        Queue<String> linkedList = new LinkedList<>();
        List<String> list = new ArrayList<>();

    }

}