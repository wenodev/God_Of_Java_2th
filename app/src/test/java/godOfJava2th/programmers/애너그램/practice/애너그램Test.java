package godOfJava2th.programmers.애너그램.practice;

import org.junit.jupiter.api.Test;

import java.util.*;

public class 애너그램Test {
    @Test
    void setUp(){
        String a = "anagram";
        String b = "MARGANA";
        solution(a, b);
    }

    private void solution(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        List<String> stringList = new ArrayList<>();
        for (int i=0; i<b.length(); i++){
            stringList.add(String.valueOf(b.charAt(i)));
        }

        for (int i=0; i<a.length(); i++){
            String temp = String.valueOf(a.charAt(i));
            if (stringList.contains(temp)){
                stringList.remove(temp);
            }
        }

        if (stringList.isEmpty()){
            System.out.println("실행");
        }

    }
}
