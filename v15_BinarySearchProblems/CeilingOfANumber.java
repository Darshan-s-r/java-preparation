package v15_BinarySearchProblems;

public class CeilingOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr = {2, 4, 6, 8, 12, 14, 15};
   int target = 1;
   System.out.println(ceiling(arr, target));
	}
	
	static int ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		if(target > arr[end]) {
			return -1;
		}
		while(start <= end) {
			int mid = start + (end - start)/2;
			if(arr[mid] == target) {
				return target;
			}
			if(target > arr[mid]) {
				start = mid+1;
			}
			else if(target < arr[mid]) {
				end = mid-1;
			}
//			if(start > end) {
//				return arr[start];
//			}
		}
		return arr[start];
	}

}
