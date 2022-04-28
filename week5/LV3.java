import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {
    public static int n;
    public static int sum=0;
    public static int []arr;
    public static int []count;
    public static void main(String[]args) throws IOException {

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        arr=new int[n];
        count=new int[8001];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            count[arr[i]+4000]++;
            sum+=arr[i];
        }


        //산술평균
        System.out.println(Integer.parseInt(String.format("%.0f",(float)sum/n)));
        Arrays.sort(arr);
        //중앙값

        System.out.println(arr[n/2]);

       //최빈값
        int max=0;
        for(int i=0;i<8001;i++){
            if(count[i]>max){
                max=count[i];
            }
        }


        ArrayList<Integer>index=new ArrayList<Integer>();
        int cnt2=0;
        for(int i=0;i<8001;i++){
            if(count[i]==max){
                cnt2++;
                index.add(i-4000);
            }
        }

        if(cnt2==1){
            System.out.println(index.get(0));
        }else{
            System.out.println(index.get(1));
        }



        //범위
        System.out.println(arr[n-1]-arr[0]);





    }
}

