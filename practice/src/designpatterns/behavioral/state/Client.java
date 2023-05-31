package designpatterns.behavioral.state;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class Client {
    public static void main(String[] args) {
        WaterMachine waterMachine = new WaterMachine();
        waterMachine.waterSupply();

        waterMachine.hotWater();
        waterMachine.waterSupply();

        waterMachine.coldWater();
        waterMachine.waterSupply();

        waterMachine.changeState(waterMachine.getChildrenSafeState());
        waterMachine.hotWater();
        waterMachine.waterSupply();
    }
}
