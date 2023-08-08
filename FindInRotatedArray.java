public class FindInRotatedArray {
    public static void main(String args[]){
        int[] nums= { 4,5,6,1,2,3};
        int k= 2;
        System.out.println(search(nums,k));
    }
    public static int search(int[] nums, int target) {
        //find piviot
        int piviot = findPiviot(nums);

        int rightPiviot= BinarySearch(0,piviot-1,nums,target);
        int leftPiviot=BinarySearch(piviot,nums.length-1,nums,target);

        if(rightPiviot != -1){
            return rightPiviot;
        }else{
            return leftPiviot;
        }
    }
    public static int findPiviot(int[] nums){
         int l = 0;
        int h = nums.length-1;

        while(l < h){
            int mid = l + (h-l)/2;

            if(nums[mid] > nums[h]){
                l = mid+1;
            }
            else{
                h = mid;
            }
        }

        return h;
    }

    public static int BinarySearch(int start , int end , int[] nums, int target){
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }
}
