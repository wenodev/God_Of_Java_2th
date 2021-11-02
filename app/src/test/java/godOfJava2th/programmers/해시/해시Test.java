package godOfJava2th.programmers.해시;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class 해시Test {
    @Test
    void setUp(){
        String[][] clothes = {
                {"yellow_har", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        solution(clothes);
    }

    private void solution(String[][] clothes) {
        Map<String, Integer> counts = new HashMap<>();

        for (String[] c : clothes){
            String type = c[1];
            counts.put(type, counts.getOrDefault(type, 0) + 1);
        }
        int answer = 1;
        for (Integer c: counts.values()){
            answer *= c+1;
        }
        answer -= 1;
        System.out.println("answer: " + answer);
    }

    private void solution1(String[][] clothes) {
        Map<String, Integer> counts = new HashMap<>();

        int answer = Arrays.stream(clothes)
                .map(c -> c[1])
                .distinct()
                .map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())
                .map(c -> c+1)
                .reduce(1, (c, n) -> c * n);

        System.out.println("answer: " + (answer - 1));
    }


}
