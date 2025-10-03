// User function Template for Java

class Solution {
    static String isStringExist(String arr[], int N, String S) {
        // code here
        int n = S.length();
        String res;
        for(int i=0;i<N;i++){
            if(arr[i].length()==n){
                if(check(arr[i],S)){
                    return new String("True");
                }
            }   
        }
        return new String("False");
    }
    static boolean check(String s1,String s2){
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        int count=0;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                count++;
            }
            if(count>1)
                return false;
        }
        return true;
    }
}