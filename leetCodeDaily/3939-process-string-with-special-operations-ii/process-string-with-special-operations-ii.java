class Solution {
    public char processStr(String s, long k) {
        long len = 0;
        for(char ch : s.toCharArray()){
            if(ch == '*'){
                if(len > 0) len--;
            }
            else if(ch == '#') len *= 2;
            else if(ch >= 'a' && ch <= 'z') len += 1;
        }
        if(len <= k) return '.';
        int n = s.length();
        for(int i = n - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '*') len++;
            else if(ch == '#'){
                len /= 2;
                if(k >= len) k -= len;
            }
            else if(ch == '%'){
                k = len - 1 - k;
            }
            else{
                len--;
                if(k == len) return ch;
            }
        }
        return '.';
    }
}