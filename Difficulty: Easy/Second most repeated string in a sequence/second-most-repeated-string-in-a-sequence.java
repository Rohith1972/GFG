class Solution {
    String secFrequent(String arr[], int N) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : arr) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        String first = "", second = "";
        int max1 = -1, max2 = -1;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();
            
            if (freq > max1) {
                max2 = max1;
                second = first;
                max1 = freq;
                first = word;
            } else if (freq > max2 && freq != max1) {
                max2 = freq;
                second = word;
            }
        }
        
        return second;
    }
}
