// User function Template for Java
class Solution {
    static String replaceAll(String str, String oldW, String newW) {
        // code here
        int i = 0;
        int n = str.length();
        int m = oldW.length();
        StringBuilder res = new StringBuilder();
        while(i<n){
            if(i+m<=n && str.substring(i,i+m).equals(oldW)){
                res.append(newW);
                i+=m;
            }else{
                res.append(str.charAt(i));
                i++;
            }
        }
        return res.toString();
    }
}