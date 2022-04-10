import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {


    public static int n;
    public static int a[];
    public static int b[];
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        a=new int[n];
        b=new int[n];

        StringTokenizer st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            b[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(b[i]>b[j]){
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }

        int cnt=0;

        for(int i=0;i<n;i++){
           cnt+=(a[i]*b[i]);

        }

        System.out.println(cnt);




    }
}
