package v8_basics;
//import java.util.Arrays;

public class EvenDigitNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, -3413, 6, 4532, 2};
		System.out.println(number(arr));;
   
	}
	
	static int number(int[] arr) {
		int count=0;
		for(int n:arr) {
			
			if(even(n)) {
				count ++;
			}
		}
		return count;
	}
	
	static boolean even(int n) {
		if(n<0) {
			n = n * -1;   //to chane negetive numbers to positive
		}
//		int nuOfDig = digits(n);
		int nuOfDig = (int) (Math.log10(n)) + 1;
		if(nuOfDig % 2== 0) {
			return true;
		}
		return false;
	}
	
	static int digits(int n) {
		int count=0;
		while(n>0) {
			n = n/10;
			count ++;
		}
		return count;
	}
	
	////////////////an other method
	
	
}
