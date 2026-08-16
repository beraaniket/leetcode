class Solution {
    public boolean stoneGameIX(int[] stones) {
        int n = stones.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++){
            if(stones[i] % 3 == 0){
                count0++;
            }
            else if(stones[i] % 3 == 1){
                count1++;
            }
            else{
                count2++;
            }
        }
        if(count0 % 2 == 0){
            return ((count1 >= 1 && count2 >= 1) && (count2 >= count1 || count1 >= count2));
        }
        return (Math.abs(count1 - count2) >= 3);
    }
}