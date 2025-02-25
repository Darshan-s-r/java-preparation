import java.util.*;

class SumSecondLargestAndSmallest {
  public static int getSum(int [] arr){
    if(arr.length <= 3){
      return 0;
    }
    ArrayList<Integer> odd =  new ArrayList<>();
    ArrayList<Integer> even =  new ArrayList<>();
    for(int i = 0; i<arr.length; i++){
      if(i % 2 == 0){
        even.add(arr[i]);
      }else{
        odd.add(arr[i]);
      }
    }
    Collections.sort(odd);
    Collections.sort(even);

    return even.get(even.size() - 2) + odd.get(even.size() - 2);
  }

  public static void main(String[] args){
     System.out.println((char) 65 +  "helo");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n;i++){
      arr[i] = sc.nextInt();
    }

    System.out.println(getSum(arr));
  
  }
}