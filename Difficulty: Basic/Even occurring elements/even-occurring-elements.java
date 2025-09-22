class Solution {
    public List<Integer> findEvenOccurrences(int[] arr)
    {
        Map<Integer, Integer> freq = new LinkedHashMap<>(); 
        for (int num : arr)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int num : freq.keySet()) 
        {
            if (freq.get(num) % 2 == 0) 
            {
                result.add(num);
            }
        }
        if (result.isEmpty()) 
        {
            result.add(-1);
        }
        return result;
    }
}