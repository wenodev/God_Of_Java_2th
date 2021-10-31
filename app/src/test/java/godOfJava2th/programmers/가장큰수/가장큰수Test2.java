package godOfJava2th.programmers.가장큰수;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class 가장큰수Test2 {
    @Test
    void setUp(){
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);
    }

    private void solution(int[] numbers) {
        Set<StringBuffer> stringBuffers = new HashSet<>();
        int size = numbers.length;
        int count = 0;
        int end = ((numbers.length) * (numbers.length-1))/2;
        while(count != end){
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = count; i<count + size; i++){
                stringBuffer.append(numbers[i%size]);
            }
            stringBuffers.add(stringBuffer);
            count++;
        }
        count = size;
        while(count != 0){
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = count-1; i>=count - size; i--){
                int temp = i;
                if (temp < 0){
                    temp = temp + size;
                }
                stringBuffer.append(numbers[temp]);
            }
            stringBuffers.add(stringBuffer);
            count--;
        }
        System.out.println(stringBuffers);
        System.out.println(Collections.max(stringBuffers));
    }
}
