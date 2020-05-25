//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/

import java.util.HashMap;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "aab";
        int c1 = firstUniqueChar__string(input);
        System.out.println(c1);

        int c2 = firstUniqueChar_HashMap(input);
        System.out.println(c2);

    }

    //check first and last index of each character. If it is same, there is only 1 occurance of that character in the string.
    //104 / 104 test cases passed.
    //Status: Accepted
    //Runtime: 22 ms
    //Memory Usage: 40.4 MB
    static public int firstUniqueChar__string(String s) {
        if (s == null || s.length() < 1) {
            return -1;
        }
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                return i;
            }
        }
        return -1;
    }

    //Use hashmap to store the counts of each character. Loop thru the hashmap and check the index of first non-repeating char.
    //104 / 104 test cases passed.
    //Status: Accepted
    //Runtime: 28 ms
    //Memory Usage: 39.8 MB
    static public int firstUniqueChar_HashMap(String s) {
        if (s == null || s.length() <= 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int count = map.get(ch);
                map.put(ch, ++count);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == 1) {
                return i;
            }
        }
        return -1;
    }

    //Fastest solution shows in leetcode solutions runtime timeline
    static public int firstUniqueChar_leedcode_(String s) {
        int result = s.length();

        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && index == s.lastIndexOf(c)) {
                result = Math.min(result, index);
            }
        }
        return result == s.length() ? -1 : result;
    }
}
