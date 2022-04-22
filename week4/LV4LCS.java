import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {
    public static int lcs[][];
    public static String []arr1;
    public static String []arr2;
    public static void main(String[]args) throws IOException {
        Scanner sc=new Scanner(System.in);

        String []arr1=sc.next().split("");
        String[]arr2=sc.next().split("");
        //두 문자열의 크기가 다를 수 있다!

        lcs=new int[arr1.length+1][arr2.length+1];
        for(int i=0;i<=arr1.length;i++){
            lcs[i][0]=0;
        }
        for(int i=0;i<=arr2.length;i++){
            lcs[0][i]=0;
        }
        for(int i=1;i<= arr1.length;i++){
            for(int j=1;j<=arr2.length;j++){

                if(arr1[i-1].equals(arr2[j-1])){
                    lcs[i][j]=lcs[i-1][j-1]+1;
                }else{
                    lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }

       System.out.println(lcs[arr1.length][arr2.length]);
    }
}
