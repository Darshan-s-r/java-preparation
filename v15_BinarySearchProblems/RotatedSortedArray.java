package v15_BinarySearchProblems;

//https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

//it will not work in array containing duplicate element

public class RotatedSortedArray {

	public static int search(int[] arr, int target) {
        int pivot = pivot(arr);
        if(pivot == -1) {
        	return binary_search( arr, target,  0, arr.length-1);
        }
        
        if(arr[pivot] == target) {
        	return pivot;
        }
       
        if (target >= arr[0]) {
        	return binary_search(arr,target,  0, pivot - 1);
        }
        return binary_search( arr, target,  pivot + 1, arr.length-1);

    }

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {3, 4, 5, 7, 8, 2};
        int target = 2;
       int ele =  search(arr, target);
       System.out.println(ele);
        
      
	}
	
	static int pivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		while(start <= end) {
			 mid = start + (end - start)/2;
			if((start < end) && arr[mid] > arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) {
				return mid - 1;
			}
//			else if(arr[mid] > arr[end]) {
//				start = mid;
//			}
			else if(arr[mid] <= arr[start]) {
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
    public static int binary_search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // Target not found
    }
	

}
