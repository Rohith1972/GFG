class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        // code here
        int[] colours=new int[v];
        if(colour(0,edges,colours,v,m)==true)return true;
        return false;
    }
    boolean colour(int node,int[][] edges,int[] colours,int n,int m){
        if(node ==n)
            return true;
        for(int i=1;i<=m;i++){
            if(isSafe(node,edges,colours,i)){
                colours[node]=i;
                if(colour(node+1,edges,colours,n,m)==true)return true;
                colours[node]=0;
            }
        }
        return false;
    }
    boolean isSafe(int node, int[][] edges, int[] colours, int col) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (u == node && colours[v] == col)
                return false;
            if (v == node && colours[u] == col)
                return false;
        }
    return true;
}
}