class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = stones[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = stones[i] + prefixSum[i - 1];
        }
        int[] mem = new int[n];
        mem[n - 1] = prefixSum[n - 1];
        for (int i = n - 2; i >= 1; i--) {
            int take = prefixSum[i] - mem[i + 1];
            int skip = mem[i + 1];
            mem[i] = Math.max(take, skip);
        }
        return mem[1];
    }
}