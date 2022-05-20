import java.util.*;

class Solution {

    public static class Node{
        int x,y;
        public Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static boolean [][]visit;
    public static int dirX[]={-1,1,0,0};
    public static int dirY[]={0,0,-1,1};
    public static int cnt=0;

    public static void BFS(int m,int n,int [][]picture,int i,int j){
        Queue<Node>queue=new LinkedList<Node>();
        queue.add(new Node(i,j));
        visit[i][j]=true;

        while(!queue.isEmpty()){
            Node node=queue.poll();
            for(int k=0;k<4;k++){
                int nx=node.x+dirX[k];
                int ny=node.y+dirY[k];
                if(nx>=0&&nx<m&&ny>=0&&ny<n){
                    if(picture[node.x][node.y]==picture[nx][ny]&&!visit[nx][ny]){
                        cnt++;
                        visit[nx][ny]=true;
                        BFS(m,n,picture,nx,ny);
                    }
                }
            }
        }
    }


    public int[] solution(int m, int n, int[][] picture) {
        visit=new boolean[m+1][n+1];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(picture[i][j]!=0&&!visit[i][j]){
                    cnt=1;
                    numberOfArea++;
                    BFS(m,n,picture,i,j);
                    if(cnt>maxSizeOfOneArea){
                        maxSizeOfOneArea=cnt;
                    }
                }
            }
        }



        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
}