package designpatterns.abstractfactory;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/29
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        factory = new ConcreteFactory1();
        AbstractProductA productA = factory.createProductA();
    }
}
