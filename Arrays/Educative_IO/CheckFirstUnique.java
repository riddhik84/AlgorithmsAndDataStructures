
import java.util.*;

//Returns first unique integer from array
class CheckFirstUnique {
	public static void  main(String args[]) {

    int[] arr = {2, 54, 7, 2, 6, 54};
	System.out.println(Arrays.toString(arr));
	
    int unique = findFirstUnique(arr);
    System.out.print("First Unique in an Array: " + unique);

  }
  public static int findFirstUnique(int[] arr) {
	  HashMap<Integer, Integer> map = new HashMap<>();
	  for(int i = 0; i < arr.length; i++){
		  int current = arr[i];
		  if(map.containsKey(current)){
			  int counter = map.get(current);
			  map.put(current, ++counter);
		  } else {
			  map.put(current, 1);
		  }
	  }
	  
	  //DO NOT USE THIS for this algorithm. It returns 6 as answer instead of 7
	  for(Map.Entry<Integer, Integer> mapentry : map.entrySet()){
		  int key = mapentry.getKey();
		  int value = mapentry.getValue();
		  
		  System.out.println("Key: " + key + " value: " + value);
	  }
	  
	  //Use this method for map iteration. Because we need to find first non repeating from input array's sequence
	  //Iterate array size not map size here.
	  for (int i = 0; i < arr.length; i++){
            if (map.get(arr[i]) == 1) 
                return arr[i]; 
	  }
	 
    return - 1;
  }  
}