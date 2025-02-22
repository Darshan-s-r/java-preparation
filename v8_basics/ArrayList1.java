package v8_basics;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>(10);//we can even add size 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("using add");
		for(int i=0;i<3;i++) {
			list.add(sc.nextInt());
		}
		 
		System.out.println("using get");
		for(int i=0;i<3;i++) {
			System.out.println(list.get(i)); 
		}
		
		System.out.println("using put");
		for(int i=0;i<3;i++) {
			list.set(i, sc.nextInt());
		}
		
		System.out.println(list);
		
		
   
	}

}
