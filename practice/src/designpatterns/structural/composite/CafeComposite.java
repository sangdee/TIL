package designpatterns.structural.composite;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public abstract class CafeComposite {
    private final String name;
    private final int price;

    public CafeComposite(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract String typeOf();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
