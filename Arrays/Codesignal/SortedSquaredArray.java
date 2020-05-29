//https://www.youtube.com/watch?v=4eWKHLSRHPY

import java.util.Arrays;

public class SortedSquaredArray {
  public static void main(String[] args) {
   int[] input = {-3,-1, 0, 1,2,5,9,10};
   //not in place
   int[] output = sortedArray(input);
   System.out.println(Arrays.toString(output));
  }
  
  static int[] sortedArray (int[] arr){
    //when len is > 1
    int[] output = new int[arr.length];
    int left = 0;
    int right = arr.length - 1;
    int j = arr.length - 1;
    while(left < right){
      int l = arr[left] * arr[left];
      int r = arr[right] * arr[right];
      if(l > r){
        output[j] = l;
        j--;
        left++;
        
      } else if (r > l){
        output[j] = r;
        j--;
        right--;
        
      } else {
         output[j] = l;
        j--;
        left++;
        output[j] = r;
        j--;
        right--;
      }
    }  
    return output;
  }
}
