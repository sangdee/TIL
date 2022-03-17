package design_pattern.observer;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/17
 */
public class Hyunwoong implements Observer{
    @Override
    public void update() {
        System.out.println("hyunwoong send notification");
    }
}
