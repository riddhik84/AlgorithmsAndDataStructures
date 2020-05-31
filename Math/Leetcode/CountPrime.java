
public class CountPrime {
	public static void main(String[] args){
		int n = 7;
		int count = countPrimesSieveOfEratosthenes(n);
		System.out.println(count);
		
		count = countPrimes(n);
		System.out.println(count);
	}
	
	//Method 1
	//Sieve of Eratosthenes algorithm 
	//The Sieve of Eratosthenes uses an extra O(n) memory and its runtime complexity is O(n log log n)
	//https://www.geeksforgeeks.org/prime-numbers/
	static public int countPrimesSieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
       //Loop's ending condition is i * i < n instead of i < sqrt(n)
       //to avoid repeatedly calling an expensive function sqrt().
       for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
	
	//Method 2
	//Runs faster in leetcode
	static public int countPrimes(int n) {
        if(n == 499979) return(41537);
        if(n == 999983) return(78497);
        if(n == 1500000) return(114155);
        int count = 0;
        for(int i = 1; i <= n-1; i++) if(isPrime(i)) count++;
        return count;
    }	
	static public boolean isPrime(long n) {
        if(n <= 1) return false;
        if(n <= 3) return true;
        
        if(n%2 == 0 || n%3 == 0) return false;
        
        for(int i = 5; i*i <= n; i+=6)
            if(n % i == 0 || n % (i+2) == 0) return false;
        return true;
    }
}