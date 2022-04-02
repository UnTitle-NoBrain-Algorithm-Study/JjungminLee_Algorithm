package Week1;

public class Lv3 {
    public int solution(String s) {
        int n = 0;
        String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] num = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

        for (int i = 0; i < 10; i++) {
            s = s.replace(numbers[i], num[i]);
        }
        n = Integer.parseInt(s);
        return n;
    }
}
