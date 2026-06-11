class Solution {
    int MOD = 1_000_000_007;
    private long power(long base, long exponent){
        if(exponent == 0) return 1;
        long half = power(base, exponent / 2);
        long result = (half * half) % MOD;
        if(exponent % 2 == 1){
            result = (result * base) % MOD;
        }
        return result;
    }
    private int getMaxDepth(Map<Integer,ArrayList<Integer>> mpp, int node, int parent){
        int depth = 0;
        for(int neighbor : mpp.getOrDefault(node , new ArrayList<>())){
            if(neighbor == parent) continue;
            depth = Math.max(depth, getMaxDepth(mpp,neighbor,node) + 1);
        }
        return depth;
    }
    public int assignEdgeWeights(int[][] edges) {
        Map<Integer,ArrayList<Integer>> mpp = new HashMap<>();
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            mpp.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            mpp.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        int maxDepth = getMaxDepth(mpp, 1, 0);

        return (int) power(2 , maxDepth - 1);
    }
}