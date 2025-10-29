// User function Template for Java

class Solution {
    static int kThSmallestFactor(int n, int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                al.add(i);
                if(n/i!=i)
                    al.add(n/i);
            }
        }
        Collections.sort(al);
        if(k>al.size())
            return -1;
        return al.get(k-1);
    }
};