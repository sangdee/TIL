package decorator;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/27
 */
public interface Car {

    public void assemble();

}
class BasicCar implements Car{

    @Override
    public void assemble() {
        System.out.println("Basic Car");
    }
}

class CarDecorator implements Car{

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sports Car");
    }
}

class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Luxury Car");
    }
}
