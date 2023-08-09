import java.util.*;
public class practise_5_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number whose factorial you wamt");
        int num = scan.nextInt();
        scan.close();
        int fac = 1;
        for(int i = num; i >= 1; i--){
            fac *= i;
        }

        System.out.println(num + " factorial is " + fac);
    }
    
}
