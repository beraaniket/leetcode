class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = Integer.MIN_VALUE, high = 0;
        int n = weights.length;
        for(int i = 0; i < n; i++){
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(daysRequired(weights, mid) > days){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public int daysRequired(int[] arr, int cap){
        int days = 1, load = 0;
        for(int i = 0; i < arr.length; i++){
            if(load + arr[i] > cap){
                days++;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }
        return days;
    }
}