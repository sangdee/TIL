package design_pattern.strategy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/21
 */
public interface Quack {
    void quack();
}

class Squeak implements Quack {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}

class MuteQuack implements Quack {

    @Override
    public void quack() {
        System.out.println("...");
    }
}