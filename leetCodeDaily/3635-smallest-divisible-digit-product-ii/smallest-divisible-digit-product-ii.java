class Solution {
    public String smallestNumber(String num, long t) {
        int n = num.length();

        long temp = t;
        for(int primeFact : new int[]{2, 3, 5, 7}){
            while(temp % primeFact == 0){
                temp /= primeFact;
            }
        }
        if(temp != 1){
            return "-1";
        }
        long[] ramainingFactor = new long[n + 1];
        ramainingFactor[0] = t;
        for(int i = 0; i < n; i++){
            int digit = num.charAt(i) - '0';
            if(digit == 0){
                break;
            }
            ramainingFactor[i + 1] = ramainingFactor[i] / gcd(ramainingFactor[i], digit);
        }
        if(ramainingFactor[n] == 1){
            return num;
        }
        int zeroPos = num.indexOf('0');
        int zeroIdx = n - 1;
        if(zeroPos != -1){
            zeroIdx = zeroPos;
        }
        for(int i = zeroIdx; i >= 0; i--){
            long required = ramainingFactor[i];
            int freeSlots = n - 1 - i;

            for(int digit = (num.charAt(i) - '0') + 1; digit <= 9; digit++){
                long furtherRequired = required / gcd(required , digit);
                String requiredNum = freeSlotsFiller(furtherRequired, freeSlots);

                if(requiredNum.length() == freeSlots){
                    return num.substring(0, i) + (char)(digit + '0') + requiredNum;
                }
            }
        }
        return freeSlotsFiller(t, n + 1);
    }
    private String freeSlotsFiller(long required, int length){
        StringBuilder str = new StringBuilder();
        for(int digit = 9; digit >= 2; digit--){
            while(required % digit == 0){
                str.append((char)(digit + '0'));
                required /= digit;
            }
        }
        while(str.length() < length){
            str.append('1');
        }
        str.reverse();
        return str.toString();
    }
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}