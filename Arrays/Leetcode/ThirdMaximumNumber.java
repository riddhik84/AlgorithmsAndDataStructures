pulic class Solution {

    public static void main(String[] args){
      int[] arr = {3,2,1};
      System.out.println("Third max: " + thirdMax(arr)); //ans 1
    }

    static public int thirdMax(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
            }
            long first = Long.MIN_VALUE;
            long second = Long.MIN_VALUE;
            long third = Long.MIN_VALUE;

                for(int i=0;i<nums.length;i++){
                    int val = nums[i];
                    if(val > first){
                        third = second;
                        second = first;    
                        first = val;
                    }else if(val < first){
                        if(val > second){
                            third = second;
                            second = val;
                        }else if(val < second){
                            if(val > third){
                                third = val;
                            }
                        }
                    }
                }
                if(third==Long.MIN_VALUE){
                    return ((int)first); //if third max do not exist, return max
                }
                return ((int)third);
    }
}
