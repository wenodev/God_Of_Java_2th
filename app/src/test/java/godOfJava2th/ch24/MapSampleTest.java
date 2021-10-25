package godOfJava2th.ch24;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

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

}