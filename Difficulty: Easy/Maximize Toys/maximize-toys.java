// User function Template for Java

class Solution {
    static int toyCount(int N, int k, int arr[]) {
        // code here
        Arrays.sort(arr);
        int res = 0;
        for(int i=0;i<N;i++){
            if(arr[i]<=k){
                k -= arr[i];
                res++;
            }
        }
        return res;
    }
}