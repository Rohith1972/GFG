// User function Template for Java

class Solution {

    int maxValue(int arr[]) {
        // Complete the function
        int MOD = 1000000007;
        long res = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            res = (res+i*(long)arr[i])%MOD;
        }
        return (int)res;
    }
}
