package designpatterns.adapter;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("으악");
    }

    @Override
    public void fly() {
        System.out.println("날다");
    }
}
