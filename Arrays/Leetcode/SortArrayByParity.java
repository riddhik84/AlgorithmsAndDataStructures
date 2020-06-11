import java.util.*;

public class SortArrayByParity {
  public static void main(String[] args){
	  int[] arr = {3,1,2,4};
    sortArrayByParity(arr);
    System.out.println(Arrays(arr));
  }
  
  static public int[] sortArrayByParity(int[] A) {
        //i is the loop pointer, j is the location pointer - slow
        for(int i = 0, j = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                j++;
            }
        }
        return A;
    }
}
