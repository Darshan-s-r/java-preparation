import java.util.Scanner;

class PasswordChecker {
  public static int check(String password, int n){
    if(n < 4){
      return 0;
    }
    if(password.charAt(0) - '0' >= 0 && password.charAt(0)  - '9' <= 9){
      return 0;
    }
    int num = 0;
    int capital = 0;
    for(int i = 0; i<n; i++){
      if(password.charAt(i)  == ' ' || password.charAt(i)  == '/'){
        return 0;
      }
      if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
        capital++;
      }
      if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
        num++;
      }
    }
    if(capital > 0 && num >0){
      return 1;
    }else{
      return 0;
    }

  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter ch 1 by 1");
    String password = sc.nextLine();

    int ans = check(password, password.length());
    System.out.println(ans + "final ans");
  }
}