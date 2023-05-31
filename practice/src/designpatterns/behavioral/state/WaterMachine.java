package designpatterns.behavioral.state;

import lombok.Getter;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
@Getter
public class WaterMachine {
    // 4가지 상태를 제공한다.
    private final WaterState coldWaterState;
    private final WaterState hotWaterState;
    private final WaterState normalWaterState;
    private final WaterState childrenSafeState;

    // 현재 상태.
    private WaterState currentState;

    public WaterMachine() {
        this.coldWaterState = new ColdWaterState(this);
        this.hotWaterState = new HotWaterState(this);
        this.normalWaterState = new NormalWaterState(this);
        this.childrenSafeState = new ChildrenSafeState(this);

        // 최초 상태는 정수 상태.
        this.currentState = this.normalWaterState;
    }

    void changeState(WaterState nextState) {
        this.currentState = nextState;
    }

    // 냉온수가 사용자는 아래의 4개 메소드로 냉온수기를 이용한다.
    public void coldWater() {
        this.currentState.coldWater();
    }

    public void hotWater() {
        this.currentState.hotWater();
    }

    public void normalWater() {
        this.currentState.normalWater();
    }

    public void waterSupply() {
        this.currentState.waterSupply();
    }
}
