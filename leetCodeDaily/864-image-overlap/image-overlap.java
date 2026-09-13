class Solution {
    private int countOverlap(int[][] img1, int[][] img2, int rowOff, int colOff){
        int n = img1.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int img_i = i + rowOff;
                int img_j = j + colOff;
                if(img_i < 0 || img_i >= n || img_j < 0 || img_j >= n)
                    continue;
                if(img2[i][j] == 1 && img1[img_i][img_j] == 1)
                    count++;
            }
        }
        return count;
    }
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;
        int maxOverlap = 0;
        for(int rowOff = - n + 1; rowOff < n; rowOff++){
            for(int colOff = - n + 1; colOff < n; colOff++){
                int count = countOverlap(img1, img2, rowOff, colOff);
                maxOverlap = Math.max(maxOverlap, count);
            }
        }
        return maxOverlap;
    }
}