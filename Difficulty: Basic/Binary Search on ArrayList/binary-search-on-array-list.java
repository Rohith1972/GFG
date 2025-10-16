// User function Template for Java
class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        // Your code here
        int i=0,j=list.size()-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(list.get(mid)==k)
                return mid;
            else if(list.get(mid)>k)
                j = mid-1;
            else
                i = mid+1;
        }
        return -1;
        // If k in arr return 1, else return -1
    }
}