//package godOfJava2th.programmers.회사원;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//class 회사원Test {
//    @Test
//    void test(){
//        int[] A = {5,1,3,7};
//        int[] B = {2,2,6,8};
//        solution(A, B);
//    }
//
//    private void solution(int[] A, int[] B) {
//        final int SIZE = A.length;
//        boolean flag = false;
//        int answer = 0;
//        List<Integer> list = new ArrayList<>();
//        for(int i=0; i < SIZE; i++){
//            int temp = i;
//            for(int j=0; j < SIZE; j++ ){
//                if (A[i] < B[j]){
//                    flag = true;
//                    if (A[temp] < B[j]){
//                        temp = B[j];
//                    }
//                }
//                if (flag = true){
//                    answer++;
//                    list.stream().min()
//                }
//
//            }
//        }
//    }
//
//}
