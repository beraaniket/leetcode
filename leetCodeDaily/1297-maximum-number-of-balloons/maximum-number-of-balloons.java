class Solution {
    public int maxNumberOfBalloons(String text) {
        int count = 0;
        int a = 0,b = 0,l = 0, n = 0,o = 0;
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a') a++;
            else if(text.charAt(i) == 'b') b++;
            else if(text.charAt(i) == 'l') l++;
            else if(text.charAt(i) == 'n') n++;
            else if(text.charAt(i) == 'o') o++;
        }
        // while(a >= 1 && b >= 1 && l >= 2 && n >= 1 && o >= 2){
        //     count++;
        //     a--;
        //     b--;
        //     l -= 2;
        //     n--;
        //     o -= 2;
        // }
        count = Math.min(a,Math.min(b,Math.min(l/2,Math.min(n,o/2))));
        return count;
    }
}