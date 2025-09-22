class Solution {
    public static String concatenatedString(String s1, String s2) {
        // code here
        Set<Character> st1 = new HashSet<>();
        for(Character i : s1.toCharArray()){
            st1.add(i);
        }
        Set<Character> st2 = new HashSet<>();
        for(Character i : s2.toCharArray()){
            st2.add(i);
        }
        StringBuilder res = new StringBuilder();
        for(Character i : s1.toCharArray()){
            if(!st2.contains(i))
                res.append(i);
        }
        for(Character i : s2.toCharArray()){
            if(!st1.contains(i))
                res.append(i);
        }
        return res.length()==0? "-1":res.toString();
    }
}
