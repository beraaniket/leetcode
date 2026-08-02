class Solution {
    int[][] t = new int[23][23];
    public int solve(int i, int j, int[] nums){
        if(i > j){
            return 0;
        }
        if(j == 0){
            return nums[i];
        }
        if(t[i][j] != -1){
            return t[i][j];
        }
        int take_i = nums[i] - solve(i + 1, j,nums);
        int take_j = nums[j] - solve(i, j - 1,nums);
        return t[i][j] = Math.max(take_i, take_j);
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        for (int[] row : t) {
            java.util.Arrays.fill(row, -1);
        }
        return solve(0, n - 1, nums) >= 0;
    }
}