import java.util.*;
class Main{

  public static int sum_of_n(int num){
    if(num == 1|| num == 0){
      return 1;
    }
    return (num + sum_of_n(num-1));
  }
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    scan.close();
    System.out.println(sum_of_n(number));
  }
}
