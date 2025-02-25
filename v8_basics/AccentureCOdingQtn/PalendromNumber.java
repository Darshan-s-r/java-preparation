import java.util.Scanner;
class PalendromNumber {
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  int a = sc.nextInt();
  int b = sc.nextInt();


 

  for(int i = a; i<= b; i++){
    String num = String.valueOf(i);
        String reverse = new StringBuilder(num).reverse().toString();
        boolean isPalendrome = num.equals(reverse);
      if(isPalendrome){
      if(i != b){
        System.out.print(i + ", ");      
}     else{
        System.out.print(i + ".");  
    }
     }
  }
  sc.close();
  }
}
  

