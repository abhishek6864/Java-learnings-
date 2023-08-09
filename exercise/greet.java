import java.util.*; 

class greet{
    public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Whats your name ?");
    String name = scanner.nextLine();

    System.out.println("Hello " + name + ", good morning how's your day");

scanner.close();

    }
}