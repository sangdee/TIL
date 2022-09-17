package codility;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/09/17
 */
public class Lesson3_1 {
    //    X = 10
//    Y = 85
//    D = 30
    public int solution(int X, int Y, int D) {
        if ((Y - X) % D == 0) {
            return (Y - X) / D;
        }
        return (Y - X) / D + 1;
    }

    public static void main(String[] args) {
        Lesson3_1 lesson3_1 = new Lesson3_1();
        System.out.println(lesson3_1.solution(10, 85, 30));
    }
}
