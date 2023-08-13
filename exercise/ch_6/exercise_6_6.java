public class practise_6_6 {
    public static void main(String[] args){
        int [] arr = {2,8,83,106,72,82,38,92,73};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
        
            if(arr[i] > max){
                max = arr[i];
            }
            
        }
        System.out.println(max);
    }
}
