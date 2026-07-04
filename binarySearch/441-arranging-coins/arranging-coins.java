class Solution {
    public int arrangeCoins(int n) {
        int low = 1, high = n;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long val = 1L * mid * (mid + 1) / 2;
            if(val == n) return mid;
            else if(val < n){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }
}