package designpatterns.behavioral.state;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
class NormalWaterState implements WaterState {
    private final WaterMachine waterMachine;

    NormalWaterState(WaterMachine waterMachine) {
        this.waterMachine = waterMachine;
    }

    @Override
    public void coldWater() {
        System.out.println("정수 -> 냉수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.getColdWaterState());
    }

    @Override
    public void hotWater() {
        System.out.println("정수 -> 온수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.getHotWaterState());
    }

    @Override
    public void normalWater() {
        System.out.println("정수 -> 안전 모드로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.getChildrenSafeState());
    }

    @Override
    public void waterSupply() {
        System.out.println("정수가 나옵니다.");
    }
}
