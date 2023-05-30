package designpatterns.proxy;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class BookServiceImpl implements BookService {
    @Override
    public void rent(Book book) {
        System.out.println("book = " + book.getTitle());
    }
}
