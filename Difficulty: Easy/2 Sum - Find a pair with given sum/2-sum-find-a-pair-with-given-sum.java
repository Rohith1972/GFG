// User function Template for Java
class Solution {
    public List<Integer> twoSum(int arr[], int target) {
        List<Integer> list = new ArrayList<>();
        // Your code here
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j){
            int res = arr[i]+arr[j];
            if(res==target){
                list.add(arr[i]);
                list.add(arr[j]);
                return list;
            }
            else if(res<target)
                i++;
            else
                j--;
        }
        return list;
    }
}