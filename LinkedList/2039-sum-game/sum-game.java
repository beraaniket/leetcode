class Solution {
    public boolean sumGame(String num) {
        int n = num.length();

        int leftSum = 0;
        int rightSum = 0;

        int leftQusMarkCount = 0;
        int rightQsMarkCount = 0;
        
        for(int i = 0; i < n; i++){
            if(num.charAt(i) == '?'){
                if(i < n / 2){
                    leftQusMarkCount++;
                }
                else{
                    rightQsMarkCount++;
                }
            }
            else{
                if(i < n / 2){
                    leftSum += num.charAt(i) - '0';
                }
                else{
                    rightSum += num.charAt(i) - '0';
                }
            }
        }
        int totalQsMarkCount = leftQusMarkCount + rightQsMarkCount;
        if(totalQsMarkCount % 2 == 1){
            return true;
        }
        int left = 2 * leftSum + 9 * leftQusMarkCount;
        int right = 2 * rightSum + 9 * rightQsMarkCount;
        if(left == right){
            return false;
        }
        else return true;
    }
}