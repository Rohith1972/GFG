class Solution {
    String ExtractMessage(String S) {
        // replace "LIE" with space
        String res = S.replace("LIE", " ");
        // replace multiple spaces with a single space and trim ends
        res = res.replaceAll("\\s+", " ").trim();
        return res;
    }
}
