class Solution {
    Map<String , long[]> map;
    public long totalWaviness(long num1, long num2) {
        return getWaves(num2) - getWaves(num1 - 1);
    }
    public long getWaves(long num){
        map = new HashMap<>();
        String s = Long.toString(num);
        if(s.length() < 3) return 0;

        long[] ans = solve(s, 0, true, -1, -1, true);
        return ans[1]; 
    }
    public long[] solve(String num, int idx, boolean isBound, int prePrev, int prev, boolean isLeadingZero){
        if(idx == num.length()){
            return isLeadingZero ? new long[]{0,0} : new long[]{1,0};
        }

        String key = idx + "#" + isBound + "#" + prePrev + "#" + prev + "#" + isLeadingZero;
        if(map.containsKey(key)) return map.get(key);

        int upper = isBound ? num.charAt(idx) - '0' : 9;
        long totalCount = 0L, totalWaves = 0L;

        for(int i = 0; i <= upper; i++){
            int wave = 0;
            int nextPrePrev, nextPrev;

            if(isLeadingZero){
                nextPrePrev = -1;
                nextPrev = (i == 0) ? -1 : i;
            }
            else{
                nextPrePrev = prev;
                nextPrev = i;

                if(prePrev >= 0 && prev >= 0){
                    if((prev > prePrev && prev > i) || (prev < prePrev && prev < i))
                        wave = 1;
                }
            }

            boolean nextBound = isBound && (i == upper);
            boolean nextLeadingZero = isLeadingZero && (i == 0);

            long[] sub = solve(num, idx + 1, nextBound, nextPrePrev, nextPrev, nextLeadingZero);

            totalCount += sub[0];
            totalWaves += sub[1] + sub[0] * wave;
        }
        long[] result = {totalCount , totalWaves};
        map.put(key, result);
        return result;
    }
}