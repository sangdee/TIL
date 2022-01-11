package generic;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/01/08
 */
public class Main {

    public static void main(String[] args) {
        ClassName<String> name = new ClassName<>();
        ClassName<Integer> number = new ClassName<>();
        number.setType(10);
        name.setType("String");

        System.out.println("number = " + number.getType());
        System.out.println(
            "number.getType().getClass().getName() = " + number.getType().getClass().getName());
        System.out.println("name = " + name.getType());

        System.out.println("ClassName.genericMethod(1) = " + ClassName.genericMethod(1));
        System.out.println("ClassName.genericMethod(\"halo\").getClass().getName() = " + ClassName
            .genericMethod("halo").getClass().getName());
        System.out.println("ClassName.genericMethod2(1).getClass().getName() = " + ClassName.genericMethod2(1).getClass().getName());
    }
}

