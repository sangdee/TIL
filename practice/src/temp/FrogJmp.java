package temp;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        int count = 0;
        int minus = Y - X;
        if (minus % D > 0) {
            count = minus / D + 1;
        } else {
            count = minus / D;
        }
        return count;
    }
}
