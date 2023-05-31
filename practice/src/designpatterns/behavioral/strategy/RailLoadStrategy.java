package designpatterns.behavioral.strategy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class RailLoadStrategy implements MovableStrategy {
    @Override
    public void move() {
        System.out.println("선로를 통해 이동");
    }
}
