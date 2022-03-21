package design_pattern.strategy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/21
 */
public class Duck {
    Fly fly;
    Quack quack;

    public void display(){

    };

    public void performFly() {
        fly.fly();
    }

    void performQuack() {
        quack.quack();
    }
}

class MallardDuck extends Duck {
    MallardDuck() {
        fly = new FlyWithWing();
        quack = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("hi");
    }
}

class DonaldDuck extends Duck {
    DonaldDuck() {
        fly = new FlyNoWay();
        quack = new Squeak();
    }
}
