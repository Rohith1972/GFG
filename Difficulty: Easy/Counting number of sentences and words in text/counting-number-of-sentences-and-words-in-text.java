// User function Template for Java
class Solution {
    static List<Integer> sentenceWord(String text) {
        int sentences = 0;
        int words = 0;
        int n = text.length();
        int i = 0;
        while (i < n) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                words++;
                while (i < n && Character.isLetter(text.charAt(i))) {
                    i++;
                }
                continue;
            }
            if (c == '.' || c == '!' || c == '?') {
                sentences++;
                while (i < n && (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?')) {
                    i++;
                }
                continue;
            }

            i++;
        }
        if ((sentences == 0 || (n > 0 && text.charAt(n - 1) != '.' 
                                           && text.charAt(n - 1) != '!' 
                                           && text.charAt(n - 1) != '?')) 
                                           && words > 0) {
            sentences++;
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(sentences);
        ans.add(words);
        return ans;
    }
}
