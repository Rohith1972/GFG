class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int presMax=-1;
        int prevMax=-1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>presMax){
                prevMax=presMax;
                presMax=arr[i];
            }
        }
        return prevMax;
    }
}