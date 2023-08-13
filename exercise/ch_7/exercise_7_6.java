import java.util.*;
class Main{

  public static int sum(int ...arr){
    int sum = 0;
    for(int i = 0; i< arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
  
  
  public static void main(String[] args){
    System.out.println(sum(3,83,62,64,94,64));
  }
}
