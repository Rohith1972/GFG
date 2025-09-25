class Solution {
    public static boolean isPalindrome(String s) {
        // code here
        String s1 = s.toLowerCase();
        char ch[] = s1.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}