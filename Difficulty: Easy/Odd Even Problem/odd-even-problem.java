class Solution {
    public static String oddEven(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int x = 0, y = 0;
        for (char ch : freq.keySet()) {
            int pos = ch - 'a' + 1; 
            int f = freq.get(ch);
            if (pos % 2 == 0 && f % 2 == 0)
                x++;
            if (pos % 2 != 0 && f % 2 != 0) 
                y++;
        }

        if ((x + y) % 2 == 0)
            return "EVEN";
        else
            return "ODD";
    }
}
