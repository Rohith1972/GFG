// User function Template for Java

class Solution {
    int sortedCount(int N, int M, int Mat[][]) {
        // code here
        int count = 0;
        for(int i=0;i<N;i++){
            boolean asc = true;
            boolean desc = true;
            for(int j=0;j<M-1;j++){
                if(Mat[i][j]>=Mat[i][j+1])
                    asc = false;
                if(Mat[i][j]<=Mat[i][j+1])
                    desc = false;
            }
            if(asc || desc)
                count++;
        }
        return count;
    }
};