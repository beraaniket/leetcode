class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<>();

        int preSum = 0;
        mpp.put(0,1);

        long validLeftPoints = 0;
        long result = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                validLeftPoints += mpp.getOrDefault(preSum , 0);
                preSum++;
            }else{
                preSum--;
                validLeftPoints -= mpp.getOrDefault(preSum , 0);
            }
            mpp.merge(preSum , 1, Integer :: sum);
            result += validLeftPoints;
        }
        return result;
    }
}