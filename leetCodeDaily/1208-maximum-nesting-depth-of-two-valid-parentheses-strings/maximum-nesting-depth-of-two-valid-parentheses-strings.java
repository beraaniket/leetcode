class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] result = new int[n];
        int depth = 0;
        int j = 0;
        for(int i = 0; i < n; i++){
            if(seq.charAt(i) == '('){
                depth++;
                if(depth % 2 == 0)
                    result[j++] = 0;
                else
                    result[j++] = 1;
            }
            else{
                if(depth % 2 == 0)
                    result[j++] = 0;
                else
                    result[j++] = 1;
                depth--;
            }
        }
        return result;
    }
}