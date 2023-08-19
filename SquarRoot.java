public class SquarRoot {
    public static void main(String[] args) {
        int A = 9;
        System.out.println(sqrt(A));
    }
    public static int sqrt(int A){
        long low =0;
        long  high = A;
        long ans= 0;

        while(low<=high){
            long mid = low + (high-low)/2;
            if(mid*mid == A){
                ans= mid;
            }
            if(mid*mid> A){
                high = mid-1;
            }else{
                ans = mid;
                low = mid +1;
            }
        }


        return (int)Math.floor(ans);
    }
}
