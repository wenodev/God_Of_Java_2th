package godOfJava2th.ch24;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class MapSampleTest {

    @Test
    void test_check_hashMap(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
    }

    @Test
    void test_reduce_1(){
        String[] greeting = {"hello", "good morning!", "안녕"};
        String maxLength =  Arrays.asList(greeting).stream().reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length){
                return s1;
            }else {
                return s2;
            }
        });
        assertThat(maxLength).isEqualTo("good morning!");
    }

    @Test
    void test_reduce_2(){
        int[] numArray = {1,2,3,4,5};
        assertThat(Arrays.stream(numArray).reduce(0, (n1, n2) ->n1+n2))
                .isEqualTo(15);
    }

    @Test
    void test_checkKeySet(){
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Set<String> keySet = map.keySet();
        for (String tempKey : keySet){
            System.out.println(tempKey + " : " + map.get(tempKey));
        }
    }

    @Test
    void test_checkValues(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Collection<String> values = map.values();
        /*
        value : a
        value : b
        value : c
         */
        for (String value : values){
            System.out.println("value : " + value);
        }
    }

    /*
        A : a
        B : b
        C : c
     */
    @Test
    void test_checkHashMapEntry(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> tempEntry :entries){
            System.out.println(tempEntry.getKey() + " : " + tempEntry.getValue());
        }
    }

    @Test
    void test_checkContains(){
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        System.out.println(map.containsKey("A")); //true
        System.out.println(map.containsKey("D")); // false
        System.out.println(map.containsValue("a")); // true
        System.out.println(map.containsValue("d")); // false
    }

}