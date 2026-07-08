class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if(k > n) return -1;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < n; i++){
            low = Math.max(nums[i], low);
            high += nums[i];
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            int subArr = getSubarray(nums, mid);
            if(subArr > k) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }
    public int getSubarray(int[] arr, int subArr){
        int subArray = 1;
        long maxEl = 0;
        for(int i = 0; i < arr.length; i++){
            if(maxEl + arr[i] <= subArr){
                maxEl += arr[i];
            }
            else{
                subArray++;
                maxEl = arr[i];
            }
        }
        return subArray;
    }
}