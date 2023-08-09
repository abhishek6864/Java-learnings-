import java.util.*;

class practise_4_2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter marks of 1st subject ");
        int m1 = scan.nextInt();

        System.out.println("enter marks of 2nd subject ");
        int m2 = scan.nextInt();

        System.out.println("enter marks of 3rd subject ");
        int m3 = scan.nextInt();

        if(m1<33 || m2< 33 || m3 < 33){
            System.out.println("student is fail");
        }
        else{
            System.out.println("Student is pass");
        }


scan.close();
    }
}