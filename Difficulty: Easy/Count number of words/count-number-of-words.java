// User function Template for Java
class Solution {
    int countWords(String s) {
        int count = 0;
        boolean inWord = false;
        boolean skipNext = false;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            // If previous char was a backslash, this char is forced to be a separator.
            if (skipNext) {
                skipNext = false;
                // if this char is itself a backslash, it will also force the next char to be a separator
                if (c == '\\') skipNext = true;
                inWord = false;
                continue;
            }

            // If we hit a backslash, treat it (and the immediate next char) as separators.
            if (c == '\\') {
                inWord = false;
                skipNext = true;
                continue;
            }

            // Actual whitespace separators
            if (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
                inWord = false;
            } else if (c >= 'a' && c <= 'z') { // letter => part of a word
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        return count;
    }
}
