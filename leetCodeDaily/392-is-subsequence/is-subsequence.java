class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int n = t.length();
        int m = s.length();
        if(m == 0) return true;
        if(m > n) return false;
        while(i < n){
            if(t.charAt(i) == s.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
            if(j >= m){
                return true;
            }
        }
        return false;
    }
}