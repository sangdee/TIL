package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2023/05/30
 */
public class Cafe {
    private List<CafeComposite> cafeComposites = new ArrayList<>();

    public void addComposite(CafeComposite cafeComposite) {
        cafeComposites.add(cafeComposite);
    }

    public int getCafeTotalPrice() {
        return cafeComposites.stream()
                             .mapToInt(CafeComposite::getPrice)
                             .sum();
    }

    public String getCafeCompositeName() {
        return cafeComposites.stream()
                             .map(CafeComposite::getName)
                             .collect(Collectors.joining(","));
    }

    public void clearAllComposite() {
        cafeComposites.clear();
    }
}
