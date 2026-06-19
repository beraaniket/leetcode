class Solution {
    public int largestAltitude(int[] gains) {
        int sum = 0;
        int max = 0;
        for(int gain : gains){
            sum += gain;
            max = Math.max(sum,max);
        }
        return max;
    }
}