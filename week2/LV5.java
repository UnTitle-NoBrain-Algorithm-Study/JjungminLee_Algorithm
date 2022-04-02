import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        int len = numbers.length;
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.toString(numbers[i]);

        }
        // 숫자를 문자열로 만들어서 앞뒤로 붙여보면 됨
        // "6""10" 이 큰지 "10""6"이 큰지

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return ((o2 + o1).compareTo(o1 + o2));
                // 오름차순이면 o1.compareTo(o2)
            }
        });

        // 0이 여러개 있는 경우

        if (arr[0].equals("0")) {
            return "0";
        }
        for (String s : arr) {
            answer += s;
        }
        return answer;

    }
}
