class Sol {
    int isPossible(String s) {
        // your code here
        HashMap<Character,Integer> res = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            res.put(c,res.getOrDefault(c,0)+1);
        }
        int oddCount=0;
        for(Map.Entry<Character,Integer> e : res.entrySet()){
            if(e.getValue()%2!=0)
                oddCount++;
        }
        if(oddCount>1)
            return 0;
        return 1;
    }
}