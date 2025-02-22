import java.util.Scanner;
class RatAndHouse {
  public static int check(int rat, int unit, int[] arr, int n){
    if(n <= 0){
      return -1;
    }
    int foodRequired = rat * unit;
    int availableFood = 0;
    for(int i = 0; i< n; i++){
      if(availableFood >= foodRequired){
        return i;
      }
      availableFood += arr[i];
    }
    if(availableFood >= foodRequired){
        return n;
      }else{
        return 0;
      }
  }

  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the rat  -> ");
    int rat = sc.nextInt();
    System.out.println("enter the unit of food  -> ");
    int unit = sc.nextInt();
    System.out.println("enter the no of house  -> ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int ans = check(rat, unit, arr, n);
    System.out.println(ans + "final ans");

  }
}