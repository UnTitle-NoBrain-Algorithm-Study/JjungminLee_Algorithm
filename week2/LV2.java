import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class LV2 {


    public static int n;
    public static ArrayList<Integer>arr=new ArrayList<Integer>();
    public static StringBuilder sb=new StringBuilder();

    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int num=Integer.parseInt(br.readLine());
            arr.add(num);
        }
        Collections.sort(arr);

        for(int num:arr){
            sb.append(num).append("\n");
        }

        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(sb.toString());
        bw.close();





    }
}
