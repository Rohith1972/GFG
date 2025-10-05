class Solution {
    public static boolean cat_hat(String str) {
        // code here
        int catCount=0;
        int hatCount=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='c' && i+2<str.length() && str.substring(i,i+3).equals("cat"))
                catCount++;
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='h' && i+2<str.length() && str.substring(i,i+3).equals("hat"))
                hatCount++;
        }
        return catCount == hatCount;
    }
}