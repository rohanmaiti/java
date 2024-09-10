public class Problem2{
    public static void main(String []args){
        // find the maxSubarray of sum k ;
        // q1. find only the size of subarray
        // q2. print the maximum sub array 
        int arr[] = {1,2,3,-2,7,4,5,8,2,-1,4,3,1,4,3};
        int k = 10;
        System.out.println(findMaxOfSumK(arr,k)) ;
    }
    static int findMaxOfSumK(int arr[],int k){
        int j = 0; int sum = 0; int l = 0;
        int maxLength = 0;
        int startingIndex = 0;
        int endIndex = 0;
        for(int r=0;r<arr.length;r++)
        {
            sum += arr[r];
            if(sum > k){
                // invalid case 
                sum -= arr[l];
                l++;
                continue;
            }
            if(sum <= k){
            // valid 
            maxLength = Math.max(r-l+1 , maxLength);
            startingIndex = r;
            endIndex = l;
            }
        }
        System.out.println(endIndex+" : "+ startingIndex );
        return maxLength;
    }
}