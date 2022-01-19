package singleton;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public class MultiThread {
    private static MultiThread mt = new MultiThread();
    private static int count = 0;

    private MultiThread(){}

    public static MultiThread getInstance() {
        return mt;
    }

    public synchronized static void print(String input) {
        count++;
        System.out.println(input + "count : "+ count);
    }
}
