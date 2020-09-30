class KthLargestNumber {
    //runs in 5 ms
    public int findKthLargest_(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : nums){
            queue.add(i);
        }
        
        for(int i = 0; i < k-1; i++){
            queue.poll();
        }
        
        return queue.poll();
    }
    
    //runs in 1 ms
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
    
    
}
