class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int copy = x;
        int revNum = 0;
        while(x > 0){
            revNum = (revNum * 10) + (x % 10);
            x /= 10;
        }
        return copy == revNum;
    }
}