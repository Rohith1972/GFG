
class Solution {
    public String longest(List<String> arr) {
        // code here
        String res = "";
        int max = -1;
        for(int i=0;i<arr.size();i++){
            String var = arr.get(i);
            if(var.length()>max){
                max = var.length();
                res = var;
            }
        }
        return res;
    }
}
