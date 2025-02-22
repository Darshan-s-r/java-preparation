package v8_basics;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Armstrong");
  int n = sc.nextInt();
  System.out.println(isArmstrong(n));
	}
	
	static boolean isArmstrong(int n) {
		int original = n;
		int sum=0;
		while(n>0) {
			int remainder = n%10;
			n = n/10;
			sum = sum + remainder * remainder * remainder;
			
		}
		if(original == sum) {
			return true;
		}
		return false;
	}

}
