class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = n - 1; i >= 0; i--){
            int result = Integer.MIN_VALUE;

            result = stoneValue[i] - a;

            if(i + 2 <= n){
                result = Math.max(result, stoneValue[i] + stoneValue[i + 1] - b);
            }
            if(i + 3 <= n){
                result = Math.max(result, stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - c);
            }
            c = b;
            b = a;
            a = result;
        }
        int diff = a;
        if(diff > 0){
            return "Alice";
        }
        else if(diff < 0){
            return "Bob";
        }
        else{
            return "Tie";
        }
    }
}