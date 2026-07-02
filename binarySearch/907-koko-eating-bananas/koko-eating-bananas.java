class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > max) max = piles[i];
        }
        int low = 1, high = max;
        int ans = max;
        while(low <= high){
            int mid = (low + high) / 2;
            long totalHour = totalHr(piles,mid);
            if(totalHour <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public long totalHr(int[] arr, int hour){
        long totalHour = 0;
        for(int i = 0; i < arr.length; i++){
            totalHour += (long)Math.ceil((arr[i] + (long)hour - 1) / hour);
        }
        return totalHour;
    }
}