package designpatterns.behavioral.strategy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class Moving {
    private MovableStrategy movableStrategy;
    private FuelStrategy fuelStrategy;

    public void move() {
        movableStrategy.move();
    }

    public void refuel() {
        fuelStrategy.refuel();
    }

    public void setFuelStrategy(FuelStrategy fuelStrategy) {
        this.fuelStrategy = fuelStrategy;
    }

    public void setMovableStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }
}
