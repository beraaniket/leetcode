class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int sum = nums[0];
        if(n == 1) return 0;
        for(int i = 1; i < n; i++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }
        return (max * n) - sum;
    }
}