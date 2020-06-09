import java.util.*;

public class MergeSortedArrayInPlace {
    public static void main(String[] args){
      int[] nums1 = {1,2,3,0,0,0};
      int m = 3;
      int nums2 = {2,5,6};
      int n = 3;

      merge(nums1, m, nums2, n);

      System.out.println(Arrays.toString(nums1[]));
    
    }

    //in-place solution
    //it requires additional space of O(m) to store numbers from nums1
    //59 / 59 test cases passed.
    //Status: Accepted
    //Runtime: 0 ms
    //Memory Usage: 39.8 MB
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_tmp = new int[m]; //additional space
        for(int i = 0; i < m; i++){
            nums1_tmp[i] = nums1[i];
        }
        
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1_tmp.length && j < nums2.length){
            if(nums1_tmp[i] < nums2[j]){
                nums1[k++] = nums1_tmp[i++];
            } else {
                nums1[k++] = nums2[j++];
            }
        }
        
        while(i < nums1_tmp.length){
            nums1[k++] = nums1_tmp[i++];
        }
        
        while(j < nums2.length){
            nums1[k++] = nums2[j++];
        }
    }
}
