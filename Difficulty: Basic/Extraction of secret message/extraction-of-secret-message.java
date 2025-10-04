class Solution {
    String ExtractMessage(String S) {
        String res = S.replace("LIE", " ");
        res = res.replaceAll("\\s+", " ").trim();
        return res;
    }
}
