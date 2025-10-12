class Solution {
    public void sortIt(int[] nums) {
        // code here
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        int index=0;
        for(int i=0;i<odd.size();i++){
            nums[index++] = odd.get(i);
        }
        for(int i=0;i<even.size();i++){
            nums[index++] = even.get(i);
        }
    }
}
