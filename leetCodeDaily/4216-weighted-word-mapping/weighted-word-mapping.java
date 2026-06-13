class Solution {
    int stringModValue(String s,int[] weights){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += weights[s.charAt(i) - 'a'];
        }
        return (sum % 26);
    }
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < words.length; i++){
            int idx = stringModValue(words[i],weights);
            ans.append((char)('z' - idx));
        }
        return ans.toString();
    }
}