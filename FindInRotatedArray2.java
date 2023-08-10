public class FindInRotatedArray2 {
    //https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,5,6,0,1,1};
        int k = 6;

        System.out.println(search(arr,k));
    }
     public static boolean search(int[] nums, int target) {
        int piviot = findPiviot(nums,nums.length);

        boolean idx = binarySearch(nums, target,0,piviot-1);
        if(idx !=false){
            return idx;
        }
        idx = binarySearch(nums, target, piviot, nums.length-1);

        return idx;
    }
    public static int findPiviot(int[] nums, int n){
        int l= 0;
        int r= n-1;

        while(l<r){
            //only adding these two line extra compare to Search in Rotated array I question
            //if you consecutive lefts hand side array have duplicate just skipping those
            while(l<r && nums[l]== nums[l+1]){
                l++;
            }
            //if you consecutive right hand side array have duplicate just skipping those
            while(l<r && nums[r]== nums[r-1]){
                r--;
            }

            int mid = l + (r-l)/2;
            if(nums[mid]> nums[r]){
                l = mid+1;
            }else{
                r= mid;
            }
        }
        return r;
    }

    public static boolean binarySearch(int[] nums, int target , int l, int h){
        boolean idx = false;

        while (l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid]== target){
                idx = true;
                break;
            }
            else if(nums[mid]>target){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }

        return idx;
    }
}
