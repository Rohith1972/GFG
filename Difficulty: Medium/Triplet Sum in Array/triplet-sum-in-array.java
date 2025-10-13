class Solution {
    public boolean hasTripletSum(int[] nums, int target) {
        // code Here
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l=i+1,h=nums.length-1;
            while(l<h){
                int sum = nums[i]+nums[l]+nums[h];
                if(sum == target){
                   return true;
                }else if(sum < target){
                    l++;
                }else{
                    h--;
                }
            }
        }
        return false;
    }
}
