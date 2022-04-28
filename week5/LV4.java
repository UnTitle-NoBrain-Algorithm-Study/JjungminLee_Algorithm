import java.io.*;
import java.util.*;

import static java.lang.Math.max;

public class Main {
    public static int cnt=0;
    public static HashMap<String,Integer>hashMap=new HashMap<String,Integer>();
    public static HashMap<String,String>finalMap=new HashMap<String,String>();

    public static void main(String[]args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while(true){//EOF 판단
            String s= br.readLine();

            if(s==null||s.equals("")){
                break;
            }
            cnt++;
            hashMap.put(s, hashMap.getOrDefault(s,0)+1);
        }
        for(String s:hashMap.keySet()){
            double percent=(double)hashMap.get(s)/(double)cnt;
            finalMap.put(s,String.format("%.4f",percent*100));
        }

        
        List<String> keys = new ArrayList<>(finalMap.keySet());
        Collections.sort(keys); //key를 기준으로 오름차순 정렬
        for (String key : keys) {
            System.out.println(key+" "+finalMap.get(key));
        }


    }







}

