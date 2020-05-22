package modernjava;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.util.resources.cldr.aa.CalendarData_aa_DJ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : Sangji Lee
 * @when : 2020-05-21 오후 6:03
 * @homepage : https://github.com/sangji11
 */
interface CalculatorService {
    public int calculate(int num1, int num2);
}

class Calculator {
    int calculate(CalculatorService calculatorService, int num1, int num2) {
        return calculatorService.calculate(num1, num2);

    }

}

public class OopAnotherEX {
    static List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate((num1, num2) -> (num1 + num2), 20, 30));
        System.out.println(calculator.calculate(Integer::sum, 20, 30));
        System.out.println(calculator.calculate(Addition::add, 20, 30));
        System.out.println(calculator.calculate(new Addtion2(), 20, 30));
//        System.out.println(calculator.calculate((num1, num2) -> (num1 - num2), 2, 3));
//        System.out.println(calculator.calculate((num1, num2) -> (num1 * num2), 20, 30));
//        System.out.println(calculator.calculate((num1, num2) -> (num1 / num2), 20, 30));

        final String nums = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" : "));
        System.out.println(nums);
    }
}

class Addition {
    static int add(int num1, int num2) {
        return num1 + num2;
    }
}

class Addtion2 implements CalculatorService {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
