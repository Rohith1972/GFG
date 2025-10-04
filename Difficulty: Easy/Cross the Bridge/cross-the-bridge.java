class Solution {
    static int findDays(String S) {
        int days = 0;
        int maxJump = 0;   
        int currentGap = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '.') {
                currentGap++;
            } else { 
                if (currentGap > 0) {
                    if (currentGap > maxJump) {
                        days++; 
                        maxJump = currentGap;
                    }
                    currentGap = 0; 
                }
            }
        }
        return days;
    }
}
