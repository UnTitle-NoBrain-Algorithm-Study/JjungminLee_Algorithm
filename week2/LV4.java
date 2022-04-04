import java.io.*;
import java.util.StringTokenizer;

public class LV4 {


    public static int n;
    public static long [][]dp;


    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        dp=new long[101][10];

        dp[1][0]=0;
        for(int i=1;i<=9;i++){
            dp[1][i]=1;
        }

        //dp[자리수 개수][끝자리]

        for(int i=2;i<=n;i++){
            for(int j=0;j<=9;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j+1]%1000000000;

                }
                else if(j==9){
                    dp[i][j]=dp[i-1][j-1]%1000000000;
                }else{
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j+1])%1000000000;
                }
            }
        }
        long ans=0;
        //overflow가 날수 있으므로 한번더 나눠주기
        for(int i=0;i<=9;i++){
            ans+=dp[n][i]%1000000000;

        }

        System.out.println(ans%1000000000);


    }
}
