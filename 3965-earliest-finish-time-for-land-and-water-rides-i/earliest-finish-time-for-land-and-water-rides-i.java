class Solution {
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {
        int land = Integer.MAX_VALUE;
        int water = Integer.MAX_VALUE;
        int landFirst = Integer.MAX_VALUE;
        int waterFirst = Integer.MAX_VALUE;
        for(int i = 0; i < ls.length; i++){
            land = Math.min(land,ls[i] + ld[i]);
        }
        for(int i = 0; i < ws.length; i++){
            water = Math.min(water,ws[i] + wd[i]);
            landFirst = Math.min(landFirst, Math.max(land,ws[i]) + wd[i]);
        }
        for(int i = 0; i < ls.length; i++){
            waterFirst = Math.min(waterFirst,Math.max(water,ls[i]) + ld[i]);
        }
        return Math.min(landFirst,waterFirst);
    }
}