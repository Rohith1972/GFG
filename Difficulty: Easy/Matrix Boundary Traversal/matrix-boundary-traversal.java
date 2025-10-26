class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            if(i == 0){
                for(int j=0;j<mat.length;j++){
                    res.add(mat[i][j]);
                }
            }else if(i == mat.length-1){
                for(int j=mat.length-1;j>=0;j--){
                    res.add(mat[i][j]);
                }
            }else{
                res.add(mat[i][mat.length-1]);
            }
        }
        for(int i=mat.length-2;i>0;i--){
            res.add(mat[i][0]);
        }
        return res;
    }
}
