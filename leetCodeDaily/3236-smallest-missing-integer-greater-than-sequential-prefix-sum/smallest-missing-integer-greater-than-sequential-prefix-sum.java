class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int seqSum = nums[0];
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < n; i++){
            st.add(nums[i]);
        }
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i - 1] + 1){
                seqSum += nums[i];
            }
            else{
                break;
            }
        }
        while(st.contains(seqSum)){
            seqSum++;
        }
        return seqSum;

    }
}