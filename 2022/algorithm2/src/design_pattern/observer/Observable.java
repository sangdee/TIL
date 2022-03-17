package design_pattern.observer;


/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/03/17
 */
public interface Observable {
    void subscribe(Observer o);

    void unSubscribe(Observer o);

    void notifyObserver();
}
