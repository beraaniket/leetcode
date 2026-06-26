class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        s = s.toLowerCase();
        while(i < j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if(ch1 == ch2){
                i++;
                j--;
            }
            else if(!Character.isLetterOrDigit(ch1)){
                i++;
            }
            else if(!Character.isLetterOrDigit(ch2)){
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}