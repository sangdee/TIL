package designpatterns.behavioral.state;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class ColdWaterState implements WaterState {
    private final WaterMachine waterMachine;

    public ColdWaterState(WaterMachine waterMachine) {
        this.waterMachine = waterMachine;
    }

    @Override
    public void coldWater() {
        System.out.println("이미 냉수가 선택되어 있습니다");
    }

    @Override
    public void hotWater() {
        System.out.println("냉수에서 뜨거운 물로 변경합니다");
        waterMachine.changeState(waterMachine.getHotWaterState());
    }

    @Override
    public void normalWater() {
        System.out.println("냉수에서 정수로 변경합니다");
        waterMachine.changeState(waterMachine.getNormalWaterState());
    }

    @Override
    public void waterSupply() {
        System.out.println("냉수가 나옵니다");
    }
}
