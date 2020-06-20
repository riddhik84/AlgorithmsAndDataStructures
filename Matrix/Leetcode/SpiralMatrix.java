class Solution {
    
    //leetcode tutorial solution approach
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        //check for null
        if(matrix == null || matrix.length == 0){
            return result;
        }        
        
        int r1 = 0, r2 = matrix.length - 1;// row boundries
        int c1 = 0, c2 = matrix[0].length - 1; //column boundries
        
        while (r1 <= r2 && c1 <= c2) {
            
            //right
            for (int c = c1; c <= c2; c++) 
                result.add(matrix[r1][c]);
            
            //down
            for (int r = r1 + 1; r <= r2; r++) 
                result.add(matrix[r][c2]);
            
            
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) 
                    result.add(matrix[r2][c]);
                
                for (int r = r2; r > r1; r--) 
                    result.add(matrix[r][c1]);
            }
            
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return result;
    }
    
    //easy to understand and easy to read approach - leetcode submission
    public List<Integer> spiralOrder(int[][] matrix){
		
		List<Integer> result = new ArrayList<Integer>();

		if(matrix==null || matrix.length==0){
			return result;
		}

		int rows = matrix.length;
		int cols =  matrix[0].length;

		int row = 0;
		int col = 0;

		while(row<rows && col<cols){

            //right
			for(int i=col;i<cols;i++){
				result.add(matrix[row][i]);
			}
			row++;

            //down
			for(int i=row;i<rows;i++){
				result.add(matrix[i][cols-1]);
			}
			cols--;

            //left
			if(row<rows){
				for(int i=cols-1;i>=col;i--){
					result.add(matrix[rows-1][i]);
				}
                rows--;
			}
			
            //up
			if(col<cols){
				for(int i=rows-1;i>=row;i--){
					result.add(matrix[i][col]);
				}
                col++;
            }	
			
		}

		return result;
	}
    
}
