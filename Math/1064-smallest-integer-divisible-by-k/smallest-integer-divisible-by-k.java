class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k % 2 == 0 || k % 5 == 0){
            return -1;
        }
        int length = 1;
        int n = 1;
        while(n % k != 0 && length <= k){
            length++;
            n = (n % k) * 10 + 1;
        }
        return length;
    }
}