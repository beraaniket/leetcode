class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        int smallCount = 0;
        int equalCount = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                equalCount++;
            }
            else if(nums[i] < target){
                smallCount++;
            }
        }
        for(int i = 0; i < equalCount; i++){
            result.add(smallCount + i);
        }
        return result;
    }
}