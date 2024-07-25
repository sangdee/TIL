package temp;

import java.util.Arrays;

public class HIndex {
    //6 5 3 1 0
    //6,1, 3,3
    //0 1 3 5 6
    //1, 1, 1, 3, 5  -> 2
    //1 2 2 3 4 4 6 ->
    //3, 6, 6, 6, 6 -> 4
    //0,0,0 -> 0
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int count = 1;
            for (int j = i + 1; j < citations.length; j++) {
                count++;
                if (count >= citations[i]) {
                    answer = citations[i];
                    break;
                }
            }
            if (citations[i] != 0) {
                answer = Math.max(answer, count);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0}));

    }
}
