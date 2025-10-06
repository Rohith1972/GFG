// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        StringBuilder res = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            res.append(String.valueOf(nums[i]));
        }
        TreeSet<Integer> res1 = new TreeSet<>();
        for(char ch : res.toString().toCharArray()){
            res1.add(Integer.parseInt(String.valueOf(ch)));
        }
        int n = res1.size();
        int res2[] = new int[n];
        int i=0;
        Iterator<Integer> it = res1.iterator();
        while(it.hasNext()){
            res2[i] = it.next();
            i++;
        }
        return res2;
    }
}