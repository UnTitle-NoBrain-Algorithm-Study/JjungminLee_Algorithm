

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Node{
        int x;
        int y;
        public Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static int r,c,n;
    public static char [][]arr;

    public static int dirX[]={-1,1,0,0};
    public static int dirY[]={0,0,-1,1};

    public static int[][]bombCount;
    public static boolean[][]check;

    public static void Boom(){
        for(int i=1;i<=n;i++){
            if(i==1){
                continue;
            }
            if(i%2==0){
                setBomb(i);
            }
            else{
                BFS(i);
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void setBomb(int sec){
        //짝수 초 일떄는 폭탄 채워주고
        //bombCount는 현재 sec에서 3더해주기!
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]=='.'){
                    arr[i][j]='O';
                    bombCount[i][j]=sec+3;
                }
            }
        }

    }

    public static void BFS(int sec){
        Queue<Node>queue=new LinkedList<Node>();
        //폭파해야 하는 애들을 BFS로 처리
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]=='O'){
                    //3초 지난애들은 폭파시켜주기 위해 queue에 넣음
                    if(sec==bombCount[i][j]){
                        queue.add(new Node(i,j));
                    }
                }
            }
        }

        while(!queue.isEmpty()){
            Node node=queue.poll();
            arr[node.x][node.y]='.';
            bombCount[node.x][node.y]=sec+3;
            for(int i=0;i<4;i++){
                int nx=node.x+dirX[i];
                int ny=node.y+dirY[i];
                if(nx>=0&&nx<r&&ny>=0&&ny<c){
                    arr[nx][ny]='.';
                    bombCount[nx][ny]=sec+3;
                }
            }
        }

    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        n=sc.nextInt();

        arr=new char[r][c];
        check=new boolean[r][c];
        bombCount=new int[r][c];

        for(int i=0;i<r;i++){
            String input=sc.next();
            for(int j=0;j<c;j++){
                arr[i][j]=input.charAt(j);
                if(arr[i][j]=='O'){
                    bombCount[i][j]=3;
                }

            }
        }
        Boom();


    }


}












