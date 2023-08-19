public class SpecialInteger {
    /*Given an array of integers A and an integer B, find and return the
     maximum value K such that there is no subarray in A of size K with 
     the sum of elements greater than B. 
     

     Input 1:

A = [1, 2, 3, 4, 5]
B = 10
Input 2:

A = [5, 17, 100, 11]
B = 130


Example Output
Output 1:

 2
Output 2:

 3
     */
    
    public static void main(String[] args) {
        int[] arr= {5,17,100,11};
        int k=130;
        System.out.println(solve(arr,k));
    }
    public static int solve(int[] A,int B){
        int ans = 0; 
        int low = 0;
        int high=A.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(spcialInteger(A,mid)<= B){
                ans = mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int spcialInteger(int[] A , int k){
        int maxSum=0;
        int sum=0; 
        for(int i =0;i<k;i++){
            sum +=A[i];
        }

        maxSum=sum;
        int i =1,j=k;
        while(j<A.length){
            sum = sum -A[i-1] +A[j];
            if(sum>maxSum){
                maxSum = sum;
            }
            i++; j++;
        }

        return maxSum;
    }
}
