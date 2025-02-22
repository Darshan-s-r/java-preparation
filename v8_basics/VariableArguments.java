package v8_basics;

import java.util.Arrays;

public class VariableArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sum(10, 2, 2, 3);
       string(1, 5,"darshan", "dar", "sd");
	}
	
	static void sum(int ...v) {
		int sum = 0;
		for(int i=0;i<v.length;i++) {
			sum += v[i];
		}
		System.out.println(sum);
		
	}

	static void sum2(int a, int ...v) {
		int sum = 0;
		for(int i=0;i<v.length;i++) {
			sum += v[i];
		}
		sum += a;
		System.out.println(sum);
		
	}
	
	static void string(int a, int b, String ...s) {
		System.out.println(Arrays.toString(s));
		System.out.println(a +" "+ b);
		
	}
}
