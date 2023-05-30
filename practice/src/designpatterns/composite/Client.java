package designpatterns.composite;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class Client {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.addComposite(new Desk("desk1", 10000));
        cafe.addComposite(new Chair("chair1", 5000));
        cafe.addComposite(new CoffeeBean("coffeebean1", 1000));

        System.out.println(cafe.getCafeCompositeName());
        System.out.println(cafe.getCafeTotalPrice());

    }
}
