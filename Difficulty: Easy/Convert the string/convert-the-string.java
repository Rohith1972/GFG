// User function Template for Java
class Solution {
    String transform(String str) {
        // code here
        StringBuilder res = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(!isVowel(c)){
                res.append("#");
                if(Character.isUpperCase(c))
                    res.append(String.valueOf(Character.toLowerCase(c)));
                else
                    res.append(String.valueOf(Character.toUpperCase(c)));
            }
        }
        if(res.length() == 0)
            return new String("-1");;
        return res.toString();
    }
    static boolean isVowel(char c){
        HashSet<Character> hs = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        if(hs.contains(c))
            return true;
        return false;
    }
}