package designpatterns.behavioral.templatemethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public class SinRamyun implements Ramyun {
    @Override
    public void getRamyun() {
        System.out.println("신라면을 준비한다.");
    }
}
