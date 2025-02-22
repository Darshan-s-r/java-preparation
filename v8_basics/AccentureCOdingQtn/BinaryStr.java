import java.util.Scanner;
class BinaryStr {
  public static int solve(String str){
    int ch = str.charAt(0) - '0';
    char oparator = str.charAt(1);
    int ans = str.charAt(0) - '0';
    for(int i = 2; i<str.length(); i++){
      if(str.charAt(i) == '1' || str.charAt(i) == '0'){
        ch = str.charAt(i) - '0';
      }else{
        oparator = str.charAt(i);
      }
        if(oparator == 'A'){
          ans = ans & ch; 
        }
        if(oparator == 'B'){
          ans = ans | ch;
        }
         if(oparator == 'C'){
          ans = ans ^ ch;
        }
      
    }
    return ans;
  }

  public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter string");
      String str = sc.nextLine();
      int ans = solve(str);
      System.out.println(ans + "final ans");
  }
}