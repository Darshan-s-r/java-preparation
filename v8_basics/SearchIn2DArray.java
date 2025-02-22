package v8_basics;
import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6, 7},
				{8, 9, 0}
		};
		int target = 4;
       System.out.println(Arrays.toString(search(arr, target)));
	}
	
	static int[] search(int[][] arr, int target) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					if(target == arr[i][j]) {
						return new int[] {i,j};
					}
				}
				
			}
			return new int[] {-1,-1};
		
	}

}
