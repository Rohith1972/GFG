// User function Template for Java
class Solution {
    static String timeGap(String st, String et) {
        String[] startParts = st.split(":");
        int sh = Integer.parseInt(startParts[0]);
        int sm = Integer.parseInt(startParts[1]);
        int ss = Integer.parseInt(startParts[2]);
        String[] endParts = et.split(":");
        int eh = Integer.parseInt(endParts[0]);
        int em = Integer.parseInt(endParts[1]);
        int es = Integer.parseInt(endParts[2]);
        int startSec = sh * 3600 + sm * 60 + ss;
        int endSec = eh * 3600 + em * 60 + es;
        int diff = endSec - startSec;
        int h = diff / 3600;
        diff %= 3600;
        int m = diff / 60;
        int s = diff % 60;
        return String.format("%02d:%02d:%02d", h, m, s);
    }
}
