class Solution {
    String result = "";
    boolean solve(StringBuilder curr, Map<Character, Integer> map, String target, int i, boolean grater){
        if(i == target.length()){
            if(grater){
                result = curr.toString();
                return true;
            }
            return false;
        }
        for(char ch : map.keySet()){
            if(map.get(ch) == 0){
                continue;
            }
            if(grater == false && ch < target.charAt(i)){
                continue;
            }
            curr.append(ch);
            map.put(ch, map.getOrDefault(ch, 0) - 1);

            boolean isGrater = grater || ch > target.charAt(i);
            if(solve(curr, map, target, i + 1, isGrater)){
                return true;
            }
            curr.deleteCharAt(curr.length() - 1);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return false;
    }
    public String lexGreaterPermutation(String s, String target) {
        Map<Character, Integer> map = new TreeMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder curr = new StringBuilder();
        solve(curr, map, target, 0, false);
        return result;
    }
}