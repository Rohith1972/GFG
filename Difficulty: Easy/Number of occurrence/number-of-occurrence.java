class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int firstIndex = -1; 
        firstIndex = first(arr,target);
        int lastIndex = -1; 
        lastIndex = last(arr,target);
        if(firstIndex == -1)
            return 0;
        return lastIndex-firstIndex+1;
    }
    static int first(int[] arr,int target){
        int i=0;int j=arr.length-1;
        int firstIndex=-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==target){
                firstIndex=mid;
                j=mid-1;
            }else if(arr[mid]<target)
                i=mid+1;
            else
                j=mid-1;
        }
        return firstIndex;
    }
    static int last(int[] arr,int target){
        int i=0;int j=arr.length-1;
        int lastIndex=-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==target){
                lastIndex=mid;
                i=mid+1;
            }else if(arr[mid]<target)
                i=mid+1;
            else
                j=mid-1;
        }
        return lastIndex;
    }
}
