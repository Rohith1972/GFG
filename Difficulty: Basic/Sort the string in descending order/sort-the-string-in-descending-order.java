// User function Template for Java
class Solution {
    String ReverseSort(String s) {
        // code here
        ArrayList<Character> res = new ArrayList<>();
        char ch[] = s.toCharArray();
        for(char c : ch){
            res.add(c);
        }
        Collections.sort(res,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (char c : res) {
            sb.append(c);
        }
        return sb.toString();
    }
}