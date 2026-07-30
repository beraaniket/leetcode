class Solution {
    public int minimumPushes(String word) {
        int minPush = 0;
        for(int i = 0; i < word.length(); i++){
            minPush += (i / 8) + 1;
        }
        return minPush;
    }
}