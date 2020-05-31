//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/882/

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[128]; //need array of 128 (0-127) chars to store all ascii values
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)] = ++arr[s.charAt(i)];
            arr[t.charAt(i)] = --arr[t.charAt(i)];
        }

        for (int i = 97; i <= 122; i++) { //check for lower case alphabets
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
        
    }
}
