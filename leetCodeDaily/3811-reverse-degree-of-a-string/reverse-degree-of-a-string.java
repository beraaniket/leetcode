class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for(int i = 1; i <= s.length(); i++){
            int degree = i * (26 - (s.charAt(i - 1) - 'a'));
            result += degree;
        }
        return result;
    }
}