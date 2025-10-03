

class Solution {
    public String is_common(String[] s, String[] t) {
        // Code here
        HashSet<String> hs = new HashSet();
        for(int i=0;i<s.length;i++){
            hs.add(s[i]);
        }
        for(int i=0;i<t.length;i++){
            if(hs.contains(t[i]))
                return new String("CHANGE");
        }
        return new String("BEHAPPY");
    }
}
