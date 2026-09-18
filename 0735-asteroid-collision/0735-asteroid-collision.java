class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>() ;
        for(int num : asteroids) {
            if(num>0) {
                st.push(num) ;
            }
            else {
                while(!st.isEmpty() && st.peek()>0 && st.peek()<-num) {
                    st.pop() ;
                }
                if(st.isEmpty() || st.peek()<0) {
                    st.push(num) ;
                }
                if(st.peek()==-num) {
                    st.pop() ;
                }
            }
        }
        int n = st.size() ;
        int[] res = new int[n] ;
        int k = n-1 ;
        while(!st.isEmpty()) {
            res[k--] = st.pop() ;
        }
        return res ;
    }
}