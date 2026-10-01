class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>() ;
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch) ;
            }
            else {
                if(st.isEmpty()) return false ;
                char ch1 = st.pop() ;
                if((ch==')' && ch1=='(') || (ch=='}' && ch1=='{') || (ch==']' && ch1=='[')) {
                    continue ;
                }
                else {
                    return false ;
                }
            }
        }
        return st.isEmpty() ;
    }
}