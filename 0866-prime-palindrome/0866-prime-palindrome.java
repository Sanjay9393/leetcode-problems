class Solution {
    private int ispalindrome(int n) {
        int rev = n ;
        int temp = n ;
        temp/=10 ;
        while(temp>0) {
            int dig = temp%10 ;
            rev = (rev*10) + dig ;
            temp/=10 ;
        }
        return rev ;
    }
    private boolean isprime(int n) {
        if(n<=1) return false ;
        if(n==2) return true ;
        if(n%2==0) return false ;
        for(int i=3 ; i*i<=n ; i+=2) {
            if(n%i==0) {
                return false ;
            }
        }
        return true ;
    }
    public int primePalindrome(int n) {
        if (n >=8 && n <=11)
            return 11;
        for(int i=1 ; i<=100000 ; i++){
            int num = ispalindrome(i) ;
            if(num>=n && isprime(num)) {
                return num ;
            }
        }
        return -1 ;
    }
}