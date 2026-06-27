class Solution {
    public int maximumLength(int[] nums) {
        Map<Long,Integer> mpp = new HashMap<>();
        int ones = 0;
        int ans = 0;
        for(int num : nums){
            mpp.put((long)num, mpp.getOrDefault((long)num,0) + 1);
            if(num == 1) ones++;
        }
        if(ones % 2 == 0) ans = ones - 1;
        else ans = ones;

        mpp.remove(1L);
        for(long key : mpp.keySet()){
            int count = 0;
            long curr = key;

            while(mpp.containsKey(curr)){
                if(mpp.get(curr) >= 2){
                    count += 2;
                }
                else{
                    count++;
                    break;
                }
                curr *= curr;
            }
            if(count % 2 == 0) count--;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}