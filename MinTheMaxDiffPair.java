import java.util.Arrays;

public class MinTheMaxDiffPair {
    public static void main(String[] args) {
        int[] arr= {10 ,1,2,7,1,3};
        int p = 2;

        System.out.println(minimizeMax(arr,p));
    }
    public static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low= 0;
        int high = nums[nums.length-1]-nums[0];

        int result = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(isValid(nums,mid,p)){
                result = mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }

        return result;
    }
    public static boolean isValid(int[] nums, int mid, int p){
        int countPairs =0;
        int i=0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i] <=mid){
                countPairs++;

                i+=2;
            }else{
                i++;
            }
        }

        if(countPairs >= p){
            return true;
        }else{
            return false;
        }
    }
}
