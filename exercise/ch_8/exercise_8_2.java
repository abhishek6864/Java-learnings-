class call{
  public void ring(){
    System.out.println("ringing...");
  }

  public void vibrate(){
    System.out.println("vibrating...");
  }


};
class Main{
 public static void main(String[] args){
    call c1 = new call();
   c1.ring();
   c1.vibrate();
  }
}
