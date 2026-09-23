class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int k = -x;
        for(int i = 0; i < n; i++){
            k += nums[i];
        }
        if(k == 0){
            return n;
        }
        else if(k < 0){
            return -1;
        }
        int left = 0, right = 0;
        int maxLen = -1;
        int sum = nums[0];
        while(right < n){
            while(left <= right && sum >k){
                sum -= nums[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if(right < n) sum += nums[right];
        }
        return maxLen == -1 ? -1 : n - maxLen;
    }
}