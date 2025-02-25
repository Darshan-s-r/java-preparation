import java.util.Scanner;
class TableSum {
  public static void tableSum(int n){
    int [] arr = new int[10];
    int sum = 0;
    for(int i = 1; i<= 10; i++){
      int value = i * n;
      if(i != 10){
        System.out.print(value + ", "); 
      }else{
         System.out.print(value + "\n"); 
      }
     
      sum += value;
    }
    System.out.println(sum + " sum");
  } 

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    tableSum(n);
  }
}