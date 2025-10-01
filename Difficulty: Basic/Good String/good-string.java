// User function Template for Java
class Solution {
    String isGoodString(String s) {
        // code here
        
        char ch[] = s.toCharArray();
        int i=0,j=1;
        while(j<ch.length){
            int x = (int)(ch[i]-'a');
            int y = (int)(ch[j]-'a');
            if(Math.abs(x-y)!=1&&Math.abs(x-y)!=25)
                return "NO";
            i++;
            j++;
        }
        return "YES";
    }
}