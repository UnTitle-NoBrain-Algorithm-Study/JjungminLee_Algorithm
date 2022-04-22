import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {

    public static int n;
    public static String arr[];

    public static void main(String[]args) throws IOException {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new String[n];


        for(int i=0;i<n;i++){
            String s=sc.next();
            arr[i]=s;


        }
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String o1,String o2){
               if(o1.length()==o2.length()){
                   //compareTo 문자셩릐 사전순 값을 비교하야 그에 해당하는 int리턴
                    return o1.compareTo(o2);
                }
                return o1.length() -o2.length();
            }
        });

        System.out.println(arr[0]);
        //중복되지 않은 단어만 출력
        for(int i=1;i<n;i++){
            if(!arr[i].equals(arr[i-1])){
                System.out.println(arr[i]);
            }
        }






    }
}
