/*
* Test class for MinStack implementation
*
* @author Riddhi Kakadia
*
*/

public class MinStackTest {
	public static void main(String[] args){
		int[] input1 = {10,3,4,2,7,9,12,4,1,6,9};
		MinStack minstack1 = new MinStack();
		for(int i : input1){
			minstack1.push(i);
		}
		System.out.println("Mininum value in minstack1 is : " + minstack1.min()); // output: 1
		
		int[] input2 = {10,65,47,22,75,98,12,42,65,91};
		MinStack minstack2 = new MinStack();
		for(int i : input2){
			minstack2.push(i);
		}
		System.out.println("Mininum value in minstack2 is : " + minstack2.min());// output: 10
	}
}