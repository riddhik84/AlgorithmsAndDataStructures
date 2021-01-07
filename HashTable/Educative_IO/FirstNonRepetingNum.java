import java.util.HashMap;

public class FirstNonRepetingNum {
	public static void main(String[] args){
		int[] arr = {2, 54, 7, 2, 6, 54};
		int num = findNonRepeatingNum(arr);
		
		System.out.println(num);
	}
	
	public static int findNonRepeatingNum(int[] arr){
		int num = 0;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : arr){
			if(map.containsKey(i)){
				int val = map.get(i);
				map.put(i, val + 1);
			} else {
				map.put(i, 1);
			}
		}
		
		for(int i : arr){
			if(map.get(i) == 1){
				num = i;
				break;
			}
		}
		
		return num;
	}
	
}