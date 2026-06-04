class Solution {
    public int totalWaviness(int num1, int num2) {
        if(num2 < 100) return 0;
        int sum = 0;
        while(num1 <= num2){
            String num = Integer.toString(num1);
            for(int i = 1; i < num.length() - 1; i++){
                if(num.charAt(i) > num.charAt(i - 1) && num.charAt(i) > num.charAt(i + 1))
                sum++;
                if(num.charAt(i) < num.charAt(i - 1) && num.charAt(i) < num.charAt(i + 1))
                sum++;
            }
            num1++;
        }
        return sum;
    }
}