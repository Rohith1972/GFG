// User function Template for Java

class Solution {
    public String solve(String a) {
        // code here
        HashSet<Character> hs = new HashSet<>();
        for(char c : a.toCharArray()){
            if(!isVowel(c)&&Character.isLetter(c)){
                hs.add(c);
            }
        }
        if(hs.size()%2==0)
            return "SHE!";
        return "HE!";
    }
    static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
}