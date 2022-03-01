import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/02/26
 */
public class FunctionTest {
    public static void main(String[] args) {
        // List<Integer> i = new ArrayList<>(List.of(1));
        Function<Integer, Function<Integer, Integer>> f = i -> i2 -> i + i2;
        System.out.println(f.apply(1).apply(9));

        final Function<Function<Integer, String>, String> f2 = i -> i.apply(10);
        System.out.println(f2.apply(i -> "#" + i));

        final Function<Integer, Function<Integer, Function<Integer, Integer>>> f3
            = i1 -> i2 -> i3 -> i1 + i2 + i3;

        Function<Integer, Function<Integer, Integer>> plus10 = f3.apply(10);

        System.out.println(plus10.apply(1).apply(2));

        Function<Integer, Function<Integer, Integer>> plus15 =
            i -> i2 -> i + i2 + 15;

        System.out.println(plus15.apply(1).apply(2));

        int value = 30;
        Function<Function<Integer, Integer>, String> plus20 =
            i -> String.valueOf(i.apply(20));
        System.out.println(plus20.apply(Function.identity()));

        List<Integer> collect = Stream.of(1, 2, 3)
            .collect(toList());
    }

    void functionTest() {
    }

}
