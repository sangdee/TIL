/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2021-01-31
 */
public class 피보나치 {
    public static int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }

        return fibo(x - 1) + fibo(x - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(30));
    }
}
