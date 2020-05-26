//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/884/

public class String2Integer {
    public static void main(String[] args) {
        String[] data = {"  12", "", "abc 12", "0", "-1", "-12345 jskdjsk", "  -12 uei", " -a 1", "-91283472332", "+1", " "};
        for (String s : data) {
            int number = myAtoi(s);
            System.out.println(number);

            int number_ = myAtoi_leetcode_solution(s);
            System.out.println(number_);
        }
    }

    //Using built in String methods for operations
    //1079 / 1079 test cases passed.
    //Status: Accepted
    //Runtime: 6 ms
    //Memory Usage: 39.3 MB
    static public int myAtoi(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        str = str.trim();
        int i = 0;
        int n = 1;
        if (str.charAt(0) == '-') {
            i = 1;
            n = -1;
        } else if (str.charAt(0) == '+') {
            i = 1;
        }
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            sb.append(str.charAt(i) + "");
            ++i;
        }
        try {
            if (!sb.toString().equals("")) {
                return Integer.parseInt(sb.toString()) * n;
            } else {
                return 0;
            }
        } catch (NumberFormatException ex) {
            if (n == -1) {
                return Integer.MIN_VALUE;
            } else if (n == 1) {
                return Integer.MAX_VALUE;
            }
            return 0;
        }
    }

    //Using index and operating it on the str.
    static public int myAtoi_leetcode_solution(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if (str == null || str.length() == 0) return 0;

        //2. Remove Spaces
        while (str.charAt(index) == ' ' && index < str.length() - 1)
            index++;

        //3. Handle signs
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        //4. Convert number and avoid overflow
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }
}

