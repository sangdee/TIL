package strategy;

import java.util.Arrays;
import strategy.legacy.Item;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public class MainController {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new UnFreshFruitDiscount());
        calculator.calculate(Arrays.asList(
            new Item("Apple", 3000),
            new Item("Banana", 5000),
            new Item("Grape", 5000)
        ));
    }

}
