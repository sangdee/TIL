package greedy;

import java.util.ArrayList;

public class M2 {
    static ArrayList<ArrayList<Integer>> powerset = new ArrayList<>();

    static void makePowerset(int[] arr, boolean[] visited, int n, int idx) {
        if (idx == n) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){
                if(visited[i]){
                    list.add(arr[i]);
                }
            }
            powerset.add(list);
            return;
        }

        visited[idx] = false;
        makePowerset(arr, visited, n, idx + 1);

        visited[idx] = true;
        makePowerset(arr, visited, n, idx + 1);
    }

    static int solution(int[] A, int S) {
        int result = 0;

        int n = A.length;
        boolean[] visited = new boolean[n];
        makePowerset(A, visited, n, 0);
        System.out.println(powerset);

        for(ArrayList<Integer> i : powerset){
            int res = 0;
            for(int j : i){
                res += j;
            }

            if(res == S){
                result += 1;
                System.out.println(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 7, 8};
        int S = 4;

        int output = solution(A, S);
        System.out.println(output);
    }
}
