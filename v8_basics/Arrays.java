package v8_basics;

import java.util.Scanner;
//import java.util.Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		
		int[] arr2 = {1, 2, 3, 4, 5};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(arr));
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//Advanced for loop
		for(int i : arr) {
			System.out.println(i);
		}


	}
	
	
	

}

