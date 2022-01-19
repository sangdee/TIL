package strategy.legacy;

import java.util.List;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public class Calculator {
    public double calculate(boolean isFirstGuest, boolean isLastGuest, List<Item> items) {
        double sum = 0;
        for (Item item : items) {
            if (isFirstGuest) {
                sum += item.getPrice() * 0.9;
            } else if (!item.isFresh()) {
                sum += item.getPrice() * 0.8;
            } else if (isFirstGuest) {
                sum += item.getPrice() * 0.8;
            } else {
                sum += item.getPrice();
            }
        }
        return sum;
    }
}

