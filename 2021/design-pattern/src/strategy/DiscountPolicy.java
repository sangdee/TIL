package strategy;

import strategy.legacy.Item;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */
public interface DiscountPolicy {

    double calculateWithDisCountRate(Item item);
}

class FirstCustomerDiscount implements DiscountPolicy {

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.9;
    }
}

class LastCustomerDiscount implements DiscountPolicy {

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.8;
    }
}

class UnFreshFruitDiscount implements DiscountPolicy {

    @Override
    public double calculateWithDisCountRate(Item item) {
        return item.getPrice() * 0.8;
    }
}