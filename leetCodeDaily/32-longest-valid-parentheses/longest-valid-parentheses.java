class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        if(n < 2) return 0;
        int max = 0;
        int open = 0;
        int close = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            if(close > open){
                open = 0;
                close = 0;
            }
            else if(open == close){
                max = Math.max(max, open + close);
            }
        }
        open = 0;
        close = 0;
        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            if(open > close){
                open = 0;
                close = 0;
            }
            else if(open == close){
                max = Math.max(max, open + close);
            }
        }
        return max;
    }
}