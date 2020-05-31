
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/

class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        //System.out.println(s);
        int len = s.length();
        for (int i = 0, j = len - 1; i < j; i++, j--) {
            while (!isAlphaNumeric(s.charAt(i)) && i < j) {
                ++i;
            }
            while (!isAlphaNumeric(s.charAt(j)) && i < j) {
                --j;
            }
            if (isAlphaNumeric(s.charAt(i)) && isAlphaNumeric(s.charAt(j)) && s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
    static public boolean isAlphaNumeric(char ch) {
        if (Character.isDigit(ch) || Character.isLetter(ch)) {
            return true;
        }
        return false;
    }
}
