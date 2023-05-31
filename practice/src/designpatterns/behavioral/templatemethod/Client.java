package designpatterns.behavioral.templatemethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class Client {
    public static void main(String[] args) {
        Ramyun jinRamyun = new JinRamyun();
        jinRamyun.cook();

        Ramyun sinRamyun = new SinRamyun();
        sinRamyun.cook();

        Ramyun samyangRamyun = new SamyangRamyun();
        samyangRamyun.cook();
    }
}
