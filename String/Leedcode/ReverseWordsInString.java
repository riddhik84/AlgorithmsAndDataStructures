class Solution {
    //leetcode sumitter solution - 0 ms
    public String reverseWords(String s) {
        if(s == null ) return s;
        StringBuilder ans = new StringBuilder();
        
        for(int i=s.length()-1, j; i>=0; i--){
            if(s.charAt(i) != ' '){
                j=i;
                i = s.lastIndexOf(' ', i);
                ans.append(s, i+1, j+1).append(' ');
            }
        }
        
        if(ans.length() > 0)
        ans.deleteCharAt(ans.length()-1);
        
        return ans.toString();
    }
    
    //my solution - takes more time - 7 ms
    public String reverseWords_(String s) {
        if(s == null || s.length() == 0)
            return s;
        
        //replace whitespace using regex
        s = s.replaceAll(" +", " "); //very useful regex
        //System.out.println(s);
        
        //split the string with " " single space
        String[] values = s.split(" ");
        
        //reverse the string array using double pointer
        for(int i = 0, j = values.length - 1; i < j; i++, j--){
            String tmp = values[i];
            values[i] = values[j];
            values[j] = tmp;
        }
        //create string builder and add reversed strings from array and return
        StringBuilder result = new StringBuilder();
        for(String ss : values){
            result.append(ss).append(" ");
        }
        
        return result.toString().trim();
    }
}
