

class Solution {
    public int DiagonalSum(int[][] matrix) {
        // code here
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            sum += matrix[i][i];
        }
        for(int i=0,j=matrix.length-1;i<matrix.length && j>=0;i++,j--){
            sum += matrix[i][j];
        }
        return sum;
    }
}