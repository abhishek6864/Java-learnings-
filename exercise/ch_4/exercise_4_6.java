import java.util.*;
public class practise_4_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a url");
        String url = scan.next();

        if(url.indexOf(".com")> 0){
            System.out.println("commerical website");
        }
        if(url.indexOf(".in")> 0){
            System.out.println("indian website");
        }
        if(url.indexOf(".org")> 0){
            System.out.println("organisation ");
        }

        scan.close();

    }
    
}

