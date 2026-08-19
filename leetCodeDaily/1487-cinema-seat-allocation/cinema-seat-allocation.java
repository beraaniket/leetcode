class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int[] reserved : reservedSeats){
            int row = reserved[0];
            int seat = reserved[1];
            mpp.merge(row, (1 << seat), (a, b) -> a | b);
        }
        int result = (n - mpp.size()) * 2;

        int maskA = (1 << 2) | (1 << 3) | (1 << 4) | (1 << 5);
        int maskB = (1 << 4) | (1 << 5) | (1 << 6) | (1 << 7);
        int maskC = (1 << 6) | (1 << 7) | (1 << 8) | (1 << 9);
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            int bookedMask = entry.getValue();

            boolean groupA = (bookedMask & maskA) == 0;
            boolean groupB = (bookedMask & maskB) == 0;
            boolean groupC = (bookedMask & maskC) == 0;
            
            if(groupA && groupC){
                result += 2;
            }
            else if(groupA || groupB || groupC){
                result += 1;
            }
        }
        return result;
    }
}