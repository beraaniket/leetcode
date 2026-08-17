class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = stoneValue[0];
        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + stoneValue[i];
        }
        Integer[][] memo = new Integer[n][n];
        return solve(0, n - 1, prefixSum, memo);
    }
    private int solve(int l, int r, int[] prefixSum, Integer[][] memo){
        if(l >= r){
            return 0;
        }
        if (memo[l][r] != null) {
            return memo[l][r];
        }
        int score = 0;
        for(int mid = l; mid < r; mid++){
            int leftSum = prefixSum[mid] - (l - 1 >= 0 ? prefixSum[l - 1] : 0);
            int rightSum = prefixSum[r] - prefixSum[mid];

            if(leftSum < rightSum){
                score = Math.max(score, leftSum + solve(l, mid, prefixSum, memo));
            }else if(leftSum > rightSum){
                score = Math.max(score, rightSum + solve(mid + 1, r, prefixSum, memo));
            }
            else{
                score = Math.max(score, Math.max(leftSum + solve(l, mid, prefixSum, memo), rightSum + solve(mid + 1, r, prefixSum, memo)));
            }
        }
        memo[l][r] = score;
        return score;
    }
}