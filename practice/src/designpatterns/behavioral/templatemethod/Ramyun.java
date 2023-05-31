package designpatterns.behavioral.templatemethod;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public interface Ramyun {
    default void cook() {
        System.out.println("가스불을 켠다.");
        System.out.println("냄비에 물을 끓인다.");
        getRamyun();
        System.out.println("면을 넣는다.");
        System.out.println("스프를 넣는다.");
        System.out.println("계란을 넣는다.");
    }

    void getRamyun();

}
