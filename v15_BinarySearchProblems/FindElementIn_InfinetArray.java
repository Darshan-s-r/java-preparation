package v15_BinarySearchProblems;

public class FindElementIn_InfinetArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 8, 12, 14, 16, 23, 35, 46, 57};
		int target = 16;
		System.out.println("element in infinet array");
		
		System.out.println(ans(arr, target));

	}
	
	static int ans(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while( target < arr[end]  ) {
			int newStart = end + 1;
			end = end + (end - start + 1) * 2;
			start = newStart;
			
		}
		return binarySearch(arr, target, start, end);
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		int mid = start + (end - start)/2;
		while(start <= end){
			if(arr[mid] == target) {
				return mid;
			}
			if(target > arr[mid]) {
				start = mid+1;
			}
			else {
			end = mid-1;
			}
		}
		return -1 ;
	}

}
