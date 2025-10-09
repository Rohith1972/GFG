class Solution {
    int countPairs(int arr[], int target) {
        // code here
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for(int num : arr){
            int complement = target - num;
            if(freq.containsKey(complement)){
                count += freq.get(complement);
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        return count;
    }
}