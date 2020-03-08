/*
* Solve Look and Say problem
*
* @author Riddhi Kakadia
*
*/

class LookAndSay {
	public static void main(String[] args){
		for(int i = 1; i <= 3; i++){
			System.out.println(printLookAndSay(i));
		}
	}
	
	static String printLookAndSay(int count){
		if(count < 1){
			throw new IllegalArgumentException("Invalid Input");
		}
		StringBuilder output = new StringBuilder("");
		if(count == 1){
			output.append("1");
		} else if (count == 2){
			output.append("11");
		} else {
			StringBuilder current = new StringBuilder("11");
			//System.out.println(tmp.toString());
			
			while(count > 2){
				current.append("$");
				int c = 1;

				while((i < current.length()) && (current.charAt(i) == current.charAt(i++))){
						c++;
					} 
					output.append(c);
					output.append(current.charAt(i));
					c = 1;

				System.out.println("final output: " + output.toString());
				
				current = output;
				count--;
			}
		}
		return output.toString();
	}
}