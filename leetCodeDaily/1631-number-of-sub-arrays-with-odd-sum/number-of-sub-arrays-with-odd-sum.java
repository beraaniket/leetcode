class Solution {
    public int numOfSubarrays(int[] arr) {
        int M = 1000000007;
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int count = 0;
        int oddCount = 0;
        int evenCount = 1;

        for(int i = 0; i < n; i++){
            if(prefixSum[i] % 2 == 0){
                count = (count + oddCount) % M;
                evenCount++;
            }
            else{
                count = (count + evenCount) % M;
                oddCount++;
            }
        }
        return count;
    }
}