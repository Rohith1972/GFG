class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<mat[0].length;i++){
            res.add(new ArrayList<>());
            for(int j=0;j<mat.length;j++){
                res.get(i).add(j,mat[j][i]);
            }
        }
        return res;
    }
}