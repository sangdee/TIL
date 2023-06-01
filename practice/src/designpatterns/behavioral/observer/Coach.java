package designpatterns.behavioral.observer;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/31
 */
public interface Coach {
    void subscribe(Crew crew);

    void unsubscribe(Crew crew);

    void notifyCrew(String msg);
}
