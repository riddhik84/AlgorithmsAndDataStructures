//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/

public class ReverseString {
    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'd'};
        reverseString(input);
        for (char i : input) {
            System.out.print(i + " ");
        }
    }

    public static void reverseString(char[] s) {
        if (s != null || s.length > 1) {
            int len = s.length;
            for (int i = 0, j = len - 1; i < j; i++, j--) {
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
            }
        }
    }
}
