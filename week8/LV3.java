

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n,m;
    public static int [][]arr;
    public static boolean [][]visited;
    public static int ans=0;
    public static int dirX[]={-1,1,0,0};
    public static int dirY[]={0,0,-1,1};

    public static class Node{
        int x,y;
        public Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }


    public static void BFS(int i,int j){
        Queue<Node>queue=new LinkedList<Node>();
        queue.add(new Node(i,j));
        visited[i][j]=true;




        while(!queue.isEmpty()){

            Node node=queue.poll();
            for(int k=0;k<4;k++){
                int x=node.x+dirX[k];
                int y=node.y+dirY[k];
                if(x>=1&&x<=n&&y>=1&&y<=m){

                    if(!visited[x][y]&&arr[x][y]==1){


                        visited[x][y]=true; //꼭해줘야해
                        queue.add(new Node(x,y));
                        arr[x][y]=arr[node.x][node.y]+1;
                    }
                }

            }






        }


    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();


        visited=new boolean[n+1][m+1];

        arr=new int[n+1][m+1];


        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<m;j++){
                arr[i+1][j+1]=s.charAt(j)-'0';
                visited[i+1][j+1]=false;

            }

        }

        BFS(1,1);
        System.out.println(arr[n][m]);


    }


}












