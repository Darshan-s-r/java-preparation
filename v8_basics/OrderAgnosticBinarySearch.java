package v8_basics;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 12, 13, 54, 335, 3246, 345357, 121118};
		int[] arr2 = {9, 5, 4, 2, -9, -43, -88};
		int target = -9;
		System.out.println(search(arr2, target));

	}

	static int search(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		boolean isAsending = (arr[start] < arr[end]);
		
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			if(isAsending) {
				if(target > arr[mid]) {
					start = mid + 1;
				}
				else if(target < arr[mid]) {
					end = mid -1;
				}
			}
			else {
				if(target < arr[mid]) {
					start = mid + 1;
				}
				else if(target > arr[mid]) {
					end = mid -1;
				}
			}
			
				
		}
		return -1;
		
	}
}
