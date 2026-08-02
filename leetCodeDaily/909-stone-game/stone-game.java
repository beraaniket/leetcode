class Solution {
    // public int solve(int i, int j, int[] nums, int[][] t){
    //     if(i > j){
    //         return 0;
    //     }
    //     if(j == 0){
    //         return nums[i];
    //     }
    //     if(t[i][j] != -1){
    //         return t[i][j];
    //     }
    //     int take_i = nums[i] - solve(i + 1, j, nums, t);
    //     int take_j = nums[j] - solve(i, j - 1, nums, t);
    //     return t[i][j] = Math.max(take_i, take_j);
    // }
    public boolean stoneGame(int[] piles) {
        // int n = piles.length;
        // int[][] t = new int[n][n];
        // for (int[] row : t) {
        //     java.util.Arrays.fill(row, -1);
        // }
        // return solve(0, n - 1, piles, t) > 0;
        return true;
    }
}