public class practise_6_7 {
    public static void main(String[] args){
        int [] arr = {2,8,31,63,93,102,128};
        int pass = 0;

        for(int i = 0; i < arr.length-1; i++){
            
                if(arr[i] < arr[i+1]){
                    pass++;
                }
        }
        if(pass== 6){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
