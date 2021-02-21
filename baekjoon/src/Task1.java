public class Task1 {

    static int solution(int[] A){
        int[] diffArr = new int[4];
        for(int i = 1 ; i <= 4 ; i++){
            int diff = 0;
            for(int a : A){
                diff += Math.abs(i - a);
            }
            diffArr[i-1] = diff;
        }

        int min = Integer.MAX_VALUE;
        for(int d : diffArr){
            if(min > d){
                min = d;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 1, 1, 2, 3, 1};
        int[] B = {4, 1, 4, 1};
        int[] C = {3, 3, 3};

        System.out.println(solution(A));
        System.out.println(solution(B));
        System.out.println(solution(C));
    }
}
