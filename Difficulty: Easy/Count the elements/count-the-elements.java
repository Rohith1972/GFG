// User function Template for Java

class Solution {
    public static int[] countElements(int a[], int b[], int n, int query[], int q) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<query.length;i++){
            int index = query[i];
            int number = a[index];
            int count = 0;
            for(int j=0;j<b.length;j++){
                if(b[j]<=number)
                    count++;
            }
            res.add(count);
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}
