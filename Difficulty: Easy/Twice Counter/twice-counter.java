// User function Template for Java

class Solution {
    public int countWords(String list[], int n) {
        // code here
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<list.length;i++){
            hm.put(list[i],hm.getOrDefault(list[i],0)+1);
        }
        int count=0;
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            if(e.getValue()==2)
                count++;
        }
        return count;
    }
}