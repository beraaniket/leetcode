class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int largest = Integer.MIN_VALUE;
        for(int num : nums){
            mpp.merge(num, 1, Integer :: sum);
            largest = Math.max(largest, num);
        }
        if (k == 1) {
        Integer max = null;
        for (int num : nums) {
            if (mpp.get(num) == 1 && (max == null || num > max)) {
                    max = num;
                }
            }
            return max == null ? -1 : max;
        }
        else if(k == n){
            return largest;
        }
        else{
            if(mpp.get(nums[0]) == 1 && mpp.get(nums[n - 1]) == 1){
                return Math.max(nums[0], nums[n - 1]);
            }
            else if(mpp.get(nums[0]) == 1 && mpp.get(nums[n - 1]) > 1){
                return nums[0];
            }
            else if(mpp.get(nums[0]) > 1 && mpp.get(nums[n - 1]) == 1){
                return nums[n - 1];
            }
            else return -1;
        }
    }
}