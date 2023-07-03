public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,10,1,2,4,5};
        System.out.println(PeakElement(arr));
    }
    public static int  PeakElement(int arr[]){
        int low = 0,high= arr.length-1;

        while (low<= high){
            int mid = low + (high-low)/2;

            if(mid>0 && mid<arr.length-1 && arr[mid]> arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }else if (arr[mid]>arr.length-1 && arr[mid]<arr[mid+1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return arr[arr.length-1];
    }
}
