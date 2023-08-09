import java.util.*; 

public class meter{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("enter kilometer ");
      float kilo = scan.nextFloat();

      System.out.printf("%f kilometer is %f in meter ",kilo,kilo*1000);

      scan.close();
    }
}