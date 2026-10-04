class Solution {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public String gcdOfStrings(String str1, String str2) {
        int result = gcd(str1.length(), str2.length());
        String concat1 = str1 + str2;
        String concat2 = str2 + str1;
        if(concat1.equals(concat2)) 
            return str1.substring(0, result);
        else return "";
    }
}