package designpatterns.composite;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class Chair extends CafeComposite {
    public Chair(String name, int price) {
        super(name, price);
    }

    @Override
    public String typeOf() {
        return "chair";
    }
}
