class Solution {
    static final long Modulo = 1000000007 ;
    public int countGoodNumbers(long n) {
        long odd = n/2 ;
        long even = (n+1)/2 ;
        long res = power(5,even)*power(4,odd) % Modulo ;
        return (int)res ;
    }
    public long power(long a, long b) {
        long res = 1 ;
        while(b>0) {
            if(b%2==1) {
                res = (res*a) % Modulo ;
            }
            a = (a*a) % Modulo ;
            b/=2 ;
        }
        return res ;
    }
}