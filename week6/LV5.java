import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {

    public static int n;
    public static int []arr;
    public static int [][]dp;
    public static int max;
    public static void main(String[]args) throws IOException {
        Scanner sc=new Scanner(System.in);
        //자기자신을 포함했을 때와 하지 않았을때로 구분해서 생각해야
        //dp[n][0] n번째가 연속합의 마지막이면서  수 하나를 제거하지 않았을 때
        //dp[n][1] n번째 수가 연속합의 마지막이면서 특정 수 하나를 제거했을 때

        n=sc.nextInt();
        arr=new int[n];
        dp=new int[n][2];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        dp[0][0]=arr[0];
        dp[0][1]=0;
        max=arr[0]; // 원소가 하나있을 때 반례 해결 가능 예를 들면
        //1
        //-3
        //입력받았을 때

        for(int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][0]+arr[i],arr[i]);
            // 한번도 제거하지 않고 i번째 까지 계속 쌓아올리는 경우 or i번째에서 연속합 시작
            dp[i][1]=Math.max(dp[i-1][0],dp[i-1][1]+arr[i]);
            // 특정수를 처음 제거하는 경우 or 이전에 한번 제거 됐기 때문에 이번엔 더해주기

            max=Math.max(max,Math.max(dp[i][0],dp[i][1]));

        }
        System.out.println(max);





    }







}

