class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        int m = restrictions.length;
        if(m == 0) return n - 1;

        int[][] arr = new int[m + 2][2];
        for(int i = 0; i < m; i++){
            arr[i][0] = restrictions[i][0];
            arr[i][1] = restrictions[i][1];
        }

        arr[m][0] = 1;
        arr[m][1] = 0;
        arr[m + 1][0] = n;
        arr[m + 1][1] = n - 1;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int r = arr.length;
        for(int i = 1; i < r; i++){
            arr[i][1] = Math.min(arr[i][1], arr[i - 1][1] + arr[i][0] - arr[i - 1][0]);
        }

        for(int i = r - 2; i >= 1; i--){
            arr[i][1] = Math.min(arr[i][1], arr[i + 1][1] + arr[i + 1][0] - arr[i][0]);
        }
        
        int ans = 0;
        for(int i = 1; i < r; i++){
            int left = arr[i - 1][0];
            int h1 = arr[i - 1][1];

            int right = arr[i][0];
            int h2 = arr[i][1];

            int d = right - left;
            ans = Math.max(ans, (h1 + h2 + d)/2);
        }
        return ans;
    }
}