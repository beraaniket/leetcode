class Solution {
    public int calcTime(int[] ls, int[] ld, int[] ws, int[] wd) {
        int land = Integer.MAX_VALUE;
        int water = Integer.MAX_VALUE;
        for(int i = 0; i < ls.length; i++){
            land = Math.min(land,ls[i] + ld[i]);
        }
        for(int i = 0; i < ws.length; i++){
            water = Math.min(water,Math.max(land,ws[i]) + wd[i]);
        }
        return water;
    }
    public int earliestFinishTime(int[] ls, int[] ld, int[] ws, int[] wd) {
        int landFirst = calcTime(ls,ld,ws,wd);
        int waterFirst = calcTime(ws,wd,ls,ld);
        return Math.min(landFirst,waterFirst);
    }
}