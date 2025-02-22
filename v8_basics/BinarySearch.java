package v8_basics;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 12, 13, 54, 335, 3246, 345357, 121118};
		int target = 3246;
		System.out.println(search(arr, target, 0, arr.length-1));

	}
	static int search(int[] arr, int target, int start, int end) {
		if(start <= end) {
		if(arr.length == 0) {
			return -1;
		}
//		int mid = (start + end)/2;
		int mid = start + (end - start)/2;
		if(arr[mid] == target) {
			return mid;
		}
		if(target > arr[mid]) {
			return search(arr, target, mid+1, end);
		}
		if(target < arr[mid]) {
			return search(arr, target, start, mid-1);
		}
		
	}
		return -1;
	}
	
	static int search1(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			
			else	if(target > arr[mid]) {
				start = mid + 1;
			}
			else if(target < arr[mid]) {
				end = mid -1;
			}
		}
		return -1;
		
	}

}
