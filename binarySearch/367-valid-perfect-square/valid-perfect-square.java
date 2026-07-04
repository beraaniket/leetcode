class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num / 2;
        if(num == 1) return true;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long val = 1L * mid * mid;
            if(val == num) return true;
            else if(val < num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}