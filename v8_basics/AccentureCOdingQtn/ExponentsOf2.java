
class ExponentsOf2 {
  public static int maxExponent(int a, int b){
    int max = 0;
    int num = a;
    for(int i = a; i<=b; i++){
      int temp = count(i);
      if(temp > max){
        max = temp;
        num = i;
      }
    }
    System.out.println("max" + max + " num " + num);
    return num;
  }

  public static int count(int i){
    int count = 0;
    while(i % 2 == 0 && i != 0){
      count ++;
      i = i/2;
    }
    return count;
  }

  public static void main (String [] args){
    int ans = maxExponent(7, 12);
    System.out.println(ans);
  }
}