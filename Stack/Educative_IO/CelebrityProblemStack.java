import java.util.*;

public class CelebrityProblemStack {
	public static void main(String[] args){
		int [][] party1 = {
          {0,1,1,0},
          {1,0,1,1},
          {0,0,0,0},
          {0,1,1,0},   
        };
		System.out.println(findCelebrity(party1, 4));
		
		int [][] party2 = {
          {0,1,1,0},
          {1,0,1,1},
          {0,0,0,1},
          {0,1,1,0},   
        };
		System.out.println(findCelebrity(party2,4));


        int [][] party3 = {
          {0,0,0,0},
          {1,0,0,1},
          {1,0,0,1},
          {1,1,1,0},   
        };
        System.out.println(findCelebrity(party3,4));
		
	}
	
	public static int findCelebrity(int[][] party, int numPeople){
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		int celebrity = -1;
		
		//add all people in the stack
		for(int i = 0; i < numPeople; i++){
			stack.push(i);
		}
		
		//check each member knows who else row wise
		while(!stack.isEmpty()){
			int x = stack.pop();
			if(stack.isEmpty()){
				celebrity = x;
				break;
			}
			int y = stack.pop();
			
			if(aqStatus(party, x, y)){
				stack.push(y);
			} else {
				stack.push(x);
			}
		}
		//check if the celebrity is actually a celebrity
		for(int j = 0; j < numPeople; j++){
			//Celebrity knows no one while everyone knows celebrity
            if (celebrity != j && (aqStatus(party, celebrity, j) || !(aqStatus(party, j, celebrity)))) 
				return -1;
		}
		return celebrity;
		
	}
	
	public static boolean aqStatus(int[][] party, int x, int y){
		if(party[x][y] == 1)
			return true;
		else
			return false;
	}
}