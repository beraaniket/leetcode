class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if(n <= 2) return n;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx = -1;
        int maxIdx = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIdx = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIdx = i;
            }
        }
        int deleteFront = 0;
        int deleteBack = 0;
        int deleteBoth = 0;
        if(maxIdx > minIdx){
            deleteFront = maxIdx + 1;
            deleteBack = n - minIdx;
            deleteBoth = (minIdx + 1) + (n - maxIdx);
        }
        else{
            deleteFront = minIdx + 1;
            deleteBack = n - maxIdx;
            deleteBoth = (maxIdx + 1) + (n - minIdx);
        }
        return Math.min(deleteFront, Math.min(deleteBack, deleteBoth));
    }
}