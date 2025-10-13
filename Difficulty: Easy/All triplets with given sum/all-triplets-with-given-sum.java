class Solution {
    public List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int k = j+1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == target){
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet); 
                        res.add(triplet);
                    }
                }
            }
        }

        return res;
    }
}
