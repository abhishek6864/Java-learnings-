import java.util.*;
public class practise_6_2 {
    public static void main(String[] args){
        int [] arr = {1,3,8,6,23,93,63};

        Scanner scan = new Scanner(System.in);
        System.out.println("enter num you want to search in array");
        int num = scan.nextInt();
        scan.close();

        int key = -1;
        

        for(int i = 0; i < arr.length; i++){
            if(num == arr[i]){
                key = i;
            }
        } 
        if(key >= 0 ){
            System.out.println("element is pressnt in array at index " + key);
        }
        else{
            System.out.println("no its is not present");
        }

    }
}
