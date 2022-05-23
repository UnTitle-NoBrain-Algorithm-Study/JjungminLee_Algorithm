

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n;
    public static int arr[][];
    public static int cnt=0;
    public static boolean visited[][];
    public static ArrayList<Integer>list=new ArrayList<Integer>();

    public static int []dirX={-1,1,0,0};
    public static int []dirY={0,0,-1,1};
    public static int count=0;

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
                int nx=node.x+dirX[k];
                int ny=node.y+dirY[k];
                if(nx>=0&&nx<n&&ny>=0&&ny<n){
                    if(arr[nx][ny]!=0&&!visited[nx][ny]){ //잊지마
                        visited[nx][ny]=true;
                        count++;
                        queue.add(new Node(nx,ny));
                    }
                }

            }
        }



    }


    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        arr=new int[n+1][n+1];
        visited=new boolean[n+1][n+1];


        for(int i=0;i<n;i++){
            String input = sc.next();
            for(int j=0;j<n;j++){
                arr[i][j]=input.charAt(j)-'0';
                visited[i][j]=false;
            }

        }



        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1 &&!visited[i][j]){
                    count=1;
                    BFS(i,j);

                    list.add(count);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }





    }


}












