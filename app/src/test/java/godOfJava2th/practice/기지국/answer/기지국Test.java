package godOfJava2th.practice.기지국.answer;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

/*
- Greedy 방식으로 해결하면 된다.
 */
class 기지국Test {
    @Test
    void test(){
        int n = 16;
        int[] stations = {9};
        int w = 2;
        solution1(n, stations, w);
        solution2(n, stations, w);
    }

    /*
    - 앞에서부터 채워나가는 방법
    - Queue 사용
     */
    private void solution1(int n, int[] stations, int w) {
        System.out.println("##solutions1##");
        int answer = 0;
        Queue<Integer> sq = new LinkedList<>();
        for (int s: stations) sq.add(s);

        int position = 1;
        while(position <= n){
            if (!sq.isEmpty() && sq.peek() - w <= position){
                System.out.println("if문");
                position = sq.remove() + w + 1;
            }else{
                System.out.println("else문");
                answer += 1;
                position += w * 2 + 1;
            }
            System.out.println("position: " + position);
        }
        System.out.println(answer);
    }

    private void solution2(int n, int[] stations, int w) {
        System.out.println("##solutions2##");
        int answer = 0;
        int si = 0;
        int position = 1;
        while(position <= n){
            if (si < stations.length && stations[si] - w <= position){
                System.out.println("if문");
                position = stations[si] + w + 1;
                si += 1;
            }else{
                System.out.println("else문");
                answer += 1;
                position += w * 2 + 1;
            }
            System.out.println("position: " + position);
        }
        System.out.println(answer);
    }

    @Test
    void test_1(){
        int n = 16;
        int w = 2;
        int answer = 0;

        int position = 1;
        while(position <= n){
            answer += 1;
            position += w * 2 + 1;
            System.out.println("position: " + position);
        }
        System.out.println(answer);
    }

}
