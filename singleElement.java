public class singleElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(binarySearch(arr));
    }
    public static int binarySearch(int[] A){
        int low = 0;
        int high=A.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid>0 && mid<A.length && A[mid]==A[mid-1]){
                if( mid%2 == 0){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
            else if(mid>0 && mid<A.length-1 && A[mid]== A[mid+1]){
                if(mid%2 != 0){
                    high = mid-1;
                }else{
                    low = mid +1;
                }
            }else{
                return A[mid];
            }
        }

        return -1;
    }
}
