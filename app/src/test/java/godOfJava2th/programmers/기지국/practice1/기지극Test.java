package godOfJava2th.programmers.기지국.practice1;

import org.junit.jupiter.api.Test;

class 기지극Test {
    @Test
    void test(){
        int n = 16;
        int[] stations = {9};
        int w = 2;
        solution(n, stations, w);
    }

    private void solution(int n, int[] stations, int w) {
        boolean[] visited = new boolean[n];
        for (int i=0; i<stations.length; i++){
            check(visited, stations[i]-1, w);
        }

    }

    private void check(boolean[] visited, int position, int w) {
        if (position >= 0 && position <visited.length){
            visited[position] = true;
        }
        for (int i = 1; i<=w; i++){
            check(visited, position-i, w);
        }
    }

}