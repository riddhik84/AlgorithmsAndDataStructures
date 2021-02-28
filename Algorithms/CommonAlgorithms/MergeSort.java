/* Merge sort algorithm
Divide and Quaker
Time complexity: O(n logn n)
*/
import java.util.*;
/* Java program for Merge Sort */

public class MergeSort {

	public static void main(String[] args){
		int[] input = {12, 11, 13, 5, 6, 7};
		System.out.println(Arrays.toString(input));
		
		mergeSort(input);
		
		System.out.println(Arrays.toString(input));
	}
	
	public static void mergeSort(int[] array){
		sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
	}
	
	//sort left and right arrays
	public static void sort(int[] array, int left, int right){
		if(left < right){
			int mid = left + (right - left)/2;
			sort(array, left, mid);
			sort(array, mid + 1, right);
			
			merge(array, left, mid, right);
		}
	}
	
	//merge two sorted arrays
	public static void merge(int[] array, int left_, int mid, int right_){
		int left[] = new int[mid-left_ + 1];
		int right[] = new int[right_- mid];
		int l = left.length;
		int r = right.length;
		
		int i = 0;
		int j = 0;
		//Important condition for this algorithm - k = left_; and not k = 0;
		int k = left_;
		
		//copy elements in tmp arrays
		for(int x = 0; x < l; x++){
			left[x] = array[left_ + x];
		}
		for(int x = 0; x < right.length; x++){
			right[x] = array[mid + 1 + x];
		}
		
		//merge two sorted arrays
		while(i < l && j < r){
			if(left[i] < right[j]){
				array[k++] = left[i++];
			} else {
				array[k++] = right[j++];
			}
		}
		while(i < l){
			array[k++] = left[i++];
		}
		while(j < r){
			array[k++] = right[j++];
		}	
		System.out.println(Arrays.toString(array));
	}
}