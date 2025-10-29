// User function Template for Java
class Solution
{
    static int greaterPower(Long a, Long b, Long m, Long n)
    {
        if (b==0&&n==0) 
            return -1; 
        if (b == 0) { 
            if (n == 0)
               return -1;
            if (m == 1) 
               return -1; 
            return 0; 
        }
        if (n == 0)
        { 
            if (a == 1) 
               return -1; 
            return 1; 
        }

        double left = b * Math.log(a);
        double right = n * Math.log(m);

        if (Math.abs(left-right)< 1e-12) 
          return -1; 
        return (left>right) ? 1 : 0;
    }
}