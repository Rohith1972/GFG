// User function Template for Java
class Solution {
    public static int binarySearchArray(int nums[], int target) {
        // Your code here
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}