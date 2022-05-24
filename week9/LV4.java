

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n,m;
    public static int [][]dp;
    public static int [][]arr;
    public static boolean [][]visited;


    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr=new int[n+1][m+1];
        dp=new int[n+1][m+1];
        visited=new boolean[n+1][m+1];


        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                arr[i][j]=sc.nextInt();


            }

        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){

                dp[i][j]=arr[i][j]+Math.max(dp[i-1][j],Math.max(dp[i][j-1],dp[i-1][j-1]));

            }
        }

        System.out.println(dp[n][m]);




    }


}












