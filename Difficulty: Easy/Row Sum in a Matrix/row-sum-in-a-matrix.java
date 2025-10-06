class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int res[] = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                res[i]+=mat[i][j];
            }
        }
        return res;
    }
}