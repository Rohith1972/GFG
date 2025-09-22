// User function Template for Java
class Solution {

    public boolean countSub(long arr[], long n) {
        // Your code goes here
        for(int i=0;i<arr.length/2;i++){
            int left = 2*i+1;
            int right = 2*i+2;
            if(left<n)
                if(arr[i]<arr[left])
                    return false;
            if(right<n)
                if(arr[i]<arr[right])
                    return false;
        }
        return true;
    }
}