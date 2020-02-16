/*
* Description: https://www.geeksforgeeks.org/rotate-matrix-elements/
* Clockwise rotation of elements in a matrix
*
* @author Riddhi Kakadia
*
*/ 

class MatrixRotationClockwise {
	public static void main(String[] args){
		int[][] input1 = {
			{1,2,3},
				{4,5,6},
					{7,8,9}
		};
		int rotation = 1;
		rotateMatrix(input1, rotation);
		
		printMatrix(input1);
	}
	
	static void rotateMatrix(int[][] matrix, int rotation){
		while(rotation > 0){
			rotation(matrix);
			rotation--;
		}
	}
	
	static void rotation(int[][] matrix){
		int totalRows = matrix.length;
		int totalColumns = matrix[0].length;
		
		/*if(totalColumns != totalRows){
			throw new IllegalArgumentException("Cannot rotate NxM matrix");
		}*/
		
		//Move row
		int startRow = 0;
		int startColumn = totalColumns - 1;
		//System.out.println("startRow, startColumn : " + startRow + " " + startColumn);
		
		int element = matrix[startRow][startColumn];
		//System.out.println("element : " + element);
		
		while(startColumn > 0){
			matrix[startRow][startColumn] = matrix[startRow][--startColumn]; //use --x here instead of x--
			
			//System.out.println("startRow, startColumn : " + startRow + " " + startColumn);
			//System.out.println("matrix[startRow][startColumn] : " + matrix[startRow][startColumn]);
		}
		int startRow = 0;
		int startColumn = totalColumns - 1;
		
		
		

	}
	
	static void printMatrix(int[][] matrix){
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}