class Solution {
    ArrayList<Integer> countDistinct(int nums[], int k) {
        // code here
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<k;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        res.add(hm.size());
        for(int i=k;i<n;i++){
            int outgoing = nums[i-k];
            hm.put(outgoing,hm.getOrDefault(outgoing,0)-1);
            if(hm.get(outgoing)==0)
                hm.remove(outgoing);
            int incoming = nums[i];
            hm.put(incoming,hm.getOrDefault(incoming,0)+1);
            res.add(hm.size());
        }
        return res;
    }
}