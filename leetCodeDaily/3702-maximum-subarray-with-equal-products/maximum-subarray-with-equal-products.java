class Solution {
    public int maxLength(int[] nums) {
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int product = nums[i];
            int gcdValue = nums[i];
            int lcmValue = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                product *= nums[j];
                gcdValue = findGCD(gcdValue, nums[j]);
                lcmValue = (lcmValue * nums[j]) / findGCD(lcmValue, nums[j]);
                if(product > gcdValue * lcmValue){
                    break;
                }
                if(product == gcdValue * lcmValue){
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return findGCD(b, a % b);
    }
}