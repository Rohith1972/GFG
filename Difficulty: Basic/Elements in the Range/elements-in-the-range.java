// User function Template for Java

class Solution {
    boolean check_elements(int arr[], int n, int A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
        for(int i=A;i<=B;i++){
            if(!res.contains(i))
                return false;
        }
        return true;
    }
}
