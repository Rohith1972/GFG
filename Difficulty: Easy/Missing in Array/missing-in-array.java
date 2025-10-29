class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
        long sum1= (n*(n+1))/2;
        long sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        int res = (int)(sum1-sum2);
        return res;
    }
}