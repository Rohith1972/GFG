// User function Template for Java

class Solution {
    ArrayList<Integer> countChars(String s) {
        // code here
        ArrayList<Integer> res = new ArrayList<>(s.length() / 2 + 1);
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                count++;
            else{
                if (count > 0) {   
                    res.add(count);
                    count = 0;
                }
            }
        }
        if(count>0)
            res.add(count);
        return res;
    }
}
