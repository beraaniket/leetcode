class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int cheap = Integer.MAX_VALUE;
        int[] copies = new int[n];
        for(int i = 0; i < n; i++){
            cheap = Math.min(cheap, items[i][1]);

            int copy = 0;
            for(int j = 0; j < n; j++){
                if(i == j)
                    continue;
                if(items[j][0] % items[i][0] == 0)
                    copy++;
            }
            copies[i] = copy;
        }

        int[][] t = new int[n + 1][budget + 1];

        for (int b = 0; b <= budget; b++) {
            t[0][b] = b / cheap;
        }

        for(int i = 1; i <= n; i++){
            for(int b = 0; b <= budget; b++){
                int price = items[i - 1][1];
                int take = 0;

                if(price <= b){
                    take = 1 + copies[i - 1] + t[i - 1][b - price];
                }

                int skip = t[i - 1][b];

                t[i][b] = Math.max(take, skip);
            }
        }
        return t[n][budget];
    }
    // private int solve(int n, int budget, int cheap, int[][] items, int[] copies){
    //     if(n == 0){
    //         return budget / cheap;
    //     }

    //     int take = 0;
    //     int price = items[n - 1][1];

    //     if(price <= budget)
    //         take = 1 + copies[n - 1] + solve(n - 1, budget - price, cheap, items, copies);
        
    //     int skip = solve(n - 1, budget, cheap, items, copies);

    //     return Math.max(take, skip);
    // }
}