/*
* Generate binary numbers from 1 to any given number "n"
* Solution using Queue
*
* @author Riddhi Kakadia
*
* Time complexity: O(n)
*/

public class GenerateBinaryNumbers {
	public static void main(String[] args){
		int number = 10;
		printBinaryNumbers(number);
	}
	
	static void printBinaryNumbers(int number){
		String[] result = new String[number];
		Queue<String> queue = new Queue<String>();
		
		queue.enqueue("1");
		
		for(int i = 0; i < number; i++){
			result[i] = queue.dequeue();
			String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.enqueue(s1);
            queue.enqueue(s2);
		}
		
		for(String s : result){
			System.out.println(s);
		}
	}
}