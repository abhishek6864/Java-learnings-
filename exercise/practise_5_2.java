import java.util.*;
public class practise_5_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int sum = 0;

        for(int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    
}
