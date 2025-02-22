package v15_BinarySearchProblems;

public class RotatedsortedArrayWithDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr = {1,1,1,1,1, 2,5};
        int target = 5;
       int ele =  search(arr, target);
       System.out.println(ele);
	}
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
          //if start middle and end are all the same
			if(arr[start] == arr[mid] && arr[mid] == arr[end]) {
				//skip the duplicate elements
				//what if the elements at start and end are the pivit
				//check if the start is pivit
				if(arr[start] > arr[start + 1]) {
					return start;
				}
				start ++;
				//check whether en dis pivit
				if(arr[end - 1] > arr[end]) {
					return end -1;
				}
				end--;
			}
			//left side is sorted, so pivit should be in the right
			else if(arr[start] < arr[mid] || arr[start] == arr[mid]  &&  arr[mid] > arr[end]) {
				start = mid + 1;
			} else {
				end = mid -1;
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
