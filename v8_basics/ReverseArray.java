package v8_basics;

import java.util.Collections;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 5, 7, 1, 3, 8};
		System.out.println(Arrays.toString(arr));
  System.out.println(Arrays.toString(reverse(arr)));
	}
	
	static int[] reverse(int[] arr) {
		int start=0;
		int end = arr.length-1;
		while(start < end) {
//			swap(arr,start, end);
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
            start++;
            end--;
		}
		return arr;
	}

}
