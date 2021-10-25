import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _13305 {
    public static void main(String[] args) throws IOException {
        /**
         n : 도시의 개수
         km : 도로의 길이
         cost : 리터당 가격
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());

        long[] km = new long[n - 1];
        long[] cost = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            km[i] = Integer.valueOf(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.valueOf(st.nextToken());
        }

        long price = km[0] * cost[0];
        int nowCity = 0;
        int nextCity = nowCity + 1;

        while (nextCity < n - 1) {
            if (cost[nowCity] < cost[nextCity]) {
                price += cost[nowCity] * km[nextCity];
            } else {
                price += cost[nextCity] * km[nextCity];
                nowCity = nextCity;
            }
            nextCity++;
        }
        System.out.println(price);
    }
}
