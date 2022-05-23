

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static String s;
    public static Stack<Character>stack=new Stack<Character>();
    public static StringBuilder sb=new StringBuilder();
    public static boolean tag=false;


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();

        for(int i=0;i<s.length();i++){

            //케이스분류
            //>
            //<
            //tag 안에 있을 떄
            //tag 안에 없을 때

            if(s.charAt(i)=='<'){
                while(!stack.isEmpty()){
                    System.out.print(stack.pop());

                }

                System.out.print(s.charAt(i));
                tag=true;
            }
            else if(s.charAt(i)=='>'){
                System.out.print('>');
                tag=false;
            }
            else if(tag){
                System.out.print(s.charAt(i));
            }
            else if(!tag){
                if(s.charAt(i)!=' '){
                    stack.push(s.charAt(i));
                }
                else{
                    while(!stack.isEmpty()){
                        System.out.print(stack.pop());

                    }
                    System.out.print(s.charAt(i));
                }
            }




        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop());

        }














    }


}












