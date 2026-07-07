class Solution {
    public long sumAndMultiply(int n) {
        long num = n;
        long sum = 0;
        long ans = 0;
        while(num > 0){
            long digit = num % 10;
            if(digit > 0){
                ans = ans * 10 + digit;
                sum += digit;
            }
            num /= 10;
        }
        num = ans;
        ans = 0;
        while(num > 0){
            long digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }
        return ans * sum;
    }
}