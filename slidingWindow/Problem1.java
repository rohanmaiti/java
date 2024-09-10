public class Problem1{
    public static void main(String []args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        // find the max sum subarray of size k ;
        System.out.println(maxSubarray(arr,k));
    }
    static int maxSubarray(int arr[],int k){
         
        int sum = 0;
        for(int i=0;i<k;i++)
        sum += arr[i];
        int j=0;
        int maxi = sum;

        for(int i=k;i<arr.length;i++){
            // System.out.println(sum);
            sum += arr[i];
            sum -= arr[j];
            j++;

            maxi = Math.max(maxi,sum);
        }
        maxi = Math.max(maxi,sum);
        // System.out.println(sum);
        return maxi;
    }
}