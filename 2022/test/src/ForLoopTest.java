/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/08
 */
public class ForLoopTest {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if (i == 3) continue;
            System.out.println("i = " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println("j = " + j);
            }
        }
    }

}
