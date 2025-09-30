// User function Template for Java
class Solution {
    String reverseWithSpacesIntact(String S) {
        // your code here
        char[] ch = S.toCharArray();
        int i=0,j=ch.length-1;
        while(i<=j){
            if(Character.isLetter(ch[i])&&Character.isLetter(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;j--;
            }else if(ch[i] == ' '){
                i++;
            }else{
                j--;
            }
        }
        return String.valueOf(ch);
    }
}