package strategy;

import java.util.List;
import strategy.legacy.Item;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public class Calculator {

    private final DiscountPolicy discountPolicy;

    public Calculator(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public double calculate(List<Item> items) {
        double sum = 0;
        for (Item item : items) {
            sum += discountPolicy.calculateWithDisCountRate(item);
        }
        return sum;
    }
}
