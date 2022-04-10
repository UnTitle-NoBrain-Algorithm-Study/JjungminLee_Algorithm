import java.io.*;
import java.util.*;

public class Main {


    public static int n;
    public static int []arr;
    public static int []dp;

    public static void main(String[]args) throws IOException {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n+1];
        dp=new int[n+1];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        dp[0]=1;
        for(int i=1;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }

        int max=0;
        for(int i=0;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }

        System.out.println(max);


    }
}
