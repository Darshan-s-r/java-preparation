import java.util.Scanner;

class SumDiffOf1toM {
  public static int sumDiff(int n, int m){
    int sumByN = 0;
    int sumNotByN = 0;

    for(int i = 0; i<=m; i++){
      if(i % n == 0){
        sumByN += i;
      }else{
        sumNotByN += i;
      }
    }

    return sumNotByN - sumByN;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int m = sc.nextInt();

    int ans = sumDiff(n, m);

    System.out.println(ans);
  }
}