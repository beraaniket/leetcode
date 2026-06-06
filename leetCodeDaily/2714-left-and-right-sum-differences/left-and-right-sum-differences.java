class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        if(nums.length == 1) return new int[]{0};
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] answer = new int[n];
        leftSum[0] = 0;
        rightSum[0] = 0;
        for(int i = 1; i < n; i++){
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
            rightSum[n - 1 - i] = nums[n - i] + rightSum[n - i];
        }
        for(int i = 0; i < n; i++){
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }
}