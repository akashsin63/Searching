import java.util.Arrays;

public class MatrixSearch {
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int target = 11;

        System.out.println(Arrays.toString(searching(arr,target)));
    }
    public static int[] searching(int[][] arr, int target){
        int row =0;
        int col = arr.length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }
            else if(arr[row][col] < target){
                row++;
            }else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
