class Solution {
    static long hashString(String s) {
        // Code Here
        String X = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] words = s.trim().split("\\s+");
        long total = 0;
        for(String word : words){
           for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c!=' '){
                int idx = X.indexOf(c);
                if(idx!=-1){
                    total += (i + idx);
                }
            }
        } 
        }
        int count = words.length;
        return total * count;
    }
};