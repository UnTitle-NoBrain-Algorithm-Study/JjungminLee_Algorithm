import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {

    public static int n,m,v;
    public static StringBuilder sb=new StringBuilder();
    public static int arr[][];
    public static int check[];
    public static Queue<Integer>queue=new LinkedList<>();


    public static void DFS(int v){

        if(check[v]==1){
            return;
        }else{
            check[v]=1;
        }
        System.out.print(v+" ");
        for(int i=1;i<=n;i++){
            if(arr[v][i]==1){
                DFS(i);
            }
        }

    }

    public static void BFS(int v){
        queue.offer(v);
        check[v]=1;
        while(!queue.isEmpty()){
            int x=queue.remove();
            System.out.print(x+" ");
            for(int i=1;i<=n;i++){
                if(check[i]!=1&&arr[x][i]==1){
                    queue.offer(i);
                    check[i]=1;
                }
            }
        }


    }

    public static void main(String[]args) throws IOException {

       Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        v=sc.nextInt();
        arr=new int[n+1][n+1];
        check=new int[n+1];
        for(int i=0;i<m;i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[a][b]=1;
            arr[b][a]=1;
        }

        DFS(v);
        Arrays.fill(check,0);
        System.out.println("");
        BFS(v);




    }







}

