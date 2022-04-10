import java.io.*;
import java.util.StringTokenizer;

public class Lv2 {


    public static int n;

    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        int five=n/5;
        int three=n%5;

        while(true){

            if(three%3!=0){
                five-=1;
                three+=5;
                if(five<0){
                    System.out.println(-1);
                    break;
                }
            }else{
                three/=3;
                System.out.println(five+three);
                break;
            }

        }
    }
}
