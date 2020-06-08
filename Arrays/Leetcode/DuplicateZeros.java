import java.util.*;

class Solution {
    public static void main(String[] args){
        int[] input = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(input));    

        duplicateZeros(input);
        
        System.out.println(Arrays.toString(input));  
    }
    
    //solve in-place
    //in-place solution with additional array space
    //leetcode execution: 1 ms
    static public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                zeros++;
        }
        
        if(zeros > 0){
            int[] tmp = new int[arr.length + zeros];
            
            for(int i = 0, j = 0; j < tmp.length; ){
                if(arr[i] != 0){
                    tmp[j++] = arr[i++];
                } else {
                    tmp[j++] = arr[i++];
                    tmp[j++] = 0;
                }
            }
            
            for(int i = 0; i < arr.length; i++){
                arr[i] = tmp[i];
            }
        }
    }
}
