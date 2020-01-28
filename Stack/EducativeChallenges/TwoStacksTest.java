/*
* Implement Two Stacks using one Array
*
* @author Riddhi Kakadia
*
* Time Complexity: O(1)
*/


public class TwoStacksTest {
	public static void main(String[] args){
		//Create an array with max len 8
		TwoStacks<Integer> ts = new TwoStacks<Integer>(8);
		
		ts.push1(1);
		ts.print();
		
		ts.push2(8);
		ts.print();

		ts.push1(2);
		ts.print();

		ts.push2(7);
		ts.print();

		System.out.println("pop1 " + ts.pop1());
		System.out.println("pop2 " + ts.pop2());
		
		System.out.println("pop1 " + ts.pop1());
		System.out.println("pop2 " + ts.pop2());
		
		ts.print();
		
		ts.push2(8);
		ts.push2(7);
		ts.push2(6);
		ts.push2(5);
		ts.push2(4);
		ts.push2(3);
		ts.push2(2);
		ts.print();
		
		System.out.println("pop1 " + ts.pop1());
		System.out.println("pop2 " + ts.pop2());
		
		ts.push2(1);
		ts.push2(0);
		ts.print();
		
		ts.push2(2); //Throws runtime error
	}
}