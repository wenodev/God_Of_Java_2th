package godOfJava2th.ch23;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class QueueSampleTest {
    @Test
    void checkLinkedList(){
        LinkedList<String> link = new LinkedList<>();
        link.addFirst("a");
        link.addLast("b");
        link.addLast("c");
        link.addFirst("d");
        link.add(2,"e");
        link.set(1, "f");
        link.addAll(List.of("g", "h"));
        link.forEach(System.out::println);
    }
}