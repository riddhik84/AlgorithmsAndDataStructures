/*
input matrix 
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output: [1,2,3,6,5,4,7,8,9]

print row 1 fwd, row 2 bkwd, row 3 fwd

*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        //check for null
        if(matrix == null || matrix[0].length == 0){
            return new ArrayList<>();
        }
        
        int M = matrix.length; //total rows
        int N = matrix[0].length; //total columns
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        
        int k = 0; //counter for result array
        
        //check if i % 2 is even. Use j++ for even rows, use j-- for odd rows
        while (i < M){
            if(i % 2 == 0){
                for(j = 0; j < N; j++){
                    result.add(matrix[i][j]);
                }
            } else {
                for(j= N - 1; j >= 0; j--){
                    result.add(matrix[i][j]);
                }    
            }
            i++;
        }
        return result;
    }
}
