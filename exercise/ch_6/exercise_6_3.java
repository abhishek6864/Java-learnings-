public class practise_6_3 {
    public static void main(String[] args){
        int [] physics = {34,73,26,94,38,95,47,63};
        int sum = 0;
        for(int a: physics){
            sum+= a;
        }

        System.out.println("average marks is " + sum/physics.length);
    }
}
