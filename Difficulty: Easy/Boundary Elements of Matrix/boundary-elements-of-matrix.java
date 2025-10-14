// User function Template for Java

class Solution {
    public int[] BoundaryElements(int[][] matrix) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if((i==0) || (i==matrix.length-1)){
                for(int j=0;j<matrix[i].length;j++){
                    res.add(matrix[i][j]);
                }
            }else{
                res.add(matrix[i][0]);
                res.add(matrix[i][matrix[i].length-1]);
            }
        }
        int[] res1 = new int[res.size()];
        for(int i=0;i<res1.length;i++){
            res1[i] = res.get(i);
        }
        return res1;
    }
}