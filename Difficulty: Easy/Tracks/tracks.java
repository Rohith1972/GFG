// User function Template for Java
class Solution {
    public boolean ValidTrack(int[] arr) {
        // write code here
        int middle = arr.length/2;
        int i=0,j=arr.length-1;
        if(arr[middle]!=1)
            return false;
        while(i<j){
            if(arr[i]!=arr[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}