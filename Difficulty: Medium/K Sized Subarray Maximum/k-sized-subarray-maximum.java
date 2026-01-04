class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1){
                res.add(arr[dq.peekFirst()]);
            }
        }
        return res;
    }
}