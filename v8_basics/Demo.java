package v8_basics;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
//  System.out.println(sc.nextLine());
//  
//  Integer num = 87633;
// System.out.println(num.compareTo(87634)); 
  
// int num1 = sc.nextInt();
// int num2 = sc.nextInt();
// int num3 = sc.nextInt();
// 
// 
//  int max = Math.max(num3, Math.max(num1, num2));
//  System.out.println(max);
//  
// System.out.println(Math.pow(8, 3)); 
//		String s1 ="darshan";
//		String s2 = "darshan";
//		
//		if(s1 == s2) {
//			System.out.println("equals");
//		}else {
//			System.out.println("not");
//		}
//		
//		System.out.println(s1.equals(s2));
		String fruit = sc.nextLine();
		
		switch(fruit) {
		case "mango"-> System.out.println("mango");
			
		case "straberry" -> System.out.println("straberry");
		case "apple"->System.out.println("apple");
			
			
		default->System.out.println("default");
		}
			
	}

}
