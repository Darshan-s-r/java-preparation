package v8_basics;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {23, 65, 7, 1, 45,78, 3,234, 00};
    Scanner sc = new Scanner(System.in);
//    System.out.println(search(arr, sc.nextInt()));
    System.out.println("enter name");
    String name = sc.nextLine();
    char target = 'a';
    System.out.println(stringSearch2(name, target));;
    
	}
	
	static int search(int[] arr, int element) {
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		for(int index=0;index<arr.length;index++) {
			if(element == arr[index]) {
				return index;
			}
			
		}
		return Integer.MAX_VALUE;
	}
	
	static boolean stringSearch(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		for(int i=0;i<str.length();i++) {
			if(target == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	static boolean stringSearch2(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		for(char ch : str.toCharArray()) {
			if(ch == target) {
				return true;
			}
		}
		return false;
	}

}
