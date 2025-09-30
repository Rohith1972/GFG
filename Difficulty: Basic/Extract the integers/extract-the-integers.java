// User function Template for Java
class Solution {
    ArrayList<String> extractIntegerWords(String s) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        String num = "";
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                String temp = String.valueOf(s.charAt(i));
                num = num.concat(temp);
            }
            else{
                if(!num.isEmpty()){
                    res.add(num);
                    num="";
                }
            }
        }
        if(!num.isEmpty()){
            res.add(num);
            num="";
        }
        return res;
    }
}