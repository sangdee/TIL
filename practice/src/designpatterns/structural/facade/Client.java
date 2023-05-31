package designpatterns.structural.facade;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class Client {
    public static void main(String[] args) {
        Washer washer = new Washer();
        washer.start();
    }
}
