//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/

class Solution {
  public static void main(String[] args){
    int[] nums = {3,2,2,3};
    int val = 2;
    
    int len = removeElement(nums, val);
    
    for(int i = 0; i < len; i++){
      System.out.print(i + " ");
    }
    System.out.println();
  
  }

  //113 / 113 test cases passed.
  //Status: Accepted
  //Runtime: 0 ms
  //Memory Usage: 37.5 MB
  static public int removeElement(int[] nums, int val) {
        int i = 0;
        //replace array with valid elements when val is found in the array.
        //No need to write a logic to move val's at the end of the array as far as we are keeping track of valid length here using i.
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                ++i;
            }
        }
        return i; //valid array length
    }
}
