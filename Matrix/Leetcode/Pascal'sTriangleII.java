class Solution {
    //Triky question and solution - 5ms (leetcode)
    public List<Integer> getRow(int rowIndex) {
        /* logic to calculate the given row
         rowIndex = 6.
            1st: 1=1
            2nd: 6= 6 / 1
            3rd: 15=6x5 / (1x2)
            4th: 20=6x5x4 / (1x2x3)
            5th: 15=6x5x4x3 / (1x2x3x4)
            6th: 6 =6x5x4x3x2 / (1x2x3x4x5)
            7th: 1 =6x5x4x3x2x1 / (1x2x3x4x5x6)
        */
        List<Integer> output = new ArrayList<>();
        output.add(1);
        
        if(rowIndex == 0)
            return output;
        
        //length of the given row will be here index+1 (leetcode constraint)
        int index = rowIndex;
        long cur = 1;
        for(int i = 1; i < rowIndex+1; i++){
            cur = cur * index;
            cur = cur / i;
            
            output.add((int)cur);
            System.out.println((int)cur);
            index--;
        }
        return output;
    }
}
