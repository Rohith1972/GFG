
class Solution {
    public ArrayList<ArrayList<Integer>> findTriplets(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) 
                continue;
            int l=i+1,h=nums.length-1;
            while(l<h){
                int sum = nums[i]+nums[l]+nums[h];
                if(sum == k){
                    ArrayList<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[l]);
                    t.add(nums[h]);
                    res.add(t);
                    l++;
                    h--;
                    while (l < h && nums[l] == nums[l - 1]) 
                        l++;
                    while (l < h && nums[h] == nums[h + 1]) 
                        h--;
                }else if(sum < k){
                    l++;
                }else{
                    h--;
                }
            }
        }
        return res;
    }
}
