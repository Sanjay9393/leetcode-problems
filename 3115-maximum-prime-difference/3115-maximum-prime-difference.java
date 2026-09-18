class Solution {
    public boolean isprime(int n) {
        if(n<=1) {
            return false ;
        }
        if(n==2) return true ;
        if(n%2==0) return false ;
        for(int i=3 ; i*i<=n ; i+=2) {
            if(n%i==0) {
                return false ;
            }
        }
        return true ;
    }
    public int maximumPrimeDifference(int[] nums) {
        int prime1=0,prime2=0 ;
        int n = nums.length ;
        for(int i=0 ; i<n ;i++) {
            if(isprime(nums[i])) {
                prime1=i ;
                break ;
            }
        }
        for(int i=n-1 ; i>=0 ; i--) {
            if(isprime(nums[i])){
                prime2=i ;
                break ;
            }
        }
        return Math.abs(prime1-prime2) ;
    }
}