// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> binTreeSortedLevels(int arr[], int n) {
        // your code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        if(n == 0 || arr[0] == -1)
            return res;
        q.add(0);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                int curr = q.poll();
                level.add(arr[curr]);
                int left = 2*curr + 1;
                int right = 2*curr + 2;
                if(left < n && arr[left] != -1)
                    q.add(left);
                if(right < n && arr[right] != -1)
                    q.add(right);
            }
            Collections.sort(level);
            res.add(level);
        }
        return res;
    }
}