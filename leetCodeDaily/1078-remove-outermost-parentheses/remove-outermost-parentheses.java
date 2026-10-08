class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int idx = 0;
        int open = 0;
        int close = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(open == close && i > 0){
                result.append(s.substring(idx + 1, i - 1));
                idx = i;
            }
            if(s.charAt(i) == '('){
                open++;
            }
            else{
                close++;
            }
        }
        result.append(s.substring(idx + 1, n - 1));
        return result.toString();
    }
}