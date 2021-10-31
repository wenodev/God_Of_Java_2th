package godOfJava2th.programmers.가장큰수;

import org.junit.jupiter.api.Test;

import java.util.*;

class 가장큰수Test {
    @Test
    void setUp(){
        int[] numbers = {0, 0, 2, 0, 1, 0};
        solution(numbers);
    }

    private void solution(int[] numbers) {
        String answer = "";
        int length = numbers.length;
        String[] str = new String[length];

        for (int i = 0; i < length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        for (int i = 0; i < str.length; i++) {
            answer += str[i];
        }

        System.out.println(answer);
    }
}
