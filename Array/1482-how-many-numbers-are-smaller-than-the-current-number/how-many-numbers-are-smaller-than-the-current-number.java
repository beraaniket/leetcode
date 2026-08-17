class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        for(int i = 0; i < n; i++){
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(copy[0],0);
        for(int i = 1; i < n; i++){
            if(copy[i] == copy[i - 1]){
                mp.put(copy[i],mp.get(copy[i - 1]));
            }
            else mp.put(copy[i],i);
        }
        for(int i = 0; i < n; i++){
            nums[i] = mp.get(nums[i]);
        }
        return nums;
    }
}