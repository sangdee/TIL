package temp;

public class TieRopes {
    public int solution(int K, int[] A) {
        // Implement your solution here
        int count = 0;
        int sum = 0;
        for (int i : A) {
            sum += i;
            if (sum >= K) {
                count++;
                sum = 0;
            }
        }
        return count;
    }
}
