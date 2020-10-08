

public class PowerOfThree {
	public static void main(String[] args){
		int n = 9;
		boolean result = isPowerOfThree_1(n);
		System.out.println("Result 1: " + result);
		
		result = isPowerOfThree_2(n);
		System.out.println("Result 2: " + result);
	}
	
	//Method 1
	//Generic function to find if any number is power of given (3, 4, 5 etc)
	//Replace powerOf for the power of number for example here power of 3
	static public boolean isPowerOfThree_1(int n) {
		int powerOf = 3;
        if (n < 1) {
            return false;
        }

		//check the remainder of division with powerOf till remainder is not 0
		//keep updating n with divisor for each loop
        while (n % powerOf == 0) {
			System.out.println("n % 3: " + n % 3);
			System.out.println("n / 3: " + n / 3);
            n /= powerOf;
        }

		//n should be 1
        return n == 1;
    }
	
	//Method 2
	//Works only for finding a number power of 3
	static public boolean isPowerOfThree_2(int n) {
        if(n <= 0){
            return false;
        }
        /* The maximum power of 3 value that  
           integer can hold is 1162261467 ( 3^19 ) 
		   Applicable only when finding power of 3*/
        int max = (int)Math.pow(3, 19);
        return max % n == 0;
    }
	
    //Solution without loops for power of 4
    public boolean isPowerOf(int num) {
        return num > 0 &&
            (num & (num - 1)) == 0 &&
            (num & 0x55555555) != 0;
    }	
	
}
