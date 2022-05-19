

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int t,x,y;


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();


        for(int i=0;i<t;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            int distance=y-x;
            int max=(int)Math.sqrt(distance);
            
            if(max==Math.sqrt(distance)){
                System.out.println(2*max-1);
            }
            else if(distance<=max*max+max){
                System.out.println(2*max);
            }else {
                System.out.println(2*max+1);
            }

        }


    }


}












