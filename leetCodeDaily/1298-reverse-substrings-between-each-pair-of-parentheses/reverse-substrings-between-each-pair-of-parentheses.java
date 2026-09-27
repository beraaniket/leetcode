class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(')
                stack.push(i);
            else if(ch == ')'){
                int start = stack.pop();
                reverse(sb, start + 1, i - 1);
            }
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        while(i < n){
            char ch = sb.charAt(i);
            if(ch != '(' && ch != ')')
                result.append(ch);
            i++;
        }
        return result.toString();
    }
    private void reverse(StringBuilder sb, int left, int right){
         while (left < right) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
    }
}