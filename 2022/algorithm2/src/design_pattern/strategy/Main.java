package design_pattern.strategy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/22
 */
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack.quack();
        mallardDuck.fly.fly();

        Duck donaldDuck = new DonaldDuck();
        donaldDuck.performFly();
        donaldDuck.performQuack();
        // donaldDuck.fly((() -> System.out.println("no")))
    }
}
