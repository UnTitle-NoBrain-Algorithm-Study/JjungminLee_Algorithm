import java.io.*;
import java.util.StringTokenizer;

public class LV3 {


    public static int n;
    public static int []arr;




    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        arr =new int[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        int primeNum[]=new int [1001];
        for(int i=2;i<=1000;i++){
            primeNum[i]=i;

        }
        for(int i=2;i<=1000;i++){
            if(primeNum[i]==0){
                continue;
            }else{
                for(int j=2*i;j<=1000;j+=i){
                    primeNum[j]=0;
                }
            }
        }

        int count=0;

        for(int i=0;i<n;i++){
            if(primeNum[arr[i]]!=0){
                count++;
            }
        }

        System.out.println(count);



    }
}
