

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int n,m;
    public static List<Integer> []arr;
    public static boolean []check;
    public static int ans;
    public static Queue<Integer>queue=new LinkedList<Integer>();


    public static void BFS(int num){

        ans=0;

        check[num]=true;
        queue.add(num);
        while(!queue.isEmpty()){
            int x= queue.poll();
            for(int item:arr[x]){
                if(!check[item]){
                    ans+=1;
                    check[item]=true;
                    queue.add(item);
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr=new ArrayList[n+1];
        check=new boolean[n+1];

        for(int i=0;i<n+1;i++){
            arr[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        BFS(1);
        System.out.println(ans);





    }



}












