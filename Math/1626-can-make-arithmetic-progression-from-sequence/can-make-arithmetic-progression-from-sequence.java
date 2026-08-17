/*class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int[] diff = new int[n - 1];
        for(int i = 1; i < n; i++){
            diff[i - 1] = arr[i] - arr[i - 1];
        }
        for(int i = n - 2; i >= 1; i--){
            if(diff[i] != diff[i - 1]){
                return false;
            }
        }
        return true;
    }
}
*/
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 2; i < arr.length; i++){
            if(diff != (arr[i] - arr[i - 1])){
                return false;
            }
        }
        return true;
    }
}