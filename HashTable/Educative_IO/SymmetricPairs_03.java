import java.util.*;

public class SymmetricPairs_03 {
	
	public static void main(String[] args){
		int[][] arr = {{1, 2}, {3, 4}, {5, 9}, {4, 3}, {9, 5}};
		
		ArrayList<ArrayList<Integer>> result = findSymmetricPairs(arr);
		
		for(ArrayList<Integer> al : result){
			for(Integer a : al){
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
	public static ArrayList<ArrayList<Integer>> findSymmetricPairs(int[][] array){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int[] arr : array){
			if(map.containsKey(arr[1])){
				int value = map.get(arr[1]);
				if(value == arr[0]){
					ArrayList<Integer> list = new ArrayList<>();
					list.add(arr[0]);
					list.add(arr[1]);
					result.add(list);
				}
			} else {
				map.put(arr[0], arr[1]);
			}
		}
		return result;
	}
}