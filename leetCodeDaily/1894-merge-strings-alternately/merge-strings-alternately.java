class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int i = 0;
        int j = 0;
        int min = Math.min(word1.length(),word2.length());
        while(i < min){
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < word1.length()){
            str.append(word1.charAt(i));
            i++;
        }
        while(j < word2.length()){
            str.append(word2.charAt(j));
            j++;
        }
        return str.toString();
    }
}