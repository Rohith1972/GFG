// User function Template for Java
class Solution {
    String URLify(String s) {
        // code here
        String res = s.replaceAll(" ","%20");
        return res;
    }
}