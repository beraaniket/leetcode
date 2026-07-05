class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            high = Math.max(high, nums[i]);
        }
        if(nums.length == threshold) return high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(divisor(nums,mid,threshold)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean divisor(int[] arr, int divisor, int threshold){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += (int)Math.ceil((double)arr[i] / divisor);
        }
        return sum <= threshold;
    }
}