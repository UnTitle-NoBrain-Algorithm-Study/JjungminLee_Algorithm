import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {

    public static int n;
    public static Stack<String>stack=new Stack<>();

    public static void main(String[]args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int cnt=0;
            String []s=br.readLine().split("");
            for(int j=0;j<s.length;j++){
                if(s[j].equals("(")){
                    cnt+=1;
                }
                else if(s[j].equals(")")){
                    cnt-=1;
                }

                if(cnt<0){ //")"이 먼저 스택에 쌓일 수 없음
                    //)()( cnt는 0지만 )이 먼저 스택에 쌓일 수없다. 
                    break;
                }
            }

            if(cnt==0){

                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


    }







}

