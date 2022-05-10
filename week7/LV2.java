

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static String Solve(String s){
        //스택 초기화
        Stack<Character>stack=new Stack<Character>();

        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(c=='('||c=='['){
                stack.push(c);

            }
            else if(c==')'){
                if(stack.isEmpty()){
                    return "no";
                }else if(stack.peek()=='('){
                    stack.pop();
                }else if(stack.peek()!='('){
                    return "no";
                }
            }
            else if(c==']'){
                if(stack.isEmpty()){
                    return "no";
                }else if(stack.peek()=='['){
                    stack.pop();
                }else if(stack.peek()!='['){
                    return "no";
                }
            }
        }
        if(stack.isEmpty()){
            return "yes";
        }else{
            return "no";
        }


    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String s;

        while(true) {
            s=sc.nextLine();
            if(s.equals(".")){
                break;
            }
            System.out.println(Solve(s));


        }

    }



}












