package programmers_lv1;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author : Sangji Lee
 * @when : 2021-04-15
 * @github : http://github.com/sangdee
 */
public class 두개뽑아서더하기 {
    public static Integer[] solution(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.toArray(new Integer[set.size()]);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 0, 2, 7};
        solution(numbers);
    }
}
