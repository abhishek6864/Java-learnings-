import java.util.*; 

public class cgpa {
    public static void main(String args[]){

    Scanner scanner = new Scanner(System.in);
    System.out.println("enter marks of 1st subject ");
    float n1 = scanner.nextFloat();

    System.out.println("enter number of 2nd subject ");
    float n2 = scanner.nextFloat();

    System.out.println("enter number of 3rd subject ");
    float n3= scanner.nextFloat();

    System.out.println("cgpa is "+ (n1+n2+n3)/30);







    }
}
