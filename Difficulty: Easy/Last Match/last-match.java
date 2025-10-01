// User function Template for Java
class Solution {
    static int findLastOccurence(String A, String B) {
        // code here
        if(!(A.lastIndexOf(B)==-1))
            return A.lastIndexOf(B)+1;
        return -1;
    }
}