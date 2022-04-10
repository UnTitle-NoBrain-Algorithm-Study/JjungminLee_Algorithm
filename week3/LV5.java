import java.io.*;
import java.util.*;

public class Main {


    public static int n;
    public static int [][]arr;
    public static int []dp;

    public static void main(String[]args) throws IOException {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        arr=new int[n+1][2];
        dp=new int [n+1];



        for(int i=1;i<=n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //comparator

        Arrays.sort(arr,new Comparator<int[]>(){
           @Override
           public int compare(int []a,int []b){
               if(a[0]<b[0]){
                   return -1;
               }else if(a[0]>b[0]){
                   return 1;
               }
               return 0;
           }

        });

        //LIS 

        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=1;
            for(int j=1;j<i;j++){
                if(arr[j][1]<arr[i][1]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }

            }
        }

        int max=0;
        for(int i=1;i<=n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        
        //반대로

        System.out.println(n-max);


    }
}
