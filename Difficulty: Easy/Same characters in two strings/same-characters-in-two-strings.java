// User function Template for Java
class Solution {
    int sameChar(String A, String B) {
        // code here
        String a = A.toLowerCase();
        String b = B.toLowerCase();
        int count=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == b.charAt(i))
                count++;
        }
        return count;
    }
}