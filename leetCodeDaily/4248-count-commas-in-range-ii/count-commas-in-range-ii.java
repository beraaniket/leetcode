class Solution {
    public long countCommas(long n) {
        long result = 0;
        long num = 1000;
        while(num <= n){
            result += n - num + 1;
            num *= 1000;
        }
        return result;
    }
}