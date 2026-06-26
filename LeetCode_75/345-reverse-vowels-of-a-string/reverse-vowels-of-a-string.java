class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            char ch1 = arr[i];
            char ch2 = arr[j];
            if(isVowel(ch1) && isVowel(ch2)){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(!isVowel(ch1)){
                i++;
            }
            else if(!isVowel(ch2)){
                j--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                return true;
            }
        else return false;
    }
}