//https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/

public class ValidMountainArray {
    public static void main(String[] args){
	    int[] arr1 = {0,2,3,3,5,2,1,0}; //invalid
      System.out.println(validMountainArray(arr1));
      
      int[] arr2 = {0,2,3,4,5,2,1,0}; //valid
      System.out.println(validMountainArray(arr2));
    }

    static public boolean validMountainArray(int[] A) {
        if(A.length < 3){
            return false;
        }
        
        int len = A.length;
        int i = 0;
        
        //mountain up
        while(i+1 < len && A[i] < A[i+1])
            i++;
        
        //check peak value. It should not be first of last value of the array
        if(i == 0 || i == len - 1)
            return false;
        
        //mountain down
        while(i+1 < len && A[i] > A[i+1])
            i++;
        
        //check if i loops till the end of the array
        return i == len-1; 
    }
}
