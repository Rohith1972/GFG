// User function Template for Java

class Solution {
    int isSame(String s) {
        // code here
        int i=0;
        int length=0;
        while(Character.isLetter(s.charAt(i))){
            length++;
            i++;
        }
        long num = 0;
        try{
            num = Long.parseLong(s.substring(i,s.length()));
        }catch(NumberFormatException e){
            return 0;
        }
        if(length == num)
            return 1;
        return 0;
    }
}