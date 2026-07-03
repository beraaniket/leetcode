class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long val = 1L * m * k;
        if(n < val) return -1;
        for(int i = 0; i < n; i++){
            max = Math.max(max, bloomDay[i]);
            min = Math.min(min, bloomDay[i]);
        }
        int low = min, high = max;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(possible(bloomDay, mid, m, k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean possible(int[] arr, int day, int m, int k){
        int count = 0;
        int bouquet = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= day){
                count++;
            }
            else{
                bouquet += (count / k);
                count = 0;
            }
        }
        bouquet += (count / k);
        return bouquet >= m;
    }
}