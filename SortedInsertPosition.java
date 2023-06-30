/*
You are given a sorted array A of size N and a target value B.
Your task is to find the index (0-based indexing) of the target value in the array.

A = [1, 3, 5, 6]
B = 5

output : 2
 */
public class SortedInsertPosition{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;

        System.out.println(BinarySearch(arr, target));
    }
    public static int BinarySearch(int[] A, int B) {
        int low = 0;
        int high = A.length-1;
       while(low<=high){
           int mid = (low + high)/2;

           if(A[mid] == B){
               return mid;
           }else if(A[mid]>B){
              high = (mid-1);
           }else{
               low = (mid+1);
           }
       }
       return -1;
    }
}