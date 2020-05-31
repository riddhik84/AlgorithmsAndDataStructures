//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        //check for null and empty array
        if (strs != null && strs.length > 0 && strs[0].length() > 0) {
            //check for length 1. There is not other string to compare
            if (strs.length == 1) {
                return strs[0];
            }
            //compare if 2 or more strings
            int j;
            for (int i = 0; i < strs[0].length(); i++) {
                char ch = strs[0].charAt(i);
                for (j = 1; j < strs.length; j++) {
                    if (i < strs[j].length()) {
                        if (strs[j].charAt(i) != ch) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (j == strs.length)
                    prefix = prefix + ch + "";
                else
                    break;
            }
        }
        return prefix;
        
    }
}
