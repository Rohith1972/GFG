class Solution {
    public char getMaxOccuringChar(String s) {
        // code here
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(!lhm.containsKey(arr[i]))
                lhm.put(arr[i],1);
            else
                lhm.put(arr[i],lhm.get(arr[i])+1);
        } 
        Set<Character> st = lhm.keySet();
        ArrayList<Character> res = new ArrayList<>();
        int max=-1;
        for(Character i : st){
            if(lhm.get(i)>max)
                max=lhm.get(i);
        }
        for(Character i : st){
            if(lhm.get(i)==max)
                res.add(i);
        }
        Collections.sort(res,(a,b)->a-b);
        return res.get(0);
    }
}