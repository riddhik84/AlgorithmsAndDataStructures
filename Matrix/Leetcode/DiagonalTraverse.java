//https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/

//function only code
class Solution {
    //function only code
    public int[] findDiagonalOrder(int[][] matrix) {
        
        //check matrix len
        if(matrix == null || matrix.length == 0){
            return new int[0];
        }
        
        //matrix len
        int N = matrix.length;
        int M = matrix[0].length;
        
        //arrays for matrix
        int[] result = new int[N * M];
        int k = 0;
        ArrayList<Integer> intermediate  = new ArrayList<>();
        
        //traverse all elements of the first row and last column
        for(int d = 0; d < N + M - 1; d++){
            
            //clear the tmp arraylist for each iteration
            intermediate.clear();
            
            // We need to figure out the "head" of this diagonal
            // The elements in the first row and the last column
            // are the respective heads.
            int r = d < M ? 0 : d - M + 1;
            int c = d < M ? d : M - 1;
            
            // Iterate until one of the indices goes out of scope
            // Take note of the index math to go down the diagonal
            while (r < N && c > -1) {
                
                intermediate.add(matrix[r][c]);
                ++r;
                --c;
            }
            
            // Reverse even numbered diagonals. The
            // article says we have to reverse odd 
            // numbered articles but here, the numbering
            // is starting from 0 :P
            if (d % 2 == 0) {
                Collections.reverse(intermediate); //use Collection class reverse method
            }
            
            for (int i = 0; i < intermediate.size(); i++) {
                result[k++] = intermediate.get(i);
            }
        }
        return result;
    }
}
