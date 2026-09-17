class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;

        int i = 0;
        int j = 0;
        int currSum = 0;

        int[] minBestLenIdxTillLen = new int[n];
        Arrays.fill(minBestLenIdxTillLen, Integer.MAX_VALUE);

        int bestMinLen = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        while(j < n){
            currSum += arr[j];
            while(i < j && currSum > target){
                currSum -= arr[i++];
            }
            if(currSum == target){
                int len = j - i + 1;
                if(i > 0 && minBestLenIdxTillLen[i - 1] != Integer.MAX_VALUE)
                    result = Math.min(result, len + minBestLenIdxTillLen[i - 1]);
                bestMinLen = Math.min(bestMinLen, len);
            }
            minBestLenIdxTillLen[j] = bestMinLen;
            j++;
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}