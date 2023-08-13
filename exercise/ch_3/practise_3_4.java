import java.util.*;

class practise_3_4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        String sen = scan.next();

        if(sen.indexOf("  ")> 0 || sen.indexOf("   ")>0){
            System.out.println("sentence has more than 2 spaces ");
        }
        scan.close();


    }
}
