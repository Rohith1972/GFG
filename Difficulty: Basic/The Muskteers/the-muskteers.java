class Solution {
    static boolean checkTogether(String str) {
        int firstZero = str.indexOf('0');
        int lastZero = str.lastIndexOf('0');

        // Case 1: no zero present
        if (firstZero == -1) {
            return false; 
        }

        // Check between first and last zero
        for (int i = firstZero; i <= lastZero; i++) {
            if (str.charAt(i) != '0') {
                return false; // found a '1' in between zeros
            }
        }

        return true;
    }
}
