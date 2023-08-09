import java.util.*;

public class practise_4_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter income");
        int salary = scan.nextInt();
        if(salary > 250000 && salary < 500000){
            System.out.println("amount of tax you need to pay is "+ (salary/100)*5);
        }
        if(salary >= 500000 && salary < 1000000){
            System.out.println("amount of tax you need to pay is "+ (salary/100)*20);
        }
        if(salary > 1000000){
            System.out.println("amount of tax you need to pay is " + (salary/100)*30 );
        }

        scan.close();

    }
}
