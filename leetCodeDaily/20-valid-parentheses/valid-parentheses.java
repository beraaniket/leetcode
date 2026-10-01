class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            if(st.size() > 0 && 
                (st.peek() == '(' && s.charAt(i) == ')' ||
                st.peek() == '{' && s.charAt(i) == '}' ||
                st.peek() == '[' && s.charAt(i) == ']')){
                    st.pop();
            }
            else{
                st.push(c);
            }
        }
        return st.size() == 0;
    }
}