class Solution {
    public int numOfSubarrays(int[] arr) {
        
        int M = 1000000007;
        int n = arr.length;
        int prefixSum = 0;
        int count = 0;
        int oddCount = 0;
        int evenCount = 1;

        for(int i = 0; i < n; i++){
            prefixSum += arr[i];
            if(prefixSum % 2 == 0){
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