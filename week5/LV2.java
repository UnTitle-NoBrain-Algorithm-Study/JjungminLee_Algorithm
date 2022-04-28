import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {
    public static int n;

    public static int []arr;
    public static void main(String[]args) throws IOException {

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        long ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.abs(i+1-arr[i]);

        }

        System.out.println(ans);




    }
}