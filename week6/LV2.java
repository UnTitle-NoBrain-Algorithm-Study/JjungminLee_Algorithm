import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {

    public static int n,m;
    public static Queue<Integer>queue=new LinkedList<>();
    public static StringBuilder sb=new StringBuilder();
    public static void main(String[]args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        sb.append("<");
        for(int i=1;i<=n;i++){
            queue.add(i);
        }
        int cnt=0;

        while(!queue.isEmpty()){
            cnt++;
            for(int i=0;i<m-1;i++){
                queue.add(queue.poll());
            }

            int c=queue.peek();
            if(cnt==n){
                sb.append(c);
            }else{
                sb.append(c).append(", ");
            }
            queue.remove();


        }
        sb.append(">");
        System.out.println(sb.toString());



    }







}

