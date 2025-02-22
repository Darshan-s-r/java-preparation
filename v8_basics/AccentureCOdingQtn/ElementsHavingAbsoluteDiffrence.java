import java.util.Scanner;

class ElementsHavingAbsoluteDiffrence {
    public static int count(int[] arr, int num, int diff){
      int count = 0;

      for(int i = 0; i<arr.length; i++){
        if(Math.abs(arr[i] - num) <= diff){
          count++;
        }
      }

      if(count == 0) return -1;
      else return count;
    }

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size");
      int n = sc.nextInt();
      System.out.println("enter array elements");
      int[] arr = new int[n];
      for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
      }
      System.out.println("enter num");
        int num = sc.nextInt();
      System.out.println("enter diff");
        int diff = sc.nextInt();

      int ans = count(arr, num, diff);

      System.out.println(ans + "final ans");

    }
}