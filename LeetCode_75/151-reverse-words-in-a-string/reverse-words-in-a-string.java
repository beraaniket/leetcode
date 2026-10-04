class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        int j = 0;
        for(int i = n - 1; i >= 0; i--){
            if((s.charAt(i) != ' ') && 
                (i == n - 1 || s.charAt(i + 1) == ' ')){
                    j = i;
            }
            if((i == 0 || s.charAt(i - 1) == ' ')
                && s.charAt(i) != ' '){
                result.append(s, i, j + 1).append(' ');
            }
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}