class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        int i = 1;
        while(i < arr.length){
            if(arr[i] - arr[i - 1] <= 1){
                i++;
            }
            else{
                arr[i] = arr[i - 1] + 1;
                i++;
            }
        }
        return arr[arr.length - 1];
    }
}