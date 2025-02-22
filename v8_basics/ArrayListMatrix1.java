package v8_basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMatrix1 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		//Initializing every inner array list
		for(int i=0;i<3;i++) {
			matrix.add(new ArrayList<>());
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			matrix.get(i).add(sc.nextInt());
		}
		}

		System.out.println(matrix);
	}
	}


