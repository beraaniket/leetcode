class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int result = 0;
        Map<Integer, Integer> mpp = new HashMap<>();

        while(j < n){
            mpp.put(nums[j], mpp.getOrDefault(nums[j], 0) + 1);
            while(i < j && mpp.get(nums[j]) > k){
                mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) - 1);
                i++;
            }
            result = Math.max(result, j - i + 1);
            j++;
        }
        return result;
    }
}