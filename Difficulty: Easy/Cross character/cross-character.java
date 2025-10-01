class Solution {
    public String crossPattern(String S) {
        int n = S.length();
        StringBuilder result = new StringBuilder(n * n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    result.append(S.charAt(i));        // main diagonal
                } else if (i + j == n - 1) {
                    result.append(S.charAt(j));        // other diagonal
                } else {
                    result.append(' ');                // blank position
                }
            }
            // DO NOT append any extra separator between rows
        }
        return result.toString();
    }
}
