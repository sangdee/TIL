package flow_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;
import org.junit.Test;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/07/12
 */
public class FlowApiTest {
    private Logger logger = Logger.getLogger("test");

    @Test
    public void test() throws InterruptedException {
        PublisherEx publisherEx = new PublisherEx("Seoul");
        SubscriberEx subscriberEx1 = new SubscriberEx();
        SubscriberEx subscriberEx2 = new SubscriberEx();

        publisherEx.subscribe(subscriberEx1);
        publisherEx.subscribe(subscriberEx2);
        System.out.println("hello");
    }

    @Test
    public void test2() {
        Runnable task = new Runnable() {
            public void run() {
                logger.info(Thread.currentThread().getName());
                System.out.println("Thread: " + Thread.currentThread().getName());
            }
        };

        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10000; i++) {
            service.submit(task);
        }
    }
}
