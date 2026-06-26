class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if (len == 1 && flowerbed[0] == 0) {
            return ((n - 1) <= 0);
        } else if (len == 1 && flowerbed[0] == 1) {
            return (n <= 0);
        }
        for (int i = 0; i < len; i++) {
            boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
            boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

            if (flowerbed[i] == 0 && leftEmpty && rightEmpty) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return (n <= 0);
    }
}