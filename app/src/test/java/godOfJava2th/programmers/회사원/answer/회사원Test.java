package godOfJava2th.programmers.회사원.answer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class 회사원Test {
    @Test
    void test(){
        int[] A = {5,1,3,7};
        int[] B = {2,2,6,8};
        solution1(A, B);
    }

    private void solution1(int[] A, int[] B) {
        Arrays.sort(B);

        int answer = 0;
        for (int i=0; i<A.length; i++){
            for (int j=0; j<B.length; j++){
                if (A[i] < B[j]){
                    answer++;
                    B[j] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    private void solution2(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int index = B.length - 1;

        int answer = 0;
        for (int i=A.length-1; i>=0; i--){
            if (A[i] < B[index]){
                index--;
                answer++;
            }
        }
        System.out.println(answer);
    }

}
