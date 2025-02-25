import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class SecondLargestSum {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n =  sc.nextInt();
    System.out.println("enter array elements 1 by 1");
    int[] arr = new int[n];
    for(int i = 0; i< n; i++){
      arr[i] = sc.nextInt();
    }
    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> even = new ArrayList<>();

    for(int i = 0; i<n; i++){
      if(i % 2 == 0){
        even.add(arr[i]);
      }else{
        odd.add(arr[i]);
      }
    }

    Collections.sort(even);
    Collections.sort(odd);

    int sum =  even.get(even.size() - 2) + odd.get(odd.size() - 2);
    System.out.println(sum + " sum");
  }
}