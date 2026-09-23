class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int k = -x;
        for(int i = 0; i < n; i++){
            k += nums[i];
        }
        if (k < 0) return -1;
        Map<Integer, Integer> preSumMap = new HashMap<>();
        preSumMap.put(0, -1);
        int sum = 0;
        int maxLen = (k == 0) ? 0 : -1;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            preSumMap.putIfAbsent(sum, i);
        }
        return maxLen == -1 ? -1 : n - maxLen;
    }
}