class Solution {
    //leetcode submitter's solution - 2ms - better approach
    public String reverseWords(String s) {
        //convert in char array first
        char[] chr = s.toCharArray();
        int start=0;
        for(int i=0; i<chr.length; i++){
            if(chr[i]==' '){
                revert(chr, start, i-1);
                start = i+1;
            }
        }
        
        //last word need to be reversed
        revert(chr, start, s.length()-1);
        return new String(chr);
    }
    void revert(char[] chr, int i, int j){
        while(i<j){
            char t = chr[i];
            chr[i++] = chr[j];
            chr[j--] =t;
        }
    }
    
    //my initial solution, leetcode accepted - 39 ms
    public String reverseWords_(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        //split string with " " single space
        String[] values = s.split(" ");
        
        //iterate over the array of string and reverse each string in array
        //add the reversed string in a stringbuilder
        for(int k = 0; k < values.length; k++){
            //reverse string
            String current = values[k];
            System.out.println(current);
            
            char[] current_arr = current.toCharArray();
            int i = 0;
            int j = current_arr.length - 1;
            while(i < j){
                char tmp = current_arr[i];
                current_arr[i] = current_arr[j];
                current_arr[j] = tmp;
                i++;
                j--;
            }
            sb.append(current_arr).append(' ');
        }
        
        return sb.toString().trim();
    }
}
