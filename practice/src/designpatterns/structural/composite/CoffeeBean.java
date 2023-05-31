package designpatterns.structural.composite;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class CoffeeBean extends CafeComposite {
    public CoffeeBean(String name, int price) {
        super(name, price);
    }

    @Override
    public String typeOf() {
        return "coffee bean";
    }
}
