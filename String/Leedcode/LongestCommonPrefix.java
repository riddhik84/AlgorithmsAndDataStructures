//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/

class LongestCommonPrefix {
    //Easy and Fast solution - this must be used
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        for(int i = 0; i < strs[0].length(); i++){
            
            //Take first char of first string in the list as prefix by default
            String prefix = strs[0].substring(0, i+1);
            
            //check the current prefix in all other strings in the list
            for(int j= 1; j < strs.length; j++) {
                if(!strs[j].startsWith(prefix)) { //need to use String class method startsWith()
                    //If the prefi do not match with any of the strings that means prefix - (prefixlen - 1) is match for all strings
                    //so return that as prefix
                    return prefix.substring(0, prefix.length()-1);
                }
            }
        }
        return strs[0];
    }
    
    //Good solution but bit slow to execute
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
