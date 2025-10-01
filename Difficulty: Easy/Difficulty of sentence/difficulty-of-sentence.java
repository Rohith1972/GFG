// User function Template for Java

class Solution {
    public int calcDiff(String s) {
        // code here
        int hardwords=0;
        int easywords=0;
        String res[] = s.split(" ");
        for(String i : res){
            int currConson=0,maxConson=0;
            char[] ch = i.toCharArray();
            int count=0;
            for(int j=0;j<ch.length;j++){
                if(isVowel(ch[j])){
                    count++;
                    currConson = 0;
                }else{
                    currConson++;
                    maxConson = Math.max(maxConson,currConson);
                }
            }
            int consonants = ch.length-count;
            if(consonants>count||maxConson>=4)
                hardwords++;
            else
                easywords++;
        }
        return 5*hardwords+3*easywords;
    }
    static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            return true;
        return false;
    }
}