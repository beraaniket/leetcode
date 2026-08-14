class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int result = 0;
        Map<Character, Integer> mpp = new HashMap<>();

        while(j < n){
            mpp.put(s.charAt(j), mpp.getOrDefault(s.charAt(j), 0) + 1);
            while(i < j && mpp.get(s.charAt(j)) > 2){
                mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) - 1);
                i++;
            }
            result = Math.max(result, j - i + 1);
            j++;
        }
        return result;
    }
}