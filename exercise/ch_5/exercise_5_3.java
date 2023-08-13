import java.util.*;
public class practise_5_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("enter number");
        int n = scan.nextInt();
        scan.close();
        System.out.println("table of number "+ n);
        for(int i = 1 ; i <= 10; i++){
            System.out.println(n*i);
        }
    }
    
}
