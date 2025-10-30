class Solution {
    int columnWithMaxZeros(int M[][], int N) {
        int maxCount = 0;
        int colIndex = -1;
        for(int j=0;j<N;j++){
            int count = 0;
            for(int i=0;i<N;i++){
                if (M[i][j] == 0)
                    count++;
            }
            if(count > maxCount){
                maxCount = count;
                colIndex = j;
            }
        }
        return (maxCount == 0) ? -1 : colIndex;
    }
}
