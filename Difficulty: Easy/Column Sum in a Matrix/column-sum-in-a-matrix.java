class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int res[] = new int[mat[0].length];
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                res[i]+=mat[j][i];
            }
        }
        return res;
    }
}