class Solution {
    public int[] plusOne(int[] digits) {
        int idx = -1;
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
                idx = i;
            }
            else break;
        }
        if(idx == 0){
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int i = 1; i < result.length; i++){
                result[i] = 0;
            }
            return result;
        }
        else if(idx > 0){
            digits[idx - 1] += 1;
        }
        else{
            digits[digits.length - 1] += 1;
        }
        return digits;
    }
}