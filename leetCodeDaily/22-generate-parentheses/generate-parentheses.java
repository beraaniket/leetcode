class Solution {
    List<String> result = new ArrayList<>();
    private void solve(String curr, int n, int open, int close){
        if(curr.length() == 2 * n){
            result.add(curr);
            return;
        }
        if(open < n){
            curr += '(';
            solve(curr, n, open + 1, close);
            curr = curr.substring(0, curr.length() - 1);
        }
        if(close < open){
            curr += ')';
            solve(curr, n, open, close + 1);
            curr = curr.substring(0, curr.length() - 1);
        }
    }
    public List<String> generateParenthesis(int n) {
        String curr = "";
        int open = 0;
        int close = 0;
        solve(curr, n, open, close);
        return result;
    }
}