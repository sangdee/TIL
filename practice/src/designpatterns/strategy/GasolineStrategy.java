package designpatterns.strategy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class GasolineStrategy implements FuelStrategy {
    @Override
    public void refuel() {
        System.out.println("휘발유를 사용합니다.");
    }
}
