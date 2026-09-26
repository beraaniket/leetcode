class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int n = s.length();
        Map<String, String> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        int i = 0;
        while(i < n){
            char c = s.charAt(i);
            if(c == '('){
                i++;
                StringBuilder key = new StringBuilder();
                while(i < n && s.charAt(i) != ')'){
                    key.append(s.charAt(i));
                    i++;
                }
                String keyStr = key.toString();
                result.append(map.getOrDefault(keyStr, "?"));
            }
            else{
                result.append(c);
            }
            i++;
        }
        return result.toString();
    }
}