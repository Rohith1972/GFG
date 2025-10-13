class Solution {
    public int maxWater(int arr[]) {
        // code here
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];
        int lmax1 = arr[0];
        for(int i=0;i<arr.length;i++){
            lmax[i] = Math.max(lmax1,arr[i]);
            lmax1 = lmax[i];
        }
        int rmax1 = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            rmax[i] = Math.max(rmax1,arr[i]);
            rmax1 = rmax[i];
        }
        int water = 0;
        for(int i=0;i<arr.length;i++){
            int num = Math.min(lmax[i],rmax[i]);
            water += num - arr[i];
        }
        return water;
    }
}
