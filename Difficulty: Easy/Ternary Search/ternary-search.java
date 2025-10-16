class Solution {
    public int findMinIndex(int[] arr) {
        // code here
        int l=0,h=arr.length-1;
        while(h-l >= 3){
            int mid1 = l+(h-l)/3;
            int mid2 = h-(h-l)/3;
            if(arr[mid1]>arr[mid2])
                l = mid1+1;
            else
                h = mid2-1;
        }
        int minIndex = l;
        for(int i=l+1;i<=h;i++){
            if(arr[i] < arr[minIndex])
                minIndex = i;
        }
        return minIndex;
    } 
}
