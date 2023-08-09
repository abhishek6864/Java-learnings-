import java.util.*;
public class practise_5_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println("table in reverse");
        for( int i = 10 ; i >= 1; i--){
            System.out.println(i*n);
        }
    }
}
