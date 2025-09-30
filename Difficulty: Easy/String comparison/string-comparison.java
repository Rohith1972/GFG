
class Solution {
    public static int stringComparison(String s1, String s2) {
        // code here
        HashMap<String,Integer> priority = new HashMap<>();
        priority.put("a",1);
        priority.put("b", 2);
        priority.put("c", 3);
        priority.put("d", 4);
        priority.put("e", 5);
        priority.put("f", 6);
        priority.put("g", 7);
        priority.put("h", 8);
        priority.put("i", 9);
        priority.put("j", 10);
        priority.put("k", 11);
        priority.put("l", 12);
        priority.put("m", 13);
        priority.put("n", 14);
        priority.put("ng", 15);   
        priority.put("o", 16);
        priority.put("p", 17);
        priority.put("q", 18);
        priority.put("r", 19);
        priority.put("s", 20);
        priority.put("t", 21);
        priority.put("u", 22);
        priority.put("v", 23);
        priority.put("w", 24);
        priority.put("x", 25);
        priority.put("y", 26);
        priority.put("z", 27);
        int n = s1.length();
        int m = s2.length();
        int i=0,j=0;
        while(i<n&&j<m){
            String one;
            if(i<n-1 && s1.charAt(i)=='n' && s1.charAt(i+1)=='g'){
                one = "ng";
                i+=2;
            }
            else{
                one = String.valueOf(s1.charAt(i));
                i++;
            }
            String two;
            if(j<m-1 && s2.charAt(j)=='n' && s2.charAt(j+1)=='g'){
                two = "ng";
                j+=2;
            }
            else{
                two = String.valueOf(s2.charAt(j));
                j++;
            }
            if(priority.get(one)>priority.get(two))
                return 1;
            if(priority.get(one)<priority.get(two))
                return -1;
        }
        if (i < n) 
            return 1;
        if (j < m)
            return -1;
        return 0;
    }
}
