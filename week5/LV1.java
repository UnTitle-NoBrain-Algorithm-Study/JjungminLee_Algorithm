import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {
    public static int n;

    public static int []arr;
    public static void main(String[]args) throws IOException {
        Queue<Integer>queue=new LinkedList<>();
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }

        while(queue.size()!=1){ //크기가 1일때 까지만 돌리기

            int trash=queue.peek();
            System.out.print(trash+" ");

            queue.poll();

            int remain=queue.poll();

            queue.offer(remain);


        }
        if(queue.size()==1){ 
            System.out.print(queue.peek());
        }




    }
}
