class Solution {
    private boolean selfDeviding(int n){
        int num = n;
        while(num > 0){
            int ld = num % 10;
            if(ld == 0 || n % ld != 0){
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(selfDeviding(i)){
                list.add(i);
            }
        }
        return list;
    }
}