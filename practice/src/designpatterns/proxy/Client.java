package designpatterns.proxy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class Client {
    public static void main(String[] args) {
        BookService bookService = new CommonProxy(new BookServiceImpl());
        bookService.rent(new Book("책1"));
        OfferService offerService = new CommonProxy(new OfferServiceImpl());
        offerService.offer(new Offer("ff"));
    }
}
