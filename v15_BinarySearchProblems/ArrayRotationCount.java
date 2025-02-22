package v15_BinarySearchProblems;

public class ArrayRotationCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] arr = {6, 7, 9, 2, 4, 5};
	    //hear it is pivot + 1 bcz array index starts from 0  ans count is start from 1
	    int count = pivot(arr)+1;
       System.out.println(count);
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
	

}
