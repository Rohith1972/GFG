// User function Template for Java
class Solution {
    String solve(String N) {
        // code here
        int[] freq = new int[10];
        for(char ch : N.toCharArray()){
            freq[ch-'0']++;
        }
        int mostFreq = 0;
        for(int d=0;d<10;d++){
            if(freq[d]>=freq[mostFreq])
                mostFreq = d;
        }
        return Integer.toString(mostFreq);
    }
}