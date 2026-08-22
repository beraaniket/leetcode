class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int num = n;
        while(num > 0){
            int ld = num % 10;
            sum += ld;
            product *= ld;
            num /= 10;
        }
        sum += product;
        if(n % sum == 0){
            return true;
        }
        return false;
    }
}