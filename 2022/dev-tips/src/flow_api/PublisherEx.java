package flow_api;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/07/12
 */
public class PublisherEx implements Publisher<TempInfo> {
    private String town;

    public PublisherEx(String town) {
        this.town = town;
    }

    @Override
    public void subscribe(Subscriber<? super TempInfo> subscriber) {
        subscriber.onSubscribe(new SubscriptionEx(subscriber, town));
    }
}
