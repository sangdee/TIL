package simple_outsourcing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2022/06/03
 */
public class Problem1 {
    public static void main(String[] args) {
        final String input1 = "첫번째 숫자를 입력해주세요 : ", input2 = "두번째 숫자를 입력해주세요 : ";
        Scanner sc = new Scanner(System.in);
        System.out.print(input1);
        error(sc, input1);
        int firstNum = sc.nextInt();

        System.out.print(input2);
        error(sc, input2);
        int secondNum = sc.nextInt();
        System.out.printf("결과 : %d%n", (firstNum + secondNum));
    }

    private static void error(Scanner sc, String input) {
        while (!sc.hasNextInt()) {
            System.out.print("[입력오류] : 숫자로 입력해주세요.\n");
            sc.next();
            System.out.print(input);
        }
    }
}

/**
 * 입력한 10개의 숫자에 대하여 총 합 구하기
 */
class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            final String message = "숫자 " + i + " : ";
            System.out.print(message);
            error(sc, message);
            result += sc.nextInt();
        }
        System.out.printf("결과 : %d", result);
    }

    private static void error(Scanner sc, String input) {
        while (!sc.hasNextInt()) {
            System.out.print("[입력오류] : 숫자로 입력해주세요.\n");
            sc.next();
            System.out.print(input);
        }
    }
}

/**
 * 입력한 10개의 숫자에 대하여 리스팅하기
 */
class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            final String message = "숫자 " + i + " : ";
            System.out.print(message);
            error(sc, message);
            numberList.add(sc.nextInt());
        }
        Collections.sort(numberList);
        System.out.print("결과 : ");
        for (int i = 0; i < numberList.size(); i++) {
            Integer value = numberList.get(i);
            if (i != numberList.size() - 1) {
                System.out.printf("%d, ", value);
            }
            else {
                System.out.print(value);
            }
        }

    }

    private static void error(Scanner sc, String message) {
        while (!sc.hasNextInt()) {
            System.out.print("[입력오류] : 숫자로 입력해주세요.\n");
            sc.next();
            System.out.print(message);
        }
    }
}

/**
 * 입력한 N개의 숫자에 대하여 리스팅하기
 */
class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        int count = 0;
        while (true) {
            count++;
            final String message = "숫자 " + count + " : ";
            System.out.print(message);
            error(sc, message);

            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            numberList.add(input);
        }

        System.out.print("결과 : ");

        for (int i = 0; i < numberList.size(); i++) {
            Integer value = numberList.get(i);
            if (i != numberList.size() - 1) {
                System.out.printf("%d, ", value);
            }
            else {
                System.out.print(value);
            }
        }
    }

    private static void error(Scanner sc, String message) {
        while (!sc.hasNextInt()) {
            System.out.print("[입력오류] : 숫자로 입력해주세요.\n");
            sc.next();
            System.out.print(message);
        }
    }
}

/**
 * 입력한 N개의 숫자에 대하여 소수(PrimeNumber)만 필터링하여 리스팅하기
 */
class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        int count = 0;
        while (true) {
            boolean duplicateCheck = true;
            count++;
            final String message = "숫자 " + count + " : ";
            System.out.print(message);
            error(sc, message);
            int input = sc.nextInt();

            while (duplicateCheck && !numberList.isEmpty()) {
                boolean check = true;
                for (Integer i : numberList) {
                    if (input == i) {
                        System.out.print("[입력오류] : 이미 입력된 숫자 입니다.\n");
                        System.out.print(message);
                        input = sc.nextInt();
                        check = false;
                    }
                }
                if (check) {
                    duplicateCheck = false;
                }
            }

            if (input == 0) {
                break;
            }
            numberList.add(input);
        }

        System.out.print("결과 : ");

        for (int i = 0; i < numberList.size(); i++) {
            Integer value = numberList.get(i);
            if (isEfficiencyPrimeNumber(value)) {
                if (i != numberList.size() - 1) {
                    System.out.printf("%d, ", value);
                }
                else {
                    System.out.print(value);
                }
            }
        }

    }

    public static boolean isEfficiencyPrimeNumber(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void error(Scanner sc, String message) {
        while (!sc.hasNextInt()) {
            System.out.print("[입력오류] : 숫자로 입력해주세요.\n");
            sc.next();
            System.out.print(message);
        }
    }
}

/**
 * 게시물 등록 후 리스팅 하기
 */
class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{""});
        int count = 0;
        boolean exitFlag = false;
        while (!exitFlag) {
            final String message = "명령어) ";
            System.out.print(message);
            String input = sc.nextLine();

            switch (input) {
                case "등록":
                    count++;
                    System.out.print("제목 : ");
                    String title = sc.nextLine();
                    System.out.print("내용 : ");
                    String content = sc.nextLine();
                    list.add(new String[]{String.valueOf(count), title, content});
                    System.out.println("[알림] " + count + "번글이 등록되었습니다.");
                    break;
                case "조회":
                    System.out.print("게시글 번호를 입력해주세요 : ");
                    String id = sc.nextLine();
                    if (!isNumber(id)) {
                        System.out.println("게시글 번호는 숫자로 입력해주세요.");
                    }
                    else if (Integer.parseInt(id) == 0 || list.size() <= Integer.parseInt(id)) {
                        System.out.println("없는 게시글 번호입니다.");
                    }
                    else {
                        String[] strings = list.get(Integer.parseInt(id));
                        System.out.println("제목 : " + strings[1]);
                        System.out.println("내용 : " + strings[2]);
                    }
                    break;
                case "목록":
                    if (list.size() < 2) {
                        System.out.println("저장된 게시물이 없습니다");
                    }
                    else {
                        System.out.println("번호 / 제목");
                        System.out.println("----------------");
                        for (int i = 1; i < list.size(); i++) {
                            String[] arr = list.get(i);
                            System.out.println(arr[0] + " / " + arr[1]);
                        }
                    }
                    break;
                case "종료":
                    System.out.println("프로그램을 종료합니다.");
                    exitFlag = true;
                    break;
                default:
                    error(sc, message);
                    break;
            }
        }
    }

    private static void error(Scanner sc, String message) {
        System.out.print("잘못된 명령어 입니다. (명령어 - 등록,조회,목록,종료)\n");
    }

    private static boolean isNumber(String s) { //숫자 판별 함수
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}