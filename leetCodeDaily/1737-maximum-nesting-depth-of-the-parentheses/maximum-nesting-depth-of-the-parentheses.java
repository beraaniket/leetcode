class Solution {
    public int maxDepth(String s) {
        int leftBracet = 0;
        int rightBracet = 0;
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(')
                leftBracet++;
            if(ch == ')')
                rightBracet++;
            result = Math.max(result, leftBracet - rightBracet);   
        }
        return result;
    }
}