/*
* Create a stack where min() funtion gives minimum value in O(1) time
*
* @author Riddhi Kakadia
*
* Time Complexity: O(1)
*/

//Create 2 stacks: 1 for mainStack and second as minStack
//Keep track of all the min elements when a new element is pushed to stack
//Push: If the pushed element is less than existing min
// -- push the new min element to minStack
// -- change the value of current min
//Pop: If the pop element is equal to current min
// -- pop element from minStack
// -- change the value of current min
//Min: will return the value of current min 


import java.util.Stack;

public class MinStack {
	Stack<Integer> mainStack;
	Stack<Integer> minStack;
	int min;
    
    //constructor
    public MinStack() {
		mainStack = new Stack<>();
		minStack = new Stack<>();
		min = Integer.MAX_VALUE;
    }
    //removes and returns value from stack
    public Integer pop(){
		int value = mainStack.peek();
		if(value == min){
			minStack.pop();
			min = minStack.peek();
		}
		return mainStack.pop();
    }
    //pushes value into the stack
    public void push(Integer value){
		if(value < min){
			minStack.push(value);
			min = value;
		}
		mainStack.push(value);
    }
	
    //returns minimum value in O(1)
    public int min(){
       return min;
    }
}