class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increaseCount = 1;
        int decreseCount = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            increaseCount = Math.max(increaseCount, count);
        }
        count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                count++;
            }
            else{
                count = 1;
            }
            decreseCount = Math.max(decreseCount, count);
        }
        return Math.max(increaseCount, decreseCount);
    }
}