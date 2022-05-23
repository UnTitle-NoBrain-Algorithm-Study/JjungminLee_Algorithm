

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static int n;
    public static long dp[][];

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        if(n==1){
            System.out.println("*");
        }else{

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(j%2==1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();

                for(int j=1;j<=n;j++){
                    if(j%2==1){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }

                System.out.println();
            }
        }



    }


}












