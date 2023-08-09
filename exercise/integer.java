import java.util.*; 

class integer{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        String num = scan.nextLine();

        try {
                        // checking valid integer using parseInt()
                                    // method
                                                Integer.parseInt(num);
                                                            System.out.println(
                                                                            num + " is a valid integer number");
                                                                                    }
                                                                                            catch (NumberFormatException e) {
                                                                                                        System.out.println(
                                                                                                                        num + " is not a valid integer number");
                                                                                                                                }

                                                                                                                                scan.close();
        }

    }
