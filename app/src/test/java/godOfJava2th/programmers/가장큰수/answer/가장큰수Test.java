package godOfJava2th.programmers.가장큰수.answer;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class 가장큰수Test {
    @Test
    void setUp(){
        int[] numbers = {0, 0, 2, 0, 1, 0};
        solution2(numbers);
    }

    private void solution1(int[] numbers) {
        // 숫자 -> 문자 -> 내림차순정렬 -> 조합
        String[] strNums = new String[numbers.length];
        for (int i=0; i<numbers.length; i++){
            strNums[i] = "" + numbers[i]; // string으로 변경하기위해
        }

        //버블 소트
        for (int i=0; i<strNums.length-1; i++){
            for (int j=i+1; j< strNums.length; j++){
                String s1 = strNums[i];
                String s2 = strNums[j];
                if ((s1+s2).compareTo(s2+s1) <0){
                    strNums[i] = strNums[j];
                    strNums[j] = s1;
                }
            }
        }

        String answer = "";
        for (String s: strNums){
            answer += s;
        }

        if (answer.charAt(0) == '0') {
            answer = "0";
        }
    }

    private void solution2(int[] numbers) {
        // 숫자 -> 문자 -> 내림차순정렬 -> 조합
        String[] strNums = new String[numbers.length];
        for (int i=0; i<numbers.length; i++){
            strNums[i] = "" + numbers[i]; // string으로 변경하기위해
        }

        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        String answer = "";
        for (String s: strNums){
            answer += s;
        }

        if (answer.charAt(0) == '0') {
            answer = "0";
        }
    }

    private void solution3(int[] numbers) {
        // 숫자 -> 문자 -> 내림차순정렬 -> 조합
        String[] strNums = new String[numbers.length];
        for (int i=0; i<numbers.length; i++){
            strNums[i] = "" + numbers[i]; // string으로 변경하기위해
        }

        Arrays.sort(strNums, (s1, s2) -> (s2 + s1).compareTo(s1+s2));

        String answer = "";
        for (String s: strNums){
            answer += s;
        }

        if (answer.startsWith("0")) {
            answer = "0";
        }
    }

    private void solution4(int[] numbers) {

        String answer = IntStream.of(numbers)
                .mapToObj(String::valueOf)
                .sorted((s1,s2) -> (s2 + s1).compareTo(s1+s2))
                .collect(Collectors.joining());

        if (answer.startsWith("0")) {
            answer = "0";
        }
    }


}
