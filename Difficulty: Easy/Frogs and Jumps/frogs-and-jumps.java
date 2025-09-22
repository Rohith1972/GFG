// User function Template for Java

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        int count = 0;
        boolean[] res = new boolean[leaves + 1];
        for (int i = 0; i < N; i++) {
            int jumps = frogs[i];
            if (jumps == 0 || jumps > leaves) 
                continue;
            if (res[jumps]) 
                continue;
            for (int j=jumps;j<=leaves;j+=jumps){
                res[j] = true;
            }
        }
        for (int i=1;i<=leaves;i++) {
            if (!res[i]) count++;
        }
        return count;
    }
}
