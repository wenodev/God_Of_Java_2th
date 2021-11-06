package godOfJava2th.ch24;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TreeMapSampleTest {
    /*
        1 : f
        A : a
        a : g
        가 : e
     */
    @Test
    void test_checkTreeMap(){
        Map<String, String> map = new TreeMap<>();
        map.put("A", "a");
        map.put("가", "e");
        map.put("1", "f");
        map.put("a", "g");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}