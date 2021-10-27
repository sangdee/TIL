package proxy.virtual;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021/10/26
 */

/**
 * 늦은 초기화Lazy Initialisation를 프록시를 사용해 구현
 */
public class MainController {

    public static void main(String[] args) {
        List<TextFile> textFileList = new ArrayList<>();

        textFileList.addAll(TextFileProvider.getSecretTextFile(0, 3));
        textFileList.addAll(TextFileProvider.getProxyTextFile(3, 20));

        textFileList.stream().map(TextFile::fetch).forEach(System.out::println);
    }

}

class TextFileProvider {

    public static List<SecretTextFile> getSecretTextFile(int start, int end) {
        return IntStream.range(start, end)
            .mapToObj(i -> new SecretTextFile(String.valueOf(i)))
            .collect(Collectors.toList());
    }

    public static List<ProxyTextFile> getProxyTextFile(int start, int end) {
        return IntStream.range(start, end)
            .mapToObj(i -> new ProxyTextFile(String.valueOf(i)))
            .collect(Collectors.toList());
    }
}