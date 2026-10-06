class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> dq = new ArrayDeque<>() ;
        for(char ch : s.toCharArray()) {
            if(!dq.isEmpty() && ch==')' && dq.peek()=='('){
                dq.pop() ;
            }
            else {
                dq.push(ch) ;
            }
        }
        return dq.size() ;
    }
}