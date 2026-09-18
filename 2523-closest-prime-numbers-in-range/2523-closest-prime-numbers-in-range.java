class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] arr = new boolean[right+1] ;
        Arrays.fill(arr,true) ;
        arr[0] = false ;
        arr[1] = false ;
        for(int i=2 ; i*i<=right ; i++) {
            if(arr[i]==true) {
                for(int j=i*i ; j<=right ; j+=i) {
                    arr[j] = false ;
                }
            }
        }
        int pre= -1 ;
        int num1 =-1 ;
        int num2 = -1 ;
        int min = Integer.MAX_VALUE ;
        for(int i=left ; i<=right ; i++) {
            if(arr[i]==true) {
                if(pre!=-1) {
                    int gap = i-pre ;
                    if(gap<min) {
                        min = gap ;
                        num1=pre ;
                        num2 = i ;
                    }
                }
                pre=i;
            }
        }
        return new int[]{num1,num2} ;
    }
}