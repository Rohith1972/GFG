// User function Template for Java

class Sol {
    int closing(String s, int pos) {
        // your code here
        int balance=0;
        for(int i=pos;i<s.length();i++){
            if(s.charAt(i)=='[')
                balance++;
            if(s.charAt(i)==']')
                balance--;
            if(balance==0)
                return i;
        }
        return -1;
    }
}