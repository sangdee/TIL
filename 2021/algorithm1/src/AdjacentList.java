import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Sangji Lee
 * @see : https://github.com/sangji11
 * @since : 2020-06-07 오후 4:25
 */
public class AdjacentList {
    //인접리스트
    static int nV; //총 vertex 개수
    static int nE; //총 edge 개수

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        nV = scanner.nextInt();
        nE = scanner.nextInt();
        ArrayList<ArrayList<Integer>> ad = new <ArrayList<Integer>>ArrayList();
        for (int i = 0; i < nV; i++) {
            ad.add(new <Integer>ArrayList());
        }
        for (int i = 0; i < nE; i++) {
            int t1 = scanner.nextInt(), t2 = scanner.nextInt();
            ad.get(t1).add(t2);
            ad.get(t2).add(t1);
        }
    }
}
