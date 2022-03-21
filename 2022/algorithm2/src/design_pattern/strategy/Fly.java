package design_pattern.strategy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/21
 */
public interface Fly {
    void fly();
}

class FlyWithWing implements Fly {

    @Override
    public void fly() {
        System.out.println("fly with wing");
    }
}

class FlyNoWay implements Fly {

    @Override
    public void fly() {
        System.out.println("no way");
    }
}
