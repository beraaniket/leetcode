class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int count = 0;
        int result = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else{
                if(count > 0){
                    count--;
                }
                else{
                    result++;
                }
                if(i + 1 < n && s.charAt(i + 1) == ')'){
                    i++;
                }
                else{
                    result++;
                }
            }
        }
        result += (2 * count);
        return result;
    }
}