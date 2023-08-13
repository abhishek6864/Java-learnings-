public class practise_6_4 {
    public static void main(String[] args){
        int [][] arr = new int [2][3];
        arr[0][0] = 23;
        arr[0][1] = 7;
        arr[0][2] = 12;
        arr[1][0] = 18;
        arr[1][1] = 3;
        arr[1][2] = 32;
        int sum = 0;

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
              sum+= arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
