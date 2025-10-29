class Solution {
    public double getAngle(String s) {
        // code here
        String s1 = s.substring(0,2);
        String s2 = s.substring(3,5);
        int H = Integer.parseInt(s1);
        int M = Integer.parseInt(s2);
        H%=12;
        double HA = 30*H + 0.5*M;
        double MA = 6*M;
        double d = Math.abs(HA-MA);
        double res = Math.min(d,360-d);
        return res;
    }
}