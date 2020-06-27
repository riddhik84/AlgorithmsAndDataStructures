//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
//difficulty: medium

class Solution {
    
    //5ms solution
    public int lengthOfLongestSubstring(String s) {        
        int l = 0, r = 0, max = 0;
        int[] inds = new int[128];
        Arrays.fill(inds, -1);
        
        while (r < s.length()) {
            char c = s.charAt(r);
            if (inds[c] != -1) {
                max = Math.max(max, r - l);
                int end = inds[c] + 1;
                while (l < end) {
                    inds[s.charAt(l)] = -1;
                    l++;
                }
            }
            inds[c] = r;
            r++;
        }
        
        return Math.max(max, r - l);
    }
    
    //11ms solution
    public int lengthOfLongestSubstring_(String s) {
        //check null and len
        if (s == null || s.length() == 0) 
            return 0;
        
        //keep track of chars    
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                //System.out.println(j);
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            
            //System.out.println(max + " " + (i-j+1));
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}
