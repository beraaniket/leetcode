/*class Solution {
    public int pivotInteger(int n) {
       for(int i = 1; i <= n; i++){
        if(((n * (n + 1) / 2) - (i * ( i - 1) / 2)) == i * (i + 1) / 2){
            return i;
        }
       }
       return -1;
    }
}
*/
class Solution {
    public int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        int pivot = (int)Math.sqrt(sum);
        return pivot * pivot == sum ? pivot : -1;
    }
}