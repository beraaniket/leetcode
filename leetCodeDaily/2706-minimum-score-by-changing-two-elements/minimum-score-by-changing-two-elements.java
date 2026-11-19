class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        if(n <= 3) return 0;
        Arrays.sort(nums);
        int a = Math.abs(nums[n - 1] - nums[2]);
        int b = Math.abs(nums[0] - nums[n - 3]);
        int c = Math.abs(nums[n - 2] - nums[1]);
        return Math.min(Math.min(a, b) , c);
    }
}