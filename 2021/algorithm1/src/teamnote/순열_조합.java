package teamnote;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangdee
 * @since : 2021-06-04
 */

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 3 2
 *
 * ***순열(0,1,2)***
 *
 * 0 1
 *
 * 0 2
 *
 * 1 0
 *
 * 1 2
 *
 * 2 0
 *
 * 2 1
 *
 * ***중복순열(0,1,2)***
 *
 * 0 0
 *
 * 0 1
 *
 * 0 2
 *
 * 1 0
 *
 * 1 1
 *
 * 1 2
 *
 * 2 0
 *
 * 2 1
 *
 * 2 2
 *
 * ***조합(0,1,2)***
 *
 * 0 1
 *
 * 0 2
 *
 * 1 2
 *
 * ***중복조합(0,1,2)***
 *
 * 0 0
 *
 * 0 1
 *
 * 0 2
 *
 * 1 1
 *
 * 1 2
 *
 * 2 2
 */
public class 순열_조합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        //순열 (순서있게 배열)
        System.out.println("***순열(0,1,2)***");
        LinkedList<Integer> perArr = new LinkedList<Integer>();
        int[] perCheck = new int[n];
        permutation(n, r, perArr, perCheck);

        //중복순열 (순서있게 배열 + 자시자신도 포함)
        System.out.println("***중복순열(0,1,2)***");
        LinkedList<Integer> rePerArr = new LinkedList<Integer>();
        rePermutation(n, r, perArr);

        //조합 (순서관심없고 뽑은 유무만 생각)
        System.out.println("***조합(0,1,2)***");
        int[] comArr = new int[r];
        combination(comArr, n, r, 0, 0);

        //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
        System.out.println("***중복조합(0,1,2)***");
        int[] reComArr = new int[r];
        reCombination(reComArr, n, r, 0, 0);


    }


    //중복 조합 (순서관심없고 뽑은 유무만 생각 + 자기자신도 포함)
    private static void reCombination(int[] reComArr, int n, int r, int index, int target) {
        if (r == 0) {
            for (int i : reComArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (target == n) {
            return;
        }

        reComArr[index] = target;
        reCombination(reComArr, n, r - 1, index + 1, target);//뽑는경우
        reCombination(reComArr, n, r, index, target + 1);//안뽑는경우

    }

    //조합 (순서관심없고 뽑은 유무만 생각)
    private static void combination(int[] comArr, int n, int r, int index, int target) {
        if (r == 0) {
            for (int i : comArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        if (target == n) {
            return;
        }

        comArr[index] = target;
        combination(comArr, n, r - 1, index + 1, target + 1);//뽑는경우
        combination(comArr, n, r, index, target + 1);//안뽑는경우

    }

    //중복순열 (순서있게 배열 + 자시자신도 포함)
    private static void rePermutation(int n, int r, LinkedList<Integer> rePerArr) {
        if (rePerArr.size() == r) {
            for (int i : rePerArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            rePerArr.add(i);
            rePermutation(n, r, rePerArr);
            rePerArr.removeLast();

        }


    }

    //순열 (순서있게 배열)
    private static void permutation(int n, int r, LinkedList<Integer> perArr, int[] perCheck) {
        if (perArr.size() == r) {
            for (int i : perArr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (perCheck[i] == 0) {
                perArr.add(i);
                perCheck[i] = 1;
                permutation(n, r, perArr, perCheck);
                perCheck[i] = 0;
                perArr.removeLast();
            }
        }

    }
}
