

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static class Color{
        int x,y;
        public Color(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static int n;
    public static int[]dirX={-1,1,0,0};
    public static int[]dirY={0,0,-1,1};
    public static boolean [][]check;
    public static char [][]arr1;
    public static char [][]arr2;
    public static Queue<Color>queue=new LinkedList<Color>();
    public static int ans1,ans2=0;


    public static void BFS(int i,int j){

        check[i][j]=true;
        queue.add(new Color(i,j));
        while(!queue.isEmpty()){
            Color c=queue.poll();
            int xNum=c.x;
            int yNum=c.y;
            for(int k=0;k<4;k++){
                int X=xNum+dirX[k];
                int Y=yNum+dirY[k];
                if(X>=0&&X<n&&Y>=0&&Y<n){
                    //방문했는지 확인 && 같은구역인지 확인
                    if(!check[X][Y]&&arr1[X][Y]==arr1[xNum][yNum]){
                        check[X][Y]=true;
                        queue.add(new Color(X,Y));

                    }
                }
            }
        }




    }

    public static void BFS2(int i,int j){

        check[i][j]=true;
        queue.add(new Color(i,j));
        while(!queue.isEmpty()){
            Color c=queue.poll();
            int xNum=c.x;
            int yNum=c.y;
            for(int k=0;k<4;k++){
                int X=xNum+dirX[k];
                int Y=yNum+dirY[k];
                if(X>=0&&X<n&&Y>=0&&Y<n){
                    if(!check[X][Y]&&arr2[X][Y]==arr2[xNum][yNum]){
                        check[X][Y]=true;
                        queue.add(new Color(X,Y));


                        }
                    }
                }
            }
        }





    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        check=new boolean[n+1][n+1];
        arr1=new char[n+1][n+1];
        arr2=new char[n+1][n+1];
        for(int i=0;i<n;i++){
            String s=sc.next();
            for(int j=0;j<n;j++){
                //문자를 정수형으로
                arr1[i][j]=s.charAt(j);
                check[i][j]=false;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //G가 들어오면 이걸 R의 아스키코드 값으로 바꿔줌
                if(arr1[i][j]=='G'){
                    arr2[i][j]='R';
                }
                else{
                    arr2[i][j]=arr1[i][j];
                }
            }
        }



        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!check[i][j]){
                    BFS(i,j);
                    ans1++;

                }
            }
        }
        //check 초기화
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                check[i][j]=false;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!check[i][j]){
                    BFS2(i,j);
                    ans2++;

                }
            }
        }

        System.out.print(ans1+" "+ans2);





    }



}












