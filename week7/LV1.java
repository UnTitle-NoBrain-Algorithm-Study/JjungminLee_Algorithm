import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {

    public static int n;
    public static Deque<Integer>deque=new LinkedList<>();

    public static int num1=0;
    public static int num2=0;
    public static StringBuilder sb=new StringBuilder();


    public static void main(String[]args) throws IOException {


        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();


            if(s.equals("push_back")){
                num1=sc.nextInt();
                deque.addLast(num1);

            }else if(s.equals("push_front")){
                num2=sc.nextInt();
                deque.addFirst(num2);
            }
            else if(s.equals("pop_front")){
                if(deque.size()==0){
                    sb.append(-1).append("\n");
                }else{
                    int x=deque.pollFirst();
                    sb.append(x).append("\n");
                }

            }else if(s.equals("pop_back")){
                if(deque.size()==0){
                    sb.append(-1).append("\n");
                }else{
                    int x=deque.pollLast();
                    sb.append(x).append("\n");
                }

            }else if(s.equals("size")) {
                sb.append(deque.size()).append("\n");

            }else if(s.equals("empty")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }


            }else if(s.equals("front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else{
                    int x=deque.getFirst();
                    sb.append(x).append("\n");
                }


            }else if(s.equals("back")){

                if(deque.isEmpty()) {
                    sb.append(-1).append("\n");
                }else{
                    int x=deque.getLast();
                    sb.append(x).append("\n");
                }

            }

        }
        System.out.println(sb.toString());







    }

}

