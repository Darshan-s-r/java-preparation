class MoveHyphensToFront {
  public static String move(String str){

    String ans = "";
    for(int i = 0; i< str.length(); i++){
      if(str.charAt(i) == '-'){
        ans = "-" + ans;
      }
      else{
        ans = ans + str.charAt(i);
      }
    }
    return ans;
  }

  public static void main(String [] args){
    System.out.println(move("Move-Hyphens-to-front"));
  }
}