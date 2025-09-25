class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            int res = arr[i]+arr[j];
            if(res==target)
                return true;
            else if(res<target)
                i++;
            else
                j--;
        }
        return false;
    }
}