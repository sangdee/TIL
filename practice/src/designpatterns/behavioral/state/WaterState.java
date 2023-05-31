package designpatterns.behavioral.state;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public interface WaterState {
    void coldWater();

    void hotWater();

    void normalWater();

    void waterSupply();
}
