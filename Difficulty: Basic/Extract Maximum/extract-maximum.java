class Solution {
    static int extractMaximum(String S) {
        if (S == null || S.isEmpty())
            return -1;
        int maxNum = -1;
        StringBuffer obj = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (Character.isDigit(ch)) {
                obj.append(ch);
            } else {
                if (obj.length() > 0) { 
                    int num = Integer.parseInt(obj.toString());
                    maxNum = Math.max(maxNum, num);
                    obj.setLength(0); 
                }
            }
        }
        if (obj.length() > 0) {
            int num = Integer.parseInt(obj.toString());
            maxNum = Math.max(maxNum, num);
        }
        return maxNum;
    }
}
