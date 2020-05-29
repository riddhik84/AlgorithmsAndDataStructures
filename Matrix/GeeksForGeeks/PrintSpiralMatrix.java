/*
* Description: https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
* Print a given matrix in spiral form
*
* @author Riddhi Kakadia
*
*/ 

class PrintSpiralMatrix {
	public static void main(String[] args){
		int[][] input1 = {
			{1,2,3,4},
				{5,6,7,8},
					{9,10,11,12},
						{13,14,15,16}
		};
		spiralPrint(input1);
		
		System.out.println();
		int[][] input2 = {
			{1,2,3},
				{4,5,6},
					{7,8,9}
		};
		spiralPrint(input2);
	}
	
	
	static void spiralPrint(int[][] matrix){
		int totalrows = matrix.length;
		int totalcolumns = matrix[0].length;
		
		int row = 0;
		int column = 0;
		
		int start = 0; //iterator for start value
		int end = totalrows; //iterator for end value
		
		while(start < end){
			//top row
			while(column < end){
				System.out.print(matrix[row][column++] + " ");
			}
			column--; //column correction
			row++;
			
			//last column
			while(row < end){
				System.out.print(matrix[row++][column] + " ");
			}
			column--;
			row--; //row correction
			
			//bottom row
			while(column >= start){
				System.out.print(matrix[row][column--] + " ");
			}
			column++; //column correction
			row--;
			
			//first column
			while(row > start){
				System.out.print(matrix[row--][column] + " ");
			}
			row++;
			column++;		
			
			start++; //move to inner spiral
			end--; //move to inner spiral
			
			//System.out.println("Row: " + row + " Column: " + column + "Start: " + start + " End: " + end);
		}
	}	
}