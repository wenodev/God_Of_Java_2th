package godOfJava2th.programmers.이분탐색.answer;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class 이분탐색Test {
    @Test
    void start(){
        int[] budgets = {120, 121, 145, 149};
        int M = 450;
        solution1(budgets, M);
    }

    private void solution1(int[] budgets, int M) {
        int min = 0;
        int max = 0;

        for (int b: budgets){
            if (b > max){
                max = b;
            }
        }

        int answer = 0;
        while(min <= max){
            int mid = (min + max) / 2;
            int sum = 0;

            for (int b: budgets){
                if (b > mid){
                    sum += mid;
                }
                else{
                    sum += b;
                }
            }

            if (sum <= M){
                min = mid + 1;
                answer = mid;
            }else{
                max = mid - 1;
            }
        }
        System.out.println(answer);
    }

    private void solution2(int[] budgets, int M) {
        int min = 0;
        int max = IntStream.of(budgets).max().orElse(0);

        int answer = 0;
        while(min <= max){
            final int mid = (min + max) / 2;
            int sum = IntStream.of(budgets)
                    .map(b -> Math.min(b, mid))
                    .sum();
            if (sum <= M){
                min = mid + 1;
                answer = mid;
            }else{
                max = mid - 1;
            }
        }
        System.out.println(answer);
    }


}
