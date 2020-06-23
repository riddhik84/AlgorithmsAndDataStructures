//https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
            
        if(numRows == 0){
            return output;
        }
        
        output.add(new ArrayList<>());
        output.get(0).add(1);
        
        for(int rowNum = 1; rowNum < numRows; rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prev = output.get(rowNum - 1);
            
            row.add(1); //first
            
            for(int j = 1; j < rowNum; j++){
                row.add(prev.get(j-1) + prev.get(j));
            }
            
            row.add(1); //last
            
            output.add(row);
        }
        return output;
        
    }
}
