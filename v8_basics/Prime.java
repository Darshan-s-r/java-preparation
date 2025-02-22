package v8_basics;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPrime(n));

	}
	
	static boolean isPrime(int n) {
		if(n<1) {
			return false;
		}
		int c=2;
		while(c*c<n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}

}
