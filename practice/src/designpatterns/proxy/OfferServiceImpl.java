package designpatterns.proxy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class OfferServiceImpl implements OfferService {

    @Override
    public void offer(Offer offer) {
        System.out.println("offer = " + offer.getName());
    }
}
