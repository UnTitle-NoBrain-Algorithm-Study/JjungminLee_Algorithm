package Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LV5 {
    public static int n;
    public static int[] dp;

    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new int[n + 2];

        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % 10007;
        }
        System.out.println(dp[n]);

    }
}
