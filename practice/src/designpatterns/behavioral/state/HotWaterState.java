package designpatterns.behavioral.state;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
class HotWaterState implements WaterState {
    private final WaterMachine waterMachine;

    HotWaterState(WaterMachine waterMachine) {
        this.waterMachine = waterMachine;
    }

    @Override
    public void coldWater() {
        System.out.println("온수 -> 냉수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.getColdWaterState());
    }

    @Override
    public void hotWater() {
        System.out.println("이미 온수가 선택되어 있습니다.");
    }

    @Override
    public void normalWater() {
        System.out.println("온수 -> 정수로 상태를 변경합니다.");
        waterMachine.changeState(waterMachine.getNormalWaterState());
    }

    @Override
    public void waterSupply() {
        System.out.println("뜨거운 물이 나옵니다.");
        System.out.println("뜨거운 물이 나온 이후에는 안전을 위해 정수로 상태가 바뀝니다.");
        waterMachine.changeState(waterMachine.getNormalWaterState());
    }
}
