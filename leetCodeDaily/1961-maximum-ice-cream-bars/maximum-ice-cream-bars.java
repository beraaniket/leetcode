class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int spent = 0;
        for(int cost : costs){
            if(cost <= coins){
                coins -= cost;
                spent++;
            }
        }
        return spent;
    }
}